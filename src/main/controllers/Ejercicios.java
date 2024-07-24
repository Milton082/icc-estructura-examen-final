package main.controllers;

import java.util.HashMap;
import java.util.Map;

public class Ejercicios {

    public void contarFrecuenciaDePalabras(String text) {
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] palabras = text.split("\\s+");
        HashMap<String, Integer> frecuenciaPalabras = new HashMap<>();

        for (String palabra : palabras) {
            if (frecuenciaPalabras.containsKey(palabra)) {
                frecuenciaPalabras.put(palabra, frecuenciaPalabras.get(palabra) + 1);
            } else {
                frecuenciaPalabras.put(palabra, 1);
            }
        }
        System.out.println("Frecuencia de palabras:");
        for (Map.Entry<String, Integer> entry : frecuenciaPalabras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void verificarCaracteresUnicos(String input) {
    }

}
