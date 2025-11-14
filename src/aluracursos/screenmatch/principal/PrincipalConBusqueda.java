package aluracursos.screenmatch.principal;

import aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionException;
import aluracursos.screenmatch.modelos.Titulo;
import aluracursos.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main (String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la pelicula a buscar: ");
        String peliculaABuscar = sc.nextLine();

        String url ="https://www.omdbapi.com/?t=" + URLEncoder.encode(peliculaABuscar, StandardCharsets.UTF_8) + "&apikey=eca75ade";
        String direccionURL = url;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccionURL))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TituloOMDB mitituloomdb = gson.fromJson(json, TituloOMDB.class);


            var mititulo = new Titulo(mitituloomdb);
            System.out.println(mititulo);

        } catch (NumberFormatException e){
            System.out.println("------------------ERROR-------------------");
            System.out.println("Ocurrio un erro: " + e.getMessage());
            System.out.println("-------------------------------------------");
        } catch (IllegalArgumentException e){
            System.out.println("------------------ERROR-------------------");
            System.out.println("Error en la URI, por favor verifique bien la direccion ");
            System.out.println("-------------------------------------------");
        } catch (ErrorEnConversionDeDuracionException e){
            System.out.println("------------------ERROR-------------------");
            System.out.println(e.getMessage());
            System.out.println("-------------------------------------------");
        } catch (Exception e){
            System.out.println("------------------ERROR-------------------");
            System.out.println("Ocurrio un error inesperado");
            System.out.println("-------------------------------------------");
        }

        System.out.println("Finalizo la ejecucion del programa");
    }
}
