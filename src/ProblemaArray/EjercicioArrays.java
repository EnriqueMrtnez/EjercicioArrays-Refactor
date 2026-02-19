package ProblemaArray;
import java.util.Arrays;
import java.util.List;

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
    }
}