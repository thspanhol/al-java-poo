package etapa4;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
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
        String busca = "";
        List<Filme> listaFilmes = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.toLowerCase().equals("sair")) {

            System.out.println("Informe o filme que deseja buscar ou digite sair: ");
            busca = leitura.nextLine();

            if (busca.toLowerCase().equals("sair")) break;

            try {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("http://www.omdbapi.com/?t=" + busca.replace(" ", "%20") + "&apikey=1e2c5b98"))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                // Retorno api
                //System.out.println(json);

                FilmeOmdb meuFilmeOmdb = gson.fromJson(json, FilmeOmdb.class);
                // Record gerado para armazenar os dados da api
                //System.out.println(meuFilmeOmdb);

                Filme meuFilme = new Filme(meuFilmeOmdb);
                // Classe Filme com os dados fornecidos pelo Record, para não precisar do @SerializedName nem usar atributos começando com maiusculas
                //System.out.println(meuFilme);

                listaFilmes.add(meuFilme);

                // Persiste a pesquisa no arquivo txt
                FileWriter escrita = new FileWriter("filmes.txt");
                escrita.write(gson.toJson(listaFilmes));
                escrita.close();

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println("Programa encerrado.");
    }
}
