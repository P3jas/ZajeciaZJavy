import java.util.Scanner;
public class Main {
    static void zad1(){
        Scanner input = new Scanner(System.in);
        boolean licz = true;
        while (licz) {
            try{
                System.out.print("Wprowadz pierwsza liczbe: ");
                String input1 = input.nextLine();
                double x = Double.parseDouble(input1);
                System.out.print("Wprowadz operatop(+ - * / ^ sqrt): ");
                String op = input.nextLine();
                double y = 0;
                if(!op.equals("sqrt")) {
                    System.out.print("Wprowadz druga liczbe: ");
                    String input2 = input.nextLine();
                    y = Double.parseDouble(input2);
                }
                double result = 0;
                switch (op) {
                    case "+":
                        result = x + y;
                        break;
                    case "-":
                        result = x - y;
                        break;
                    case "*":
                        result = x * y;
                        break;
                    case "/":
                        if (y == 0) {
                            throw new ArithmeticException("Nie mozna dzielic przez 0");
                        }
                        result = x / y;
                        break;
                    case "^":
                        result = Math.pow(x, y);
                        break;
                    case "sqrt":
                        if (x < 0) {
                            throw new ArithmeticException("Nie mozna obliczyc pierwiastka z liczb ujemnych");
                        }
                        result = Math.sqrt(x);
                        break;
                    default:
                        throw new IllegalArgumentException("Nieznany operator");
                }
                System.out.println("result: " + result);


            }catch (NumberFormatException e){
                System.out.println("Blad: Wprowadzono nieprawidłową liczbę. Spróbuj ponownie.");
            }catch (IllegalArgumentException e){
                System.out.println("Blad:" + e.getMessage());
            }catch (ArithmeticException e){
                System.out.println("Blad: " + e.getMessage());
            }

            System.out.println("Czy chcesz kontynowac dalej(tak/nie)");
            String dec = input.nextLine();
            if(dec.equals("nie")){
                licz = false;
            }
        }
    }
    static void zad2(){
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Podaj liczbe zmiennoprzecinkowa: ");
            String input1 = input.nextLine();
            double x = Double.parseDouble(input1);
            int cecha = (int) Math.floor(x);
            double mantisa = x - cecha;
            if (mantisa == 0) {
                throw new ArithmeticException("Nie mozna policzyc ilorazu poniewaz mantisa jest rowna 0");
            }
            System.out.println("cecha: " + cecha + "\nmantisa: " + mantisa);
            double iloraz = cecha * mantisa;
            System.out.println("iloraz: " + iloraz);

        }catch (IllegalArgumentException e){
            System.out.println("Blad: Bledna liczba " );
        }catch (ArithmeticException e){
            System.out.println("Blad: " + e.getMessage());
        }
    }
    static void zad3(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Podaj liczbe calkowita: ");
            String input1 = input.nextLine();
            int x = Integer.parseInt(input1);
            if (x > 999 || x < 99){
                throw new ArithmeticException("Liczba musi byc w zakresie 99-999");
            }
            double suma = 0;
            double help = 0;
            String s = Integer.toString(x);
            for (int i = 0; i < s.length(); i++) {
                help = (double) (Integer.parseInt(s.substring(i, i + 1)));
                suma += Math.pow(help, 2);
            }
            System.out.printf("suma: %.0f ",suma);
        }catch (IllegalArgumentException e){
            System.out.println("Blad: Bledna liczba " );
        }catch (ArithmeticException e){
            System.out.println("Blad: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        zad3();

    }

}