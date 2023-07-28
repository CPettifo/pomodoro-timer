/**
 * This Class holds the variables for the different UI and popup elements
 */
public class Theme {
    private String UIText;         //The String for the hex code for the UI text
    private String UIBackground;   //The hex code for the UI background
    private String popupStart;     //Colour of the popup telling the user to start working
    private String popupSmallStop; //Colour of popup for small break
    private String popupBigStop;   //Popup for larger break
    private String popupPaused;    //Popup colour for when the user pauses
    private String popupRestart;

    public Theme(){
        this.UIText = "#FF0000";
        this.UIBackground = "#003300";
        this.popupStart = "#009933";
        this.popupSmallStop = "#999900";
        this.popupBigStop = "#FF0000";
        this.popupPaused = "#FF00FF";
        this.popupRestart = "#FFFFFF";
    }

    public String getUIText() {
        return this.UIText;
    }

    public String getUIBackground() {
        return this.UIBackground;
    }

    public String getPopupStart() {
        return this.popupStart;
    }

    public String getPopupSmallStop(){
        return this.popupSmallStop;
    }

    public String getPopupBigStop(){
        return this.popupBigStop;
    }

    public String getPopupPaused() {
        return this.popupPaused;
    }

    public String getPopupRestart() {
        return this.popupRestart;
    }
}
