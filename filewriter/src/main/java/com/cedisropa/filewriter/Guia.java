package com.cedisropa.filewriter;

public class Guia {
    private String fecha;
    private String ciudad;
    private String tipoEmpaque;
    private String nomGuia;
    private int numSurtidor;
    private int numLote;
    private int unidades;
    private String numGuia;

    public Guia(String fecha, String ciudad, String tipoEmpaque, String nomGuia, int numSurtidor, int numLote, int unidades, String numGuia) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.tipoEmpaque = tipoEmpaque;
        this.nomGuia = nomGuia;
        this.numSurtidor = numSurtidor;
        this.numLote = numLote;
        this.unidades = unidades;
        this.numGuia = numGuia;
    }

    public Guia(){
        this.fecha = "";
        this.ciudad = "";
        this.tipoEmpaque = "";
        this.nomGuia = "";
        this.numSurtidor = 0;
        this.numLote = 0;
        this.unidades = 0;
        this.numGuia = "";
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTipoEmpaque() {
        return tipoEmpaque;
    }

    public void setTipoEmpaque(String tipoEmpaque) {
        this.tipoEmpaque = tipoEmpaque;
    }

    public String getNomGuia() {
        return nomGuia;
    }

    public void setNomGuia(String nomGuia) {
        this.nomGuia = nomGuia;
    }

    public int getNumSurtidor() {
        return numSurtidor;
    }

    public void setNumSurtidor(int numSurtidor) {
        this.numSurtidor = numSurtidor;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getNumGuia() {
        return numGuia;
    }

    public void setNumGuia(String numGuia) {
        this.numGuia = numGuia;
    }
}
