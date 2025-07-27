import java.util.*;
import java.util.Comparator;
import java.util.ArrayList;
public class Main {
    public static void printList(ArrayList<String> list, listPrinter printer){
        for(String s : list){
            printer.printList(s);
        }
    }
    public static void zad1(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Matematyka");
        list.add("Programowanie");
        list.add("Twoja Stara Zajecia");

        printList(list, item -> System.out.println(item));

    }
    // zad 2 chuj wie jak to z lambda zrobic
    static public void zad2()
    {
        int[] a = new int[10];
        Random r = new Random();
        for (int i = 0; i < a.length; i++){
            a[i] = r.nextInt(100);
        }
        for(int ax : a){
            System.out.print(ax + " ");
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - i - 1; j++){
                int comp = Integer.compare(a[j], a[j+1]);
                if (comp > 0){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println();
        for(int ax : a){
            System.out.print(ax + " ");
        }
    }
    //pomoc chatu
    static public void zas22(){
        Integer[] a = new Integer[10];
        Random r = new Random();
        for (int i = 0; i < a.length; i++){
            a[i] = r.nextInt(100);
        }
        for(int ax : a){
            System.out.print(ax + " ");
        }
        Comparator<Integer> comp = (x, y) -> Integer.compare(x, y);
        sort(a,comp);
        System.out.println();
        for(int ax : a){
            System.out.print(ax + " ");
        }
    }
    public static void sort(Integer[] a,Comparator<Integer> comp){
        Arrays.sort(a,comp);
    }
    //zad3
    public static void zad3(){
        ArrayList<String> list = new ArrayList<String>();
        Random r = new Random();
        int n = r.nextInt(10);
        for (int i = 0; i < n; i++){
            int ile = r.nextInt(10);
            String wyraz = "";
            for (int j = 0; j < ile; j++){

                wyraz += (char)(r.nextInt(27) + 97);

            }
            list.add(wyraz);
        }

        System.out.println(list);
        Comparator<String> comp = (x, y) -> x.compareTo(y);
        sort2(list,comp);
        System.out.println(list);
    }
    static void sort2(ArrayList<String> list, Comparator<String> comp){
        list.sort(comp);
    }
    public static void main(String[] args) {
    zad3();

    }
}