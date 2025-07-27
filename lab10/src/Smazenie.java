public class Smazenie extends Thread {
    LiniaProdukcyjna linia;
    Smazenie(LiniaProdukcyjna linia) {
        this.linia = linia;
    }
    @Override
    public void run() {
        try{
            while(true){
                linia.smazenie();
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
