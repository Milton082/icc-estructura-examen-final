package main.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import main.models.Estudiante;

public class EstudianteController {

   public HashMap<String, List<Estudiante>> procesarEstudiantes(Estudiante[] estudiantes) {
        Arrays.sort(estudiantes, Comparator.comparingInt(Estudiante::getCalificacion));
        HashMap<String, List<Estudiante>> categorias = new HashMap<>();

        for (Estudiante estudiante : estudiantes) {
            String categoria = obtenerCategoria(estudiante.getCalificacion());
            categorias.computeIfAbsent(categoria, k -> new ArrayList<>()).add(estudiante);
        }
        return categorias;
    }

    private String obtenerCategoria(int calificacion) {

        if (calificacion >= 90) {
            return "A";
        } else if (calificacion >= 80) {
            return "B";
        } else if (calificacion >= 70) {
            return "C";
        } else if (calificacion >= 60) {
            return "D";
        } else {
            return "F";
        }

    }

}
