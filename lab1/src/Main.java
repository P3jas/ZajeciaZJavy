import java.util.Scanner;
public class Main {
    static void zad1()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Ile lat uczysz sie programowania?");
        int lata = input.nextInt();
        System.out.println("Ucze sie programowania od: " + lata + " lat");
        System.out.println("Znam:\n-Python\n-java\n-PHP\n-DOOM\nMoim ulubionym jest Python.");
    }
    static void zad2()
    {
        int x, y;
        int z = 12;
        double i = 2.45;
        char znak = 'z';
        double j;
        x = 0;
        y = 444;
        j = 0.002;
        System.out.print("x = "+ x +", y = "+ y +", z = "+ z +", i = "+ i +", j = "+ j + ", znak = "+ znak);

        System.out.printf("\n i=%1.5f, j=%8.5e, x=%5d znak:%c", i, j, x, znak);

    }
    public static void main(String[] args) {

        zad2();
    }
}