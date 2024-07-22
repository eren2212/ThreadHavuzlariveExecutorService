
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        //asagidaki satir satir kodun kısaltırlmış hali
        //burada 2 verince aynı anda 2 tane thread çalıştırıyor.
        ExecutorService executor = Executors.newFixedThreadPool(4);
        
        //burada 5 adet task oluşturduk 
        for(int i= 1 ; i<=5; i++){
            executor.submit(new Worker(String.valueOf(i), i));
        }
        System.out.println("bütün işler teslim edildi");

        //bu metod ilede kapattık
        executor.shutdown();
        
        try {
            //eğer diyelimki threadlerin süresi uzun sürdü bbunun için
            //burada day dediği için 1 gün sonra kapoanacak.

            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("Bütün işler bitti");
        
        
                    /*Thread t1 = new Thread(new Worker("1", 1));
                    Thread t2 = new Thread(new Worker("2", 2));
                    Thread t3 = new Thread(new Worker("3", 3));
                    Thread t4 = new Thread(new Worker("4", 4));
                    Thread t5 = new Thread(new Worker("5", 5));
                    System.out.println("İşler teslim edildi");
                    t1.start();
                    t2.start();
                    
                    try {
                    t1.join();
                    t2.join();
                    } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    t3.start();
                    t4.start();
                    
                    try {
                    t3.join();
                    t4.join();
                    } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    t5.start();
                    
                    try {
                    t5.join();
                    } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("işlerin tamami bitti");*/
                    
    }
    
}
