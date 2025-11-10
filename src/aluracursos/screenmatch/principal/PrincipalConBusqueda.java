package aluracursos.screenmatch.principal;

import aluracursos.screenmatch.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main (String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la pelicula a buscar: ");
        String peliculaABuscar = sc.nextLine();

        String url ="https://www.omdbapi.com/?t=" + peliculaABuscar + "&apikey=eca75ade";
        String direccionURL = url;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccionURL))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        Titulo mititulo = gson.fromJson(json, Titulo.class);
        System.out.println(mititulo);
    }
}
