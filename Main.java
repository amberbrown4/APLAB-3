import java.util.concurrent.TimeUnit;
import org.clock.logic.ClockLogic;
import org.clock.logic.Timezone;
import org.clock.ui.ClockUI;

public class Main {
    public static void main(String[] args) {
        Timezone mimi = new Timezone(3,30,0);
        ClockLogic hihi = new ClockLogic(11,  30,29 );
        Timezone didi = new Timezone(5,0,0);
        ClockLogic kiki = new ClockLogic(0 ,0 ,0 ,mimi );

        ClockLogic fifi = new ClockLogic(0 ,0 ,0 ,didi );
        ClockUI hi = new ClockUI(hihi.getHour(),hihi.getMinute(),hihi.getSecond());
        while(true){
            hihi.tik(1);
            hi.setClock(hihi.getHour(),hihi.getMinute(),hihi.getSecond());
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }

    }

}
