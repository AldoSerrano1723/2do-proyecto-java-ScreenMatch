import aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import aluracursos.screenmatch.calculos.FiltroRecomendacion;
import aluracursos.screenmatch.modelos.Episodio;
import aluracursos.screenmatch.modelos.Pelicula;
import aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args){
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setIncluidoEnPlan(false);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println("Lo han calificado " + miPelicula.getTotalDeLasEvalaciones() + " Personas.");
        System.out.println("La calificacion es: " + miPelicula.calculaMedia());
        System.out.println("----------------------------------------------------------------------------");

        Serie casaDragon = new Serie ();
        casaDragon.setNombre("La cada del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
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

    }
}
