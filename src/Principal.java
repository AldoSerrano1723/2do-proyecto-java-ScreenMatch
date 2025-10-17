public class Principal {
    public static void main(String[] args){
        Peliculas miPelicula = new Peliculas();
        miPelicula.nombreDePelicula = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionMinutos = 120;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println("La calificacion es: " + miPelicula.calculaMedia() + "\n");

        Peliculas otraPelicula = new Peliculas();
        otraPelicula.nombreDePelicula = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionMinutos = 190;

        otraPelicula.muestraFichaTecnica();
        otraPelicula.evalua(9);
        otraPelicula.evalua(6.5);
        otraPelicula.evalua(8.8);
        System.out.println("La calificacion es: " + otraPelicula.calculaMedia() + "\n");
    }
}
