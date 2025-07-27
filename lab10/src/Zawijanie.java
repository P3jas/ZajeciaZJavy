public class Zawijanie extends Thread {
    LiniaProdukcyjna linia;
    Zawijanie(LiniaProdukcyjna linia) {
        this.linia = linia;
    }
    @Override
    public void run() {
        try{
            while(true){
                linia.zawijanie();
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
