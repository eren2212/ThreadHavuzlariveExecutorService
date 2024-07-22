
import java.util.logging.Level;
import java.util.logging.Logger;


public class Worker implements Runnable{
    private String isim;
    private int taskid;

    public Worker(String isim, int taskid) {
        this.isim = isim;
        this.taskid = taskid;
    }
    @Override
    public void run() {
        try {
            System.out.println("Worker"+ this.isim+" "+ this.taskid+ " . işe başlado..");
            
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Worker"+ this.isim+" "+ this.taskid+ " . işi bitirdi.");
    }
    
}
