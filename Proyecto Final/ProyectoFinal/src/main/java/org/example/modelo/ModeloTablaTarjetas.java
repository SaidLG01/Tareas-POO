package org.example.modelo;

import org.example.persistencia.TarjetaDAO;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaTarjetas implements TableModel {
    private static final int COLUMNS = 6;
    private ArrayList<TarjetasAMD> datos;
    private TarjetaDAO tarjetaDAO;

    public ModeloTablaTarjetas() {
        datos = new ArrayList<>();
        tarjetaDAO = new TarjetaDAO();
    }

    public ModeloTablaTarjetas(ArrayList<TarjetasAMD> datos, TarjetaDAO tarjetaDAO) {
        this.datos = datos;
        this.tarjetaDAO = tarjetaDAO;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombreColumna = "";
        switch (columnIndex){
            case 0:
                nombreColumna = "Id";
                break;
            case 1:
                nombreColumna = "Modelo";
                break;
            case 2:
                nombreColumna = "Tipo";
                break;
            case 3:
                nombreColumna = "Tipo de Memoria";
                break;
            case 4:
                nombreColumna = "Frecuencia (MHz)";
                break;
            case 5:
                nombreColumna = "Foto (URL)";
                break;
            default:
                nombreColumna = "";
        }
        return nombreColumna;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return int.class;
            case 1:
                return  String.class;
            case 2:
                return  String.class;
            case 3:
                return  String.class;
            case 4:
                return Double.class;
            case 5:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TarjetasAMD tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getModelo();
            case 2:
                return tmp.getTipo();
            case 3:
                return tmp.getTipoDeMemoria();
            case 4:
                return tmp.getFrecuenciaBoost();
            case 5:
                return tmp.getUrlFoto();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                datos.get(rowIndex).setId(Integer.parseInt((String) aValue));
                break;
            case 1:
                datos.get(rowIndex).setModelo((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setTipo((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setTipoDeMemoria((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setFrecuenciaBoost( (Double) aValue);
                break;
            case 5:
                datos.get(rowIndex).setUrlFoto( (String) aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    //método agregar tarjeta a la tabla y base de datos
    public boolean agregarTarjeta(TarjetasAMD tarjeta){
        boolean resultado = false;
        try {
            if (tarjetaDAO.insertar(tarjeta)) {
                datos.add(tarjeta);
                resultado = true;
                System.out.println("Se insertó correctamente");
            }else {
                resultado = false;
                System.out.println("No se pudo insertar");
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }return resultado;

    }

    public void cargarDatos(){
        try {
            ArrayList<TarjetasAMD>  tirar = tarjetaDAO.obtenertodo();
            System.out.println(tirar);
            datos = tarjetaDAO.obtenertodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }

    }
    //eliminar
    public boolean eliminarDatos(String id){
        boolean resultado = false;
        try {
            if (tarjetaDAO.delete(id)){
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());

        }return resultado;
    }
    public boolean actualizarDatos(TarjetasAMD tarjeta){
        boolean resultado = false;
        try {
            if (tarjetaDAO.update(tarjeta)) {
                datos.add(tarjeta);
                resultado = true;
                System.out.println("Se actualizó correctamente");
            }else {
                resultado = false;
                System.out.println("No se pudo actualizar");
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }return resultado;
    }
    public TarjetasAMD getTarjetaAtIndex(int idx){
        return datos.get(idx);
    }

}
