import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void zad2(){
        ArrayList<Integer> list = new ArrayList<>();
        int liczba = 1;
        while(liczba != 0){
            try {
                System.out.print("podaj liczbe: ");
                liczba = new Scanner(System.in).nextInt();
                list.add(liczba);
            }
            catch(Exception e){
                System.out.print("zly format");
                System.out.println();
            }

        }
        System.out.println(list);
    }
    public static void zad3(){
        int liczba,suma = 0,iloczyn = 1;
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (Math.abs(suma) < 250 || Math.abs(iloczyn) < 3000000) {
            try{
                System.out.print("Podaj liczbe:");
                liczba = input.nextInt();
                suma += liczba;
                iloczyn *= liczba;
                list.add(liczba);
                System.out.println("suma: " + suma + " iloczyn: " + iloczyn);

            }catch (Exception e) {
                System.out.println("Zly format");
            }
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
    public static void zad4(){
        ArrayList<Integer> list = new ArrayList<>();
        int liczba,suma = 0;
        Scanner input = new Scanner(System.in);
        while (suma != 64) {
            try{
                System.out.print("Podaj liczbe:");
                liczba = input.nextInt();
                suma += liczba;
                list.add(liczba);

                System.out.println(list);
                if(suma > 64){
                    System.out.println(list);
                    Collections.sort(list);
                    suma = suma - list.get(list.size()-1);
                    list.remove(list.size()-1);
                    System.out.println(list);
                }
                System.out.println("suma: " + suma);

            } catch (Exception e) {
                System.out.print("Zly format");
            }

        }
    }
    public static void zad5(){
        ArrayList<Integer> list = new ArrayList<>();
        int liczba,iloczyn = 1;
        Scanner input = new Scanner(System.in);
        while (iloczyn != 256) {
            try{
                System.out.print("Podaj liczbe:");
                liczba = input.nextInt();
                list.add(liczba);
                iloczyn *= liczba;
                System.out.println(list);

                if(iloczyn > 256){
                    Collections.sort(list);
                    iloczyn = iloczyn/list.get(0);
                    list.remove(0);
                    System.out.println(list);
                }
                System.out.println("iloczyn: " + iloczyn);
            }catch (Exception e) {
                System.out.println("Zly format");
            }
        }
    }
    public static void main(String[] args) {
        zad5();
    }
}