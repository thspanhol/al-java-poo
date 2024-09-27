package etapa4;

import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cep {
    public static void main(String[] args) {

        int busca = 1;
        List<String> listaCeps = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);

        while (busca != 0) {

            try {
                System.out.print("Informe seu CEP ou digite 0 para sair: ");
                busca = leitura.nextInt();

                if (busca == 0) {
                    System.out.println("Os CEPs buscados foram salvos no arquivo.");
                    break;
                };

                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://viacep.com.br/ws/" + busca + "/json/"))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                //System.out.println(json);

                if (json.contains("erro") && json.contains("true")) {
                    System.out.println("Erro ao encontrar o CEP informado.");
                    break;
                };

                listaCeps.add(json);

                FileWriter escrita = new FileWriter("cep.json");
                escrita.write(String.valueOf(listaCeps));
                escrita.close();

                System.out.println("Dados do CEP" + busca + " salvos.");

            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }

        System.out.println("Programa encerrado.");
    }
}
