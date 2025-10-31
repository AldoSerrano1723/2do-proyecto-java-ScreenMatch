package aluracursos.screenmatch.principal;

import aluracursos.screenmatch.modelos.Pelicula;
import aluracursos.screenmatch.modelos.Serie;
import aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args){
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        Serie casaDragon = new Serie ("La cada del dragon", 2022);
        var otraPelicual = new Pelicula("Alien", 1979);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(otraPelicual);
        lista.add(miPelicula);
        lista.add(casaDragon);

        for (Titulo item : lista){
            System.out.println(item);
        }


    }
}
