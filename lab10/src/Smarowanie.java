public class Smarowanie extends Thread {
    LiniaProdukcyjna linia;
    Smarowanie(LiniaProdukcyjna linia) {
        this.linia = linia;
    }


    @Override
    public void run() {
        try{
            while(true){
                linia.smarowanie();
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
