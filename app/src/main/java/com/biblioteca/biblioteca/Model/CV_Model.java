package com.biblioteca.biblioteca.Model;

/**
 * Created by luis on 16/01/2017.
 */

public class CV_Model {


    private String image;
    private String TV_Titulo;
    private String TV_Autor;
    private String TV_Editorial;
    private String TV_NoRepisa;
    private String TV_NoPrestamo;
    private String TV_NoVendidos;



    public CV_Model(String image, String TV_Titulo, String TV_Autor,
                    String TV_Editorial, String TV_NoRepisa, String TV_NoPrestamo,
                    String TV_NoVendidos) {
        this.image = image;
        this.TV_Titulo = TV_Titulo;
        this.TV_Autor = TV_Autor;
        this.TV_Editorial = TV_Editorial;
        this.TV_NoRepisa = TV_NoRepisa;
        this.TV_NoPrestamo = TV_NoPrestamo;
        this.TV_NoVendidos = TV_NoVendidos;
    }

    public String getTV_Titulo() {
        return TV_Titulo;
    }

    public String getTV_Autor() {
        return TV_Autor;
    }

    public String getTV_Editorial() {
        return TV_Editorial;
    }

    public String getTV_NoRepisa() {
        return TV_NoRepisa;
    }

    public String getTV_NoPrestamo() {
        return TV_NoPrestamo;
    }

    public String getTV_NoVendidos() {
        return TV_NoVendidos;
    }

    public String getImage() {return image;}

    public void setTV_NoPrestamo(String TV_NoPrestamo) {
        this.TV_NoPrestamo = TV_NoPrestamo;
    }

    public void setTV_Titulo(String TV_Titulo) {
        this.TV_Titulo = TV_Titulo;
    }

    public void setTV_Autor(String TV_Autor) {
        this.TV_Autor = TV_Autor;
    }

    public void setTV_Editorial(String TV_Editorial) {
        this.TV_Editorial = TV_Editorial;
    }

    public void setTV_NoRepisa(String TV_NoRepisa) {
        this.TV_NoRepisa = TV_NoRepisa;
    }

    public void setTV_NoVendidos(String TV_NoVendidos) {
        this.TV_NoVendidos = TV_NoVendidos;
    }

    public void setImage(String image) {
        this.image = image;
    }



}
