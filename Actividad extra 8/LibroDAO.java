package org.example.persistencia;

import org.example.modelo.Libro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LibroDAO implements DAO{

    public LibroDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Libros(titulo, autor) VALUES (?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("LibrosDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((Libro)obj).getTitulo());
        pstm.setString(2,((Libro)obj).getAutor());
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Libros SET titulo = ?, autor = ? WHERE id = ? ; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("LibrosDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Libro)obj).getTitulo());
        pstm.setString(2,((Libro)obj).getAutor());
        pstm.setInt(3,((Libro)obj).getId());
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqleDelete = "DELETE FROM Libros WHERE id = ? ; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("LibrosDB.db").getConnection().prepareStatement(sqleDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Libros";
        ArrayList<Libro> resultado = new ArrayList<>();

            Statement stm = ConexionSingleton.getInstance("LibrosDB.db").getConnection().createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()){
                resultado.add(new Libro(rst.getInt(1),rst.getString(2),rst.getString(3)));
            }

        return resultado;

    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM Libros WHERE id = ? ;";
        Libro libro = null;

            PreparedStatement pstm = ConexionSingleton.getInstance("LibrosDB.db").getConnection().prepareStatement(sql);
            pstm.setInt(1,Integer.parseInt(id));
            ResultSet rst = pstm.executeQuery();
            if (rst.next()) {
                libro = new Libro(rst.getInt(1), rst.getString(2), rst.getString(3));

                return libro;
            }
            return null;
    }
}
