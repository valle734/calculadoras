/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author jimmy
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int num1;
        int num2;
        String operacion;
        int opcion = 0;

        System.out.println("Digite el primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Digite la operacion a realizar (suma,resta,division o multiplicacion): ");
        operacion = teclado.next();
        System.out.println("Digite el segundo numero: ");
        num2 = teclado.nextInt();

        if ("suma".equals(operacion)) {
            opcion = 1;
        }
        if ("resta".equals(operacion)) {
            opcion = 2;
        }
        if ("division".equals(operacion)) {
            opcion = 3;
        }
        if ("multiplicacion".equals(operacion)) {
            opcion = 4;
        }

        switch (opcion) {
            case 1:
                   System.out.println("El total de la operacion es: "+(num1+num2));
                
                break;
            case 2:
                System.out.println("El total de la operacion es: "+(num1-num2));
                break;
            case 3:
                System.out.println("El total de la operacion es: "+(num1/num2));
                break;
            case 4:
                System.out.println("El total de la operacion es: "+(num1*num2));
                break;
            default:

        }

    }

}
