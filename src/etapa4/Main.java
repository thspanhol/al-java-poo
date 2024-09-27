package etapa4;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        /*
        1xx: Informações
        2xx: Sucesso
        3xx: Redirecionamento
        4xx: Erro do cliente
        5xx: Erro do servidor
        */

        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o filme que deseja buscar: ");
        String filme = leitura.nextLine();

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.omdbapi.com/?t=" + filme.replace(" ", "%20") + "&apikey=1e2c5b98"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        //Filme meuFilme = gson.fromJson(json, Filme.class);
        FilmeOmdb meuFilmeOmdb = gson.fromJson(json, FilmeOmdb.class);
        System.out.println(meuFilmeOmdb);

        Filme meuFilme = new Filme(meuFilmeOmdb);
        System.out.println(meuFilme);
    }
}
