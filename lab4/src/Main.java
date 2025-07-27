import java.util.Arrays;
import java.util.Random;

public class Main {
    static int[] zad1(){
        int tab[] = new int[100];
        for (int i = 0; i < 100; i++) {
            tab[i] = i;
        }
        return tab;
    }
    static void show(int[] tab){
        int count = 0;
        int help = 0;
        double[] tabAverange = new double[10];
        Arrays.fill(tabAverange, 0.0);


        for (int i = 0; i < 100; i++) {
            if (i < 10){
                System.out.print("0"+tab[i] + ",");
            }else {
                System.out.print(tab[i] + ",");
            }
            tabAverange[tab[help]] += tab[i];
            help++;
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
                help = 0;
            }
        }
        for (int i = 0; i < 10; i++) {
            tabAverange[i] /= 10;
            System.out.printf("%.0f|", tabAverange[i]);
        }
    }

    //===========zad2
    static void zad2(){
        Random r = new Random();
        int n = (r.nextInt(20-10+1)+10),sup;
        System.out.println(n);
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sup = r.nextInt(3) - 1 ;
                    while (sup == 0) {
                        sup = r.nextInt(3) - 1 ;
                    }
                    arr[i][j] = sup;
                }else {
                    arr[i][j] = r.nextInt(41) - 20;
                }
            }
        }
        //======show
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        divin(arr);
    }
    static void divin(int[][] tab){
        int even = 0, odd = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if(tab[i][j] % 2 == 0){
                    even+= tab[i][j];
                }else {
                    odd+= tab[i][j];
                }
            }
        }
        double stosunek = even/odd;
        System.out.println("stosunek = " + stosunek);
    }
    //==========zad3

    static String porownanie(Okrag o1, Okrag o2){
        String result = "";
        double pitagolas = Math.sqrt(Math.pow(o1.x - o2.x,2) + Math.pow(o1.y - o2.y,2));

        double suma = o1.r + o2.r ;
        double roznica = Math.abs(o1.r - o2.r);
        if (o1.r == o2.r && o1.x == o2.x && o1.y == o2.y) {
            result = "Pokrywaja sie";
        } else if (pitagolas == suma || pitagolas == roznica) {
            result = "styczne";
        } else if (pitagolas < suma && pitagolas > roznica) {
                result = "przecinajace sie";
        } else{
            result = "rozlaczne";
        }

        return result;
    }
    static void showOkrag(Okrag[] o){
        for (Okrag x : o){
            System.out.println("x = " + x.x + ", y = " + x.y + ", r = " + x.r);
        }
    }
    static void zad3(){
        Okrag[] o = new Okrag[2];
        o[0] = new Okrag(3,0,4);
        o[1] = new Okrag(0,0,9);
        System.out.println(porownanie(o[0], o[1]));

    }
    public static void main(String[] args) {

        //==========zad1
        //show(zad1());
        //==========zad2
        //zad2();
        zad3();

    }
}