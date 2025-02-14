package aplicacion;

import mates.Matematicas;

import java.util.Scanner;


public class Principal{

    public static void main(String[] args){//Iniciamos el programa
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de dardos: "); //Mensaje para el usuario 
        //Cuenta el numero de iteraciones desde que esta el usuario
        int dardos = sc.nextInt(); 
        double pi = Matematicas.generarNumeroPiIterativo(dardos);
        System.out.println("El número PI es aproximadamente: " + pi); //Obtenemos resultado de la aprox de pi 
        sc.close();


    }
}


