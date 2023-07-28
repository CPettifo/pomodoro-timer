/**
 * This class is used for the popups that will be displayed to the user to let them know how much time has elapsed
 */
public class Popup {
    private String message;
    private String popupColour;

    public Popup (String message, String popupColour){
        this.message = message;
        this.popupColour = popupColour;
        displayPopup();
    }

    /**
     * Placeholder function, for now it will just display the message in the console, eventually I would like it to be
     * a pop-up notification from the System Tray
     */
    private void displayPopup(){
        System.out.println(this.message);
        System.out.println("The colour of this message would be: " + popupColour);
    }
}
