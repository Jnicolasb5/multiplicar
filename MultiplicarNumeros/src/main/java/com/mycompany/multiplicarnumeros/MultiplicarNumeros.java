package com.mycompany.multiplicarnumeros;

import java.util.Scanner;

public class MultiplicarNumeros {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,M;
        System.out.println("ingrese primer numero a multiplicar");
        n1=sc.nextInt();
        System.out.println("ingrese el segundo numero a multiplicar");
        n2=sc.nextInt();
        M=n1*n2;
        System.out.println("su multiplicacion es "+M);
        System.out.println("Hello World!");
    }
}
