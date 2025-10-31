package aluracursos.screenmatch.principal;

import aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import aluracursos.screenmatch.calculos.FiltroRecomendacion;
import aluracursos.screenmatch.modelos.Episodio;
import aluracursos.screenmatch.modelos.Pelicula;
import aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setIncluidoEnPlan(false);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println("Lo han calificado " + miPelicula.getTotalDeLasEvalaciones() + " Personas.");
        System.out.println("La calificacion es: " + miPelicula.calculaMedia());
        System.out.println("----------------------------------------------------------------------------");

        Serie casaDragon = new Serie ("La cada del dragon", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println("----------------------------------------------------------------------------");

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        System.out.println("Te Tomaria " + calculadora.getTimepoTotal() + " minutos ver todo");

        System.out.println("----------------------------------------------------------------------------");

        FiltroRecomendacion filtro = new FiltroRecomendacion();

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryan");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(90);
        filtro.filtra(episodio);
        System.out.println("----------------------------------------------------------------------------");

        var otraPelicual = new Pelicula("Alien", 1979);
        otraPelicual.setDuracionMinutos(120);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(otraPelicual);
        listaDePeliculas.add(miPelicula);

        System.out.println("El tamaño de la lista es de: " + listaDePeliculas.size());
        System.out.println("La primer pelicual de la lista es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);

    }
}
