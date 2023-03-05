package org.hmoldovan.poosobrecarga;
import static org.hmoldovan.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("sumar int : " + sumar(10,5));
        System.out.println("sumat float :  " + sumar(10.0f,5f));
        System.out.println("sumar floar-int : " + sumar(10f, 3));
        System.out.println("sumar int-float : " + sumar(10,10.5));
        System.out.println("sumar double : " + sumar(10D, 5D));
        System.out.println("sumar string : " + sumar("10","5"));
        System.out.println("sumar tres int : " + sumar(10,50,3));
        System.out.println("sumar n int : " + sumar(2,4,5,3,5,4,6,3,8));
        System.out.println("sumar float + n int : " + sumar(10.5f,2,4,3,5,4,6,3,8));
        System.out.println("sumar 3 double : " + sumar(5.6,7.4,6.7));

        System.out.println("sumar long : " + sumar(10L, 5L));
        System.out.println("sumar int : " + sumar(10,'@'));
        System.out.println("sumar float-int : " + sumar(10F, '@'));
    }
}
