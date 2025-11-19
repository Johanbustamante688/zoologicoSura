package Felinos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JohanBustamante {
    public static void main(String[] args) {

        //Se empieza a crear la lista de Felinos
        //lleva: Id
        //Nombre
        //Edad
        //Fecha de ingreso zoologico
        //Alimentos
        //debe decir SALIR para terminar

        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> felinos = new ArrayList<>();
        String decision = "entrar";

        while (true) {
            while (!decision.equals("salir")) {
                System.out.print("Digita salir si quieres terminar de lo contrario digita cualquier cosa: ");
                decision = pedirDato.nextLine();
                System.out.println("Digitaste " + decision);

                if (decision.equals("salir")) {
                    break;
                }


                HashMap<String, Object> felino = new HashMap<>();


                System.out.print("Digita el nombre del felino: ");
                felino.put("nombre", pedirDato.nextLine());

                System.out.print("Digita la fecha de ingreso del felino: ");
                felino.put("fechaIngreso", pedirDato.nextLine());

                System.out.print("Digita los alimentos que consume el felino: ");
                felino.put("alimentos", pedirDato.nextLine());

                System.out.print("Digita el id del felino: ");
                felino.put("id", pedirDato.nextInt());

                System.out.print("Digita la edad del felino: ");
                felino.put("edad", pedirDato.nextInt());

                pedirDato.nextLine();

                felinos.add(felino);
                System.out.println("Felino agregado a la lista con exito.");

                System.out.println(felinos);



            }
        }
    }
}
