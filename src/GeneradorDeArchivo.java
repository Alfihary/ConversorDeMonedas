import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    public void guardarJson(conexionAPI conversion) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(conversion.base_code()+" a "+ conversion.target_code() +".json");
        escritura.write(gson.toJson(conversion));
        escritura.close();
    }
}