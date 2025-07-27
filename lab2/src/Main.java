import java.util.Scanner;

public class Main {
    static void Zad2() {
        for (int i = 0; i <= 45; i++) {
            System.out.println(i);
        }
    }
    static void Zad5() {
        int i = 5;
        while(i <= 80) {
            System.out.printf("%d ", i);
            i+=15;
        }
        System.out.print("\n");
        for (i = 5; i<= 80; i+=15) {
            System.out.printf("%d ", i);
        }
        System.out.print("\n");
        i =5;
        do {
            System.out.printf("%d ", i);
            i+=15;
        }
        while (i <= 80);
    }
    static void Zad6()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj a: ");
        int a = input.nextInt();
        System.out.print("Podaj b: ");
        int b = input.nextInt();
        System.out.print("Podaj c: ");
        int c = input.nextInt();

        int jaki = 0;

        boolean check = false;
        if (a > b && a > c ) {
            if (a < b + c){
                check = true;
                if (b == c) {
                    jaki = 2;
                }
            }
        } else if (b > a && b > c) {
            if (b < a+c){
                check = true;
                if (a == c) {
                    jaki = 2;
                }
            }
        }
        else{
            if (c < b + a){
                check = true;
                if (a == b) {
                    jaki = 2;
                }
            }
        }
        if (a == b && a == c){
            jaki = 1;
        }

        if (check) {
            System.out.println("Z podanych bokow mozna zbudowac trojkat");
            if (jaki == 0) {
                System.out.println("Jest to trojkat roznoboczy");
            } else if (jaki == 1) {
                System.out.println("Jest to trojkat rownoboczy");
            }else{
                System.out.println("Jest to trojkat rownoramienny");
            }
        }
        else {
            System.out.printf("Z podanych bokow NIE mozna zbudowac trojkatu");
        }

    }
    static void Zad7() {
        for (int i = 11; i <= 111; i++) {
            if (i % 13 == 0){
                System.out.printf("%d ", i);
            }
        }
    }
    static void Zad8(int n) {
        Scanner input = new Scanner(System.in);
        while (n < 0) {
            System.out.println("Podaj n dodatnie:");
            n = input.nextInt();
        }
        int pop = 1, ob = 1,pom;
        for (int i = 0; i < n; i++) {
            if (i == 0){
                System.out.print("0 ");
            } else if (i == 1) {
                System.out.print("1 ");
            }
            else {
                System.out.printf("%d ", ob);
                pom = ob;
                ob += pop;
                pop = pom;
            }
        }

    }
    public static void main(String[] args) {
        //===============zad1
        //Zad1 z1 = new Zad1();
        //System.out.println("Z1: " + z1.i + "," + z1.s + ", " + z1.c);
        //===============zad2
        //Zad2();
        //===============zad3
        //Uczen u1 = new Uczen(4.21,21,"Kowalski","Jan");
        //System.out.println(u1.imie + " " + u1.nazwisko + " " + u1.wiek + " " +u1.srednia);
        //===============zad6
        //Zad6();

        Zad8(15);
    }
}