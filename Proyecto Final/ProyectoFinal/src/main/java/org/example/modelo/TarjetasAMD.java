package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TarjetasAMD {
    private int id;
    private String modelo;
    private String tipo;
    private String tipoDeMemoria;
    private double FrecuenciaBoost;
    private String urlFoto;

    public TarjetasAMD() {
    }

    public TarjetasAMD(int id, String modelo, String tipo, String tipoDeMemoria, double frecuenciaBoost, String urlFoto) {
        this.id = id;
        this.modelo = modelo;
        this.tipo = tipo;
        this.tipoDeMemoria = tipoDeMemoria;
        FrecuenciaBoost = frecuenciaBoost;
        this.urlFoto = urlFoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoDeMemoria() {
        return tipoDeMemoria;
    }

    public void setTipoDeMemoria(String tipoDeMemoria) {
        this.tipoDeMemoria = tipoDeMemoria;
    }

    public double getFrecuenciaBoost() {
        return FrecuenciaBoost;
    }

    public void setFrecuenciaBoost(double frecuenciaBoost) {
        FrecuenciaBoost = frecuenciaBoost;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "TarjetasAMD{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tipoDeMemoria='" + tipoDeMemoria + '\'' +
                ", FrecuenciaBoost=" + FrecuenciaBoost +
                ", urlFoto='" + urlFoto + '\'' +
                '}';
    }

    public ImageIcon getImagen() throws MalformedURLException {
        URL urlImagen = new URL(this.urlFoto);
        return new ImageIcon(urlImagen);
    }

}
