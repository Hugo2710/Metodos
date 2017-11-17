/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author jutsu
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables
        double base,altura;
        int num;
        Scanner teclado = new Scanner (System.in);
        //menu
        System.out.println("Seleccione una opcion \n" + "l.Triangulo \n" + "2.Rectangulo");
        num =teclado.nextInt();
        switch (num) {
            case 1:
                System.out.println("Introduzca el valor de la base");
                base = teclado.nextInt();
                System.out.println("Intoduzca el valor de la altura");
                altura = teclado.nextInt();
                //realizar operacion
                String mensaje;
                mensaje = "El valor del area es: " + doAreaTi(base,altura) + "\n";
                mensaje += "El valor del perimetro es: " + doPeriTiEqui(base);
                System.out.println(mensaje);
                break;
            case 2:
               System.out.println("Introduzca el valor de la base");
                base = teclado.nextInt();
                System.out.println("Intoduzca el valor de la altura");
                altura = teclado.nextInt();
                //realizar operacion
                String mensaje2;
                mensaje2 = "El valor del area es: " + doAreaRe(base,altura) + "\n";
                mensaje2 += "El valor del perimetro es: " + doPeriRe(base,altura);
                System.out.println(mensaje2);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
    //Metodo para el area del triangulo
    public static double doAreaTi (double base, double altura){
        return (base * altura)/2;
    }
    //Triangulo perimetro
    public static double doPeriTiEqui (double base){
        return base * 3;
    }
    //area rectangulo
    public static double doAreaRe (double base, double altura){
        return base * altura;
    }
    //perimetro rectangulo
    public static double doPeriRe (double base, double altura){
        return (base + altura) * 2;
    }
}
