package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaTarjeta extends JFrame {
    private JLabel lblId;
    private JLabel lblModelo;
    private JLabel lblTipo;
    private JLabel lblTipoDeMemoria;
    private JLabel lblFrecuencia;
    private JLabel lblFoto;
    private JTextField txtId;
    private JTextField txtModelo;
    private JTextField txtTipo;
    private JTextField txtTipoDeMemoria;
    private JTextField txtFrecuencia;
    private JTextField txtFoto;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnEliminar;
    private JButton btnActualizar;
    private JTable tblTarjetas;
    private JComboBox comboBox;
    private JScrollPane scroll;
    private JPanel panel1; //Formulario para la base de datos
    private JPanel panel2; //Tabla Base de datos
    private JPanel panel3; //Mostrar la imagen del renglon seleccionado
    private JPanel panel4; //Eliminar y actualizar la tabla
    private GridLayout layout;
    private JLabel imagenCompu;


    public VentanaTarjeta(String title) throws HeadlessException {
        super(title);
        this.setSize(800,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(120, 204, 86));
        lblId = new JLabel("Id:");
        txtId = new JTextField(5);
        txtId.setText("0");
        txtId.setEnabled(false);
        lblModelo = new JLabel("Modelo:");
        txtModelo = new JTextField(19);
        lblTipo = new JLabel("Tipo de tarjeta:");
        txtTipo = new JTextField(20);
        lblTipoDeMemoria = new JLabel("Tipo de memoria:");
        txtTipoDeMemoria = new JTextField(19);
        lblFrecuencia = new JLabel("Frecuencia Boost: ");
        txtFrecuencia = new JTextField(10);
        lblFoto = new JLabel("Foto: ");
        txtFoto = new JTextField(25);
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblModelo);
        panel1.add(txtModelo);
        panel1.add(lblTipo);
        panel1.add(txtTipo);
        panel1.add(lblTipoDeMemoria);
        panel1.add(txtTipoDeMemoria);
        panel1.add(lblFrecuencia);
        panel1.add(txtFrecuencia);
        panel1.add(lblFoto);
        panel1.add(txtFoto);
        btnAgregar = new JButton("Agregar");
        panel1.add(btnAgregar);



        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(211, 118, 60));
        tblTarjetas = new JTable();
        scroll = new JScrollPane(tblTarjetas);
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        panel2.add(scroll);



        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(91, 213, 176));
        imagenCompu = new JLabel("...");
        panel3.add(imagenCompu);


        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(102, 80, 208));
        btnEliminar = new JButton("Eliminar");
        btnActualizar = new JButton("Actualizar");
        panel4.add(btnEliminar);
        panel4.add(btnActualizar);





        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblModelo() {
        return lblModelo;
    }

    public void setLblModelo(JLabel lblModelo) {
        this.lblModelo = lblModelo;
    }

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public void setLblTipo(JLabel lblTipo) {
        this.lblTipo = lblTipo;
    }

    public JLabel getLblTipoDeMemoria() {
        return lblTipoDeMemoria;
    }

    public void setLblTipoDeMemoria(JLabel lblTipoDeMemoria) {
        this.lblTipoDeMemoria = lblTipoDeMemoria;
    }

    public JLabel getLblFrecuencia() {
        return lblFrecuencia;
    }

    public void setLblFrecuencia(JLabel lblFrecuencia) {
        this.lblFrecuencia = lblFrecuencia;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(JTextField txtModelo) {
        this.txtModelo = txtModelo;
    }

    public JTextField getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(JTextField txtTipo) {
        this.txtTipo = txtTipo;
    }

    public JTextField getTxtTipoDeMemoria() {
        return txtTipoDeMemoria;
    }

    public void setTxtTipoDeMemoria(JTextField txtTipoDeMemoria) {
        this.txtTipoDeMemoria = txtTipoDeMemoria;
    }

    public JTextField getTxtFrecuencia() {
        return txtFrecuencia;
    }

    public void setTxtFrecuencia(JTextField txtFrecuencia) {
        this.txtFrecuencia = txtFrecuencia;
    }

    public JTextField getTxtFoto() {
        return txtFoto;
    }

    public void setTxtFoto(JTextField txtFoto) {
        this.txtFoto = txtFoto;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JTable getTblTarjetas() {
        return tblTarjetas;
    }

    public void setTblTarjetas(JTable tblTarjetas) {
        this.tblTarjetas = tblTarjetas;
    }

    public JComboBox getComboBox() {
        return comboBox;
    }

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JLabel getImagenCompu() {
        return imagenCompu;
    }

    public void setImagenCompu(JLabel imagenCompu) {
        this.imagenCompu = imagenCompu;
    }

    //método para limpiar el formulario
    public void limpiar() {
        txtModelo.setText("");
        txtTipo.setText("");
        txtTipoDeMemoria.setText("");
        txtFrecuencia.setText("");
        txtFoto.setText("");
    }
}
