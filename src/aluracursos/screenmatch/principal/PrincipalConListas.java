package aluracursos.screenmatch.principal;

import aluracursos.screenmatch.modelos.Pelicula;
import aluracursos.screenmatch.modelos.Serie;
import aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args){
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Serie casaDragon = new Serie ("La cada del dragon", 2022);
        casaDragon.evalua(8);
        var otraPelicula = new Pelicula("Alien", 1979);
        otraPelicula.evalua(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(casaDragon);
        lista.add(otraPelicula);

        for (Titulo item : lista){
            System.out.println("----------------------------------------------------------------------------");
            System.out.println(item);
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
                System.out.println("La pelicual tiene " + pelicula.getClasificacion() + " Estrellas");
            }
        }


    }
}
