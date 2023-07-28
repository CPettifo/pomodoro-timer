/**
 * This Class holds the variables for the different UI and popup elements
 */
public class Theme {
    public String UIText;         //The String for the hex code for the UI text
    public String UIBackground;   //The hex code for the UI background
    public String popupStart;     //Colour of the popup telling the user to start working
    public String popupSmallStop; //Colour of popup for small break
    public String popupBigStop;   //Popup for larger break
    public String popupPaused;    //Popup colour for when the user pauses
    public String popupRestart;

    public Theme(){
        this.UIText = "#FF0000";
        this.UIBackground = "#003300";
        this.popupStart = "#009933";
        this.popupSmallStop = "#999900";
        this.popupBigStop = "#FF0000";
        this.popupPaused = "#FF00FF";
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
