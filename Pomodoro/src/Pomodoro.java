import java.util.Timer;

/**
 * This is the Main class which will call all other classes as necessary
 */
public class Pomodoro {
    static Timer timer = new Timer();
    static Popup shortPause = new Popup(); // The Object for the first break
    static Popup longPause = new Popup();
    static Popup afterBreak = new Popup(); //The Popup to display after a break has completed
    static boolean countingBreak = false;  //A boolean for checking whether the clock is currently counting for breaks
    static boolean countingWork = true;    //Boolean for when the counter is counting for work
    static int cycleCounter = 0;


    public static void main(String[] args){

        // Loop for testing the general flow of the timing system
        while(true){
            //while(cycleCounter < 4){
                while(countingWork){
                    startWork();
                }
                while(countingBreak){
                    shortBreak();
                }
            //}
            longBreak();
            cycleCounter = 0;
        }
    }

    public static void shortBreak(){
        shortPause.setPopup("Good work on working so hard! Have a little fiver", "#445F22");
        if(countingBreak) {
            timer.schedule(shortPause,10,  5000);
            countingBreak=false;
            countingWork=true;
        }
    }

    public static void longBreak(){
        longPause.setPopup("Awesome! Time for a bigger break now", "#FFFFFF");
        if(countingBreak){
            timer.schedule(longPause,10,  30000);
            countingBreak=false;
            countingWork=true;
        }
    }

    public static void startWork(){
        afterBreak.setPopup("Alright, time to get back to it, see you after you work a bit more", "#545454");
        if(countingWork){
            timer.schedule(afterBreak,10,  25000);
            countingWork=false;
            countingBreak=true;
            cycleCounter++;
        }
    }

}
