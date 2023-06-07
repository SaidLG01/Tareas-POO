package org.example.persistencia;

import org.example.modelo.TarjetasAMD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TarjetaDAO implements InterfazDAO{

    public TarjetaDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO tarjetas(modelo, tipo, tpdmemoria, frecuencia, url) VALUES(?, ?, ?, ?, ?); ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("TarjetasDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((TarjetasAMD)obj).getModelo());
        pstm.setString(2,((TarjetasAMD)obj).getTipo());
        pstm.setString(3,((TarjetasAMD)obj).getTipoDeMemoria());
        pstm.setDouble(4,((TarjetasAMD)obj).getFrecuenciaBoost());
        pstm.setString(5,((TarjetasAMD)obj).getUrlFoto());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE tarjetas SET modelo = ?, tipo = ?, tpdmemoria = ?, frecuencia = ?, url = ? WHERE id = ? ; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("TarjetasDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((TarjetasAMD)obj).getModelo());
        pstm.setString(2,((TarjetasAMD)obj).getTipo());
        pstm.setString(3,((TarjetasAMD)obj).getTipoDeMemoria());
        pstm.setDouble(4,((TarjetasAMD)obj).getFrecuenciaBoost());
        pstm.setString(5,((TarjetasAMD)obj).getUrlFoto());
        pstm.setInt(6,((TarjetasAMD)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;

    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM tarjetas WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("TarjetasDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenertodo() throws SQLException {
        String sql = "SELECT * FROM tarjetas" ;
        ArrayList<TarjetasAMD> resultado = new ArrayList<>();

            Statement stm = ConexionSingleton.getInstance("TarjetasDB.db").getConnection().createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()){
                resultado.add(new TarjetasAMD(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getDouble(5),rst.getString(6) ));
            }
        return resultado ;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELEC * FROM tarjetas WHERE id = ? ;";
        TarjetasAMD tarjetasAMD = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("TarjetasDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1,Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            tarjetasAMD = new TarjetasAMD(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDouble(5), rst.getString(6));

            return tarjetasAMD;
        }
        return null;
    }
}
