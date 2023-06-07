package org.example.controlador;

import org.example.modelo.ModeloTablaTarjetas;
import org.example.modelo.TarjetasAMD;
import org.example.vista.VentanaTarjeta;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;


public class ControladorTarjetas extends MouseAdapter {
    private VentanaTarjeta view;
    private ModeloTablaTarjetas modelo;

    public ControladorTarjetas(VentanaTarjeta view) {
        this.view = view;
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getTblTarjetas().addMouseListener(this);
        modelo = new ModeloTablaTarjetas();
        this.view.getTblTarjetas().setModel(modelo);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // evento boton agregar
        if (e.getSource() == view.getBtnAgregar()){
            System.out.println("Evento sobre botón agregar");
            TarjetasAMD tarjeta = new TarjetasAMD();
            tarjeta.setId(0);
            tarjeta.setId(Integer.parseInt(this.view.getTxtId().getText()));
            tarjeta.setModelo(this.view.getTxtModelo().getText());
            tarjeta.setTipo(this.view.getTxtTipo().getText());
            tarjeta.setTipoDeMemoria(this.view.getTxtTipoDeMemoria().getText());
            tarjeta.setFrecuenciaBoost(Double.parseDouble(this.view.getTxtFrecuencia().getText()));
            tarjeta.setUrlFoto(this.view.getTxtFoto().getText());
            modelo.agregarTarjeta(tarjeta);
            modelo.cargarDatos();
            this.view.getTblTarjetas().setModel(modelo);
            this.view.getTblTarjetas().updateUI();


        }
        //evento boton cargar datos
        if (e.getSource() == view.getBtnCargar()){
            System.out.println("Evento sobre botón cargar");
            modelo.cargarDatos();
            this.view.getTblTarjetas().setModel(modelo);
            this.view.getTblTarjetas().updateUI();
        }
        //evento sobre la tabla
        if (e.getSource() == view.getTblTarjetas()){
            System.out.println("Evento sobre tabla ");
            int index = this.view.getTblTarjetas().getSelectedRow();
            TarjetasAMD tmp = modelo.getTarjetaAtIndex(index);

            this.view.getTxtId().setText(Integer.toString(tmp.getId()));
            this.view.getTxtModelo().setText(tmp.getModelo());
            this.view.getTxtTipo().setText(tmp.getTipo());
            this.view.getTxtTipoDeMemoria().setText(tmp.getTipoDeMemoria());
            this.view.getTxtFrecuencia().setText(Double.toString(tmp.getFrecuenciaBoost()));
            this.view.getTxtFoto().setText(tmp.getUrlFoto());
            try {
                this.view.getImagenCompu().setIcon(tmp.getImagen());
                this.view.getImagenCompu().setText("");
            }catch (MalformedURLException mfue){
                System.out.println(mfue.getMessage());
            }
        }
        //evento sobre boton eliminar
        if (e.getSource() == this.view.getBtnEliminar()){
            ModeloTablaTarjetas tmp = new ModeloTablaTarjetas();
            int index = this.view.getTblTarjetas().getSelectedRow();
            TarjetasAMD temp = modelo.getTarjetaAtIndex(index);

            tmp.eliminarDatos(Integer.toString(temp.getId()));
            modelo.cargarDatos();
            this.view.getTblTarjetas().updateUI();
        }
        //evento sobre boton actualizar
          if (e.getSource() == this.view.getBtnActualizar()){
              int index = this.view.getTblTarjetas().getSelectedRow();
              TarjetasAMD tmp = modelo.getTarjetaAtIndex(index);
              TarjetasAMD tarjeta = new TarjetasAMD();

                  tarjeta.setModelo(this.view.getTxtModelo().getText());
                  tarjeta.setTipo(this.view.getTxtTipo().getText());
                  tarjeta.setTipoDeMemoria(this.view.getTxtTipoDeMemoria().getText());
                  tarjeta.setFrecuenciaBoost(Double.parseDouble(this.view.getTxtFrecuencia().getText()));
                  tarjeta.setUrlFoto(this.view.getTxtFoto().getText());
                  tarjeta.setId(tmp.getId());

                  modelo.actualizarDatos(tarjeta);
                  modelo.cargarDatos();
                  this.view.getTblTarjetas().setModel(modelo);
                  this.view.getTblTarjetas().updateUI();
                  this.view.limpiar();
              }


          }
    }



