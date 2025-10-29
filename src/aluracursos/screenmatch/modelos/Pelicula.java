package aluracursos.screenmatch.modelos;

import aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

//ATRIBUTOS
    private String director;

//CONSTRUCTOR
    public Pelicula(String nombre) {
        this.setNombre(nombre);
    }

//METODOS
    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + "(" + this.getFechaDeLanzamiento() + ")";
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia()/2);
    }

    //GETTERS
    public String getDirector() {
        return director;
    }

    //SETTERS
    public void setDirector(String director) {
        this.director = director;
    }


}
