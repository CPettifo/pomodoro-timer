import java.util.Timer;
import java.util.TimerTask;

/**
 * This is the Main class which will call all other classes as necessary
 */
public class Pomodoro {
    public static void main(String[] args){
        Timer timer = new Timer();

        Popup task = new Popup();

        task.setPopup("This is a popup", "#FFFFFF");

        timer.schedule(task, 200, 5000);
    }

}
