import java.util.ArrayList;
public class LiniaProdukcyjna {
    int ileWyprodukowanych = 0;
    ArrayList<String> tasma = new ArrayList<>();

    public LiniaProdukcyjna() {
        tasma.add("Zawijanie w rulon");
    }

    public synchronized void smazenie(){
        try {
            while (tasma.get(0) != "Zawijanie w rulon") {
                wait();
            }
            tasma.remove(0);
            tasma.add("Smazenie");
            System.out.println(tasma);
            notifyAll();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    public synchronized void smarowanie(){
        try {
            while (tasma.get(0) != "Smazenie") {
                wait();
            }
            tasma.remove(0);
            tasma.add("Smarowanie dzemem");
            System.out.println(tasma);
            notifyAll();
        }catch (InterruptedException e){
            System.out.printf("Watek sie popsul");
        }
    }
    public synchronized void zawijanie(){
        try{
            while (tasma.get(0) != "Smarowanie dzemem") {
                wait();
            }
            tasma.remove(0);
            tasma.add("Zawijanie w rulon");
            System.out.println(tasma);
            ileWyprodukowanych++;
            System.out.println("Wyprodukowanych nalesnikow: " + ileWyprodukowanych);
            notifyAll();

        }catch (InterruptedException e){
            System.out.printf("Watek sie popsul");
        }
    }
}
