package com.example.ejemplofirebase;

public class Clases {
    String claseId;
    String seccion;
    String area;
    String tema;

    public Clases(String claseId, String seccion, String area, String tema) {
        this.claseId = claseId;
        this.seccion = seccion;
        this.area = area;
        this.tema = tema;
    }

    public String getClaseId() {
        return claseId;
    }

    public String getSeccion() {
        return seccion;
    }

    public String getArea() {
        return area;
    }

    public String getTema() {
        return tema;
    }
}
