package org.example.mamiferosPequeños;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SantiagoVillaPorras {

    public static void main(String[] args) {

        ArrayList<HashMap<String, Object>> mamiferosPequeños = new ArrayList<>();


        Scanner pedirDato = new Scanner(System.in);
        String decision = "entrar";
        while (true) {
            while(!decision.equals("salir")) {
                System.out.print("Digita salir si quieres terminar, de lo contrario digita cualquier cosa: ");
                decision = pedirDato.nextLine();
                System.out.println("Digitaste: "+ decision);
                if (decision.equals("salir")) {
                    break;
                }

                HashMap<String, Object> mamiferoPequeño = new HashMap<>();

                System.out.print("Digita el ID del mamifero: ");
                mamiferoPequeño.put("ID", pedirDato.nextLine());

                System.out.print("Digita el nombre del mamifero: ");
                mamiferoPequeño.put("Nombre", pedirDato.nextLine());

                System.out.print("Digita la edad del mamifero: ");
                mamiferoPequeño.put("Edad", pedirDato.nextLine());

                System.out.print("Digita la fecha de ingreso del mamifero: ");
                mamiferoPequeño.put("Fecha ingreso", pedirDato.nextLine());

                System.out.print("Digita los alimentos que consume el mamifero: ");
                mamiferoPequeño.put("Alimento", pedirDato.nextLine());

                System.out.print("Digita el nombre del mamifero: ");
                mamiferoPequeño.put("Nombre", pedirDato.nextLine());


                pedirDato.nextLine();
                mamiferosPequeños.add(mamiferoPequeño);

                System.out.println("Mamifero pequeño agregado con exito");

                System.out.println(mamiferosPequeños);

            }


        }

    }

}







