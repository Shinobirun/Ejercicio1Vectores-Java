package Ejercicios1;
import java.util.Scanner;

//Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100.
// Realizar un programa que permita la carga por teclado de los 10 números solicitados.


public class Main {
    public static void main(String[] args) {



        int vectorNum[]= new int[10];
        int m=1;
        for(int i=0; i<vectorNum.length; i++){
            Scanner s = new Scanner(System.in);


            System.out.println("Ingresa el numero para la posicion: "+m+" que sea mayor que 0 y menor que 100");
            m++;



            vectorNum[i]=s.nextInt();

            if (vectorNum[i] < 0 || vectorNum[i]>100) {
                System.out.println("El numero esta fuera de rango");
                i--;
                m--;
            }


            }
            System.out.println("Estos son los numeros ingresados");

        for (int j : vectorNum) {
            System.out.println(j);
        }

        }



    }
