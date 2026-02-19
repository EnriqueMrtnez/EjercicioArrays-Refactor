package ProblemaArray;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class EjercicioArrays {
    public static void main(String[] args) {
        int numAlumnos = 40;
        Integer[] control = new Integer[numAlumnos];
        int maxNota = -1;
        int minNota = 11;

        for(int i=0; i < control.length; i++){
            control[i] = (int)(Math.random()*11);
            if (control[i] > maxNota) maxNota = control[i];
            if (control[i] < minNota) minNota = control[i];
        }

        List notas = Arrays.asList(control);
        System.out.println("Mínimo: " + minNota + " | Máximo: " + maxNota);
        System.out.println("Índice Mín: " + (notas.indexOf(minNota) + 1));
        System.out.println("Índice Máx: " + (notas.indexOf(maxNota) + 1));
        System.out.println("Notas: " + notas);
        
        int[] practicas = new int[numAlumnos];
        float[] calificaciones = new float[numAlumnos];

        for(int i = 0; i < numAlumnos; i++){
            practicas[i] = (int)(Math.random()*11);
            calificaciones[i] = (control[i] + (float)practicas[i]) / 2.0f;
        }

        System.out.println("\n--- ESTADÍSTICAS ---");
        for (int i = 0; i < 10; i++){
            int count = 0;
            for (int j = 0; j < numAlumnos; j++) {
                if (calificaciones[j] > i && calificaciones[j] <= (i + 1)) {
                    count++;
                }
            }
            float porcentaje = (count * 100.0f) / numAlumnos;
            System.out.println("Tramo <= " + (i+1) + ": " + porcentaje + "%");
        }
        
        List<Integer> aprobados = new ArrayList<>();
        List<Integer> suspensos = new ArrayList<>();

        for (int i = 0; i < numAlumnos; i++) {
            if (calificaciones[i] >= 5) {
                aprobados.add(i + 1);
            } else {
                suspensos.add(i + 1);
            }
        }
        
        System.out.println("Relación Aprobados: " + aprobados);
        System.out.println("Relación Suspensos: " + suspensos);
        
        double[] calif31 = new double[40];
        for (int i = 0; i < 31; i++) calif31[i] = Math.random() * 11;
        calif31[3] = 6;
        System.out.println("Nota actualizada alumno 4: " + calif31[3]);
    }
} 