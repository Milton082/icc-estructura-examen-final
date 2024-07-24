package main;

import java.util.List;
import java.util.Map;

import main.controllers.EstudianteController;
import main.models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {

        Estudiante[] estudiantes = {
                new Estudiante("Juan", 85),
                new Estudiante("María", 92),
                new Estudiante("Pedro", 78),
                new Estudiante("Ana", 88),
                new Estudiante("Luis", 75)
        };

        EstudianteController controlador = new EstudianteController();
        Map<String, List<Estudiante>> categorias = controlador.procesarEstudiantes(estudiantes);

        System.out.println("Estudiantes ordenador por calificación: ");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        System.out.println("\nAgrupacion por categorias: ");
        for (Map.Entry<String, List<Estudiante>> entry : categorias.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
    }
}
