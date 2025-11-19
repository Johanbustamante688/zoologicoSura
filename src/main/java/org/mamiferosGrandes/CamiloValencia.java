package org.mamiferosGrandes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CamiloValencia {
    public static void main(String[] args) {
        //se debe crear una lista de de mamiferos grandes para un zoologico en java,
        // debe contener id, nombre, edad, fecha, alimentos estos datos se deben pedir al usuario

        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> mamiferos = new ArrayList<>();
        while (true) {
            HashMap<String, Object> mamifero = new HashMap<>();

            System.out.print("Digita el ID del mamífero: ");
            mamifero.put("id", pedirDato.nextInt());
            pedirDato.nextLine();

            System.out.print("Digita el nombre del mamífero: ");
            mamifero.put("nombre", pedirDato.nextLine());

            System.out.print("Digita la edad del mamífero (en años): ");
            mamifero.put("edad", pedirDato.nextInt());
            pedirDato.nextLine();

            System.out.print("Digita la fecha de ingreso (dd/mm/aaaa): ");
            mamifero.put("fecha", pedirDato.nextLine());

            System.out.print("Digita los alimentos que consume: ");
            mamifero.put("alimentos", pedirDato.nextLine());

            mamiferos.add(mamifero);

            System.out.print("¿Deseas agregar otro mamífero? (s/n): ");
            String continuar = pedirDato.nextLine();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("\n--- Mamíferos registrados en el zoológico ---");
        for (HashMap<String, Object> m : mamiferos) {
            System.out.println(m);
        }

        pedirDato.close();
    }
}
