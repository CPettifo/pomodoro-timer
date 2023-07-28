import java.util.Timer;
import java.util.TimerTask;

/**
 * This is the Main class which will call all other classes as necessary
 */
public class Pomodoro {
    Timer timer = new Timer();
    static Popup start = new Popup(); // The TimerTask-like object for the very first popup
    Popup shortPause = new Popup(); // The Object for the first break
    Popup longPause = new Popup();
    Popup afterBreak = new Popup(); //The Popup to display after a break has completed


    public static void main(String[] args){
        // Set the start popup and run it immediately
        start.setPopup("Good work on choosing to be productive today, next break in 25 seconds", "#00FF00");
        start.run();

    }


    public void shortBreak(){
        shortPause.setPopup("Good work on working so hard! Have a little fiver", "#445F22");
        timer.schedule(shortPause, 200, 5000);
    }

    public void longBreak(){
        longPause.setPopup("Awesome! Time for a bigger break now", "#FFFFFF");
        timer.schedule(longPause, 200, 30000);
    }

    public void startWork(){
        afterBreak.setPopup("Alright, time to get back to it, see you after you work a bit more", "#545454");
        timer.schedule(afterBreak, 200, 25000);
    }

}
