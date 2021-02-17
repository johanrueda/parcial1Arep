package edu.escuelaing.arem.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Clima {



    public static String getClima (String lugar) {
        StringBuffer respuesta = new StringBuffer();
        try{
            URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q="+lugar+"&appid=f30cfe4149c9d630e1bc1b2a2410c27a");
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String line = bufferedReader.readLine();

            while ((line != null)){
                respuesta.append(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            return String.valueOf(respuesta);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.valueOf(respuesta);
    }



}
