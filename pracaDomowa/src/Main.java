public class Main {
    static void zad1(int x){
        try{
            if (x<0) {
                throw new Exception("Liczba jest ujemna");
            }
    }catch (IllegalArgumentException e){
            System.out.println("Bledne dane");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {

        zad1(-5);
    }
}