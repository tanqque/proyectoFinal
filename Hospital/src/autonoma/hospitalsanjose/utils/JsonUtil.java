package hospital.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.util.List;

//////////// Clase utilitaria para persistencia en JSON //////////////////////
public class JsonUtil {

    //////////// Gson para serializar/deserializar //////////////////////
    private static final Gson gson = new Gson();

    //////////// Método para guardar cualquier lista como JSON //////////////////////
    public static <T> void guardar(String ruta, List<T> datos) throws IOException {
        try (Writer writer = new FileWriter(ruta)) {
            gson.toJson(datos, writer);
        }
    }

    //////////// Método para leer cualquier lista desde un archivo JSON //////////////////////
    public static <T> List<T> cargar(String ruta, TypeToken<List<T>> typeToken) throws IOException {
        try (Reader reader = new FileReader(ruta)) {
            return gson.fromJson(reader, typeToken.getType());
        }
    }
}
