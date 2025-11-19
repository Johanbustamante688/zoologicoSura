package org.example.Login;

import java.util.Scanner;

public class Santiagoposada {

    public static void main(String[] args) {

        String usuarioIngresado;
        String correoIngresado;
        String contrasenaIngresada;

        String Usuario = "bocho";
        String correoCorrecto = "donchi@gmail.com";
        String contrasenaCorrecta = "bochoni12";

        Scanner DatosIngresados = new Scanner(System.in);

        int intentos = 0;

        while (true) {

            System.out.print("Ingrese el usuario: ");
            usuarioIngresado = DatosIngresados.nextLine();

            System.out.print("Ingrese el correo: ");
            correoIngresado = DatosIngresados.nextLine();

            System.out.print("Ingrese la contraseña: ");
            contrasenaIngresada = DatosIngresados.nextLine();

            if (usuarioIngresado.equals(Usuario) &&
                    correoIngresado.equals(correoCorrecto) &&
                    contrasenaIngresada.equals(contrasenaCorrecta)) {

                System.out.println("Acceso correcto");
                break; // Sale del ciclo si es correcto

            } else {
                intentos= intentos+1;
                System.out.println("Datos incorrectos.Intento " + intentos);

                if (intentos == 4) {
                    System.out.println("la cagaste");
                    break;
                }
            }
        }



    }


    }