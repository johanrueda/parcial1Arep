package edu.escuelaing.arem.app;

import java.util.concurrent.ConcurrentHashMap;

public class Cache {
    private static ConcurrentHashMap<String,String> cache = new ConcurrentHashMap<String, String>();
    private static Clima clima;

    Cache(){
     clima = new Clima();
    }

    public static String estaEnCache(String lugar){
        if(cache.containsKey(lugar)){
            return cache.get(lugar);
        }else{
            cache.put(lugar,clima.getClima(lugar));
            return cache.get(lugar);
        }


    }
}
