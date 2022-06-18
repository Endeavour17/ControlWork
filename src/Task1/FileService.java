package Task1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {
    public static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static final Path path = Paths.get("products.json");

    public static Product[] readFile(){
        String json;
        try {
            try {
                json = Files.readString(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return gson.fromJson(json, Product[].class);
    }

    public static void writeFile(Product[] products){
        String json = gson.toJson(products);

        byte[] arr = json.getBytes();
        try {
            Files.write(path,arr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
