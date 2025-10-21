import aluracursos.screenmatch.modelos.Peliculas;

public class Principal {
    public static void main(String[] args){
        Peliculas miPelicula = new Peliculas();
        miPelicula.setNombreDePelicula("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setIncluidoEnPlan(false);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        miPelicula.evalua(10);
        System.out.println("Lo han calificado " + miPelicula.getTotalDeLasEvalaciones() + " Personas.");
        System.out.println("La calificacion es: " + miPelicula.calculaMedia() + "\n");

    }
}
