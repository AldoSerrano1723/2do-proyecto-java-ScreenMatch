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
        System.out.println("La calificacion es: " + miPelicula.calculaMedia() + "\n");
        System.out.println("----------------------------------------------------------------------------");

        Serie casaDragon = new Serie ();
        casaDragon.setNombre("La cada del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();


    }
}
