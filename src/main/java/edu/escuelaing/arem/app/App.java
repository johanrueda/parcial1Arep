package edu.escuelaing.arem.app;

import spark.Request;
import spark.Response;

import java.net.MalformedURLException;
import java.net.URL;
import static spark.Spark.*;
import com.google.gson.Gson;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )  {
        port(getPort());
        Gson gson = new Gson();
        get("/clima",(req,res) -> {
            String lugar = req.queryParams("lugar");
            //String conexion = Clima.getClima(lugar);
            String conexion = Cache.estaEnCache(lugar);
            return gson.toJson(conexion);
        });

    }




    /**
     * metodo que nos retorna un puerto
     * @return entero que indica el puerto
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
