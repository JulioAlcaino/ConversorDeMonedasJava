import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConeccionconApi {
    public Datos consulta(String moneda1, String moneda2, double cantidad) throws IOException, InterruptedException {

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/88890e67d545a94dd8270341/pair/" + moneda1 + "/" + moneda2 + "/" + cantidad))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            Gson gson = new GsonBuilder().create();

            Datos jsonResultado = gson.fromJson(json, Datos.class);

            System.out.println(jsonResultado);


            return jsonResultado;

        } catch (Exception e){
            System.out.println("Verificar datos ingresados");
        }
        return null;
    }

}
