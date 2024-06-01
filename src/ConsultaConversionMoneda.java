import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversionMoneda {

    conexionAPI convertirMoneda(String monedaBase, String monedaDestino, int convertirCantidad) {
       URI direccionAPI = URI.create("https://v6.exchangerate-api.com/v6/e39d70fd417f377f17e6b3ec/pair/" +
               monedaBase + "/" + monedaDestino + "/" + convertirCantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request =HttpRequest.newBuilder()
                .uri(direccionAPI)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Gson().fromJson(response.body(),conexionAPI.class);

    }
}
