import java.util.Scanner;
public class Main {
    static void Zad1(char znak, String lancuch){
        int licznik = 0;
        for (int i = 0; i < lancuch.length(); i++){
            if (lancuch.charAt(i) == znak){
                licznik++;
            }
        }
        System.out.printf("Znak %c wystepuje w lancuchu %d razy", znak, licznik);
    }
    static void Zad2(String lancuch){
        int suma = 0;
        char znak;
        for (int i = 0 ; i < lancuch.length(); i++){
            znak = lancuch.charAt(i);
            if ((int)znak >= (int)'a' && (int)znak <= (int)'z' ){
                suma += (int)znak;
            } else if ((int)znak >= (int)'0' && (int)znak <= (int)'9' ) {
                suma += (int)znak;
            }
        }
        System.out.println("suma: " + suma);
    }
    static char Zad3(){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe z zakresu <33,126>: ");
        int znak = input.nextInt();
        while (true){
            if (znak >= 33 && znak <= 126){
                break;
            }
            else {
                System.out.print("Liczba nie znajduje sie w zakresie. Podaj jeszcze raz: ");
                znak = input.nextInt();
            }
        }

        return (char)znak;
    }
    //=====================================zad4
    static String lancuch(){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj lancuch znakow: ");
        String lancuch = input.next();
        return lancuch;
    }
    static String cezarSzyfr(String lancuch,int klucz){
        String ccezar = "";
        for (int i = 0; i < lancuch.length(); i++) {
            if(Character.isLowerCase(lancuch.charAt(i))){

                ccezar += (char)((((int)lancuch.charAt(i) + klucz - (int)'a') % (int)('z' - 'a' + 1) ) + (int)'a');
            } else if (Character.isUpperCase(lancuch.charAt(i))) {
                ccezar += (char)((((int)lancuch.charAt(i) +klucz - (int)'A') % (int)('Z' - 'A' + 1)) + (int)'A');

            }
            else{
                ccezar += lancuch.charAt(i);
            }
        }
        return ccezar;
    }
    static String cezarDeszyfr(String lancuch,int klucz){
        String ccezar = "";
        int pom = 0;
        for (int i = 0; i < lancuch.length(); i++) {
            if(Character.isLowerCase(lancuch.charAt(i))){
                pom = ((((int)lancuch.charAt(i) - klucz - 97 ) % 26 ) + 97);
                if (pom < 97) {
                    pom += 26;
                }
                ccezar += (char)pom;
            } else if (Character.isUpperCase(lancuch.charAt(i))) {
                pom = ((((int)lancuch.charAt(i) - klucz - (char)'A' ) % 26 ) + (char)'A');
                if (pom < (char)'A') {
                    pom += 26;
                }
                ccezar += (char)pom;
            }
            else{
                ccezar += lancuch.charAt(i);
            }
        }
        return ccezar;
    }
    static void zad4(){
        String lancuch = lancuch();
        System.out.println("lancuch: " + lancuch);
        System.out.println("Cezar: " + cezarSzyfr(lancuch,2));
        System.out.println("Dekodowane: " + cezarDeszyfr(cezarSzyfr(lancuch,2),2));
    }
    static boolean plaindrom(String str){
        String odwrotny = "";

        for (int i = str.length() -1; i >= 0; i--) {
            odwrotny += str.charAt(i);
        }
        System.out.println(odwrotny);
        if (str.equals(odwrotny)) {
            return true;
        }
        return false;
    }
    //===================zad5
    static String binarna(int liczba){
        String pom = "",binarna = "";
        while (liczba != 0){
            pom += liczba % 2;
            liczba = liczba / 2;
        }
        for (int i = pom.length() - 1; i >= 0; i--){
            binarna += pom.charAt(i);
        }
        System.out.println(pom);
        System.out.println("Binarna: " + binarna);
        return binarna;
    }
    static void zad5(String str){
        int najdluzsza = 0, obecna = 0;
        int pop = 0;

        String[] zeroSequences = str.split("1");
        for (int i = 1; i < zeroSequences.length - 1; i++) {
            najdluzsza = Math.max(najdluzsza, zeroSequences[i].length());
        }
//        for (int i = str.length() - 1 ; i >= 0 ; i--) {
//            if (0 == Character.getNumericValue(str.charAt(i))) {
//                obecna++;
//                if (obecna > najdluzsza){
//                    najdluzsza = obecna;
//                    pop = najdluzsza;
//                }
//            }
//            else {
//                obecna = 0;
//            }
//            pop = str.charAt(i);
//        }

        if (najdluzsza == 0) {
            System.out.println("Nie ma zer");
        }else {
            System.out.println("najdluzsza: " + najdluzsza);
        }

    }
    public static void main(String[] args) {

        //==========zad1
        //Zad1('a',"abcabca");
        //==========zad2
        //Zad2("b1");
        //char znak = Zad3();
        //System.out.printf("%d to %c", (int)znak,znak);
        //zad4();
        //binarna(10);


//        if(plaindrom("kajkak")) {
//            System.out.println("Jest ");
//        }else {
//            System.out.println("NIE jest");
//        }
        zad5("1000011011100000000000000000");


    }
}