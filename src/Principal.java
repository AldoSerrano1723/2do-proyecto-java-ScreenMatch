public class Principal {
    public static void main(String[] args){
        Peliculas miPelicula = new Peliculas();
        miPelicula.nombreDePelicula = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionMinutos = 120;

        System.out.println("Mi pelicula es: " + miPelicula.nombreDePelicula);
        System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);

        Peliculas otraPelicula = new Peliculas();
        otraPelicula.nombreDePelicula = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionMinutos = 190;

        System.out.println("Mi pelicula es: " + otraPelicula.nombreDePelicula);
        System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);

    }
}
