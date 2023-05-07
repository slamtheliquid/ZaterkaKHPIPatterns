package Lab3;

import java.util.Date;

public class UserInterface {
    private String message_options;
    private Date date;

    public void setPreferenceAndDate(String version){
        this.message_options = version;
        this.date = new Date();
    }

    public Save save(){
        return new Save(message_options);
    }

    public void load (Save save){
        message_options = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "\nUser's preference:" +
                "\nMessage preference: '" + message_options + "'" +
                "\nDate: " + date + "\n";
    }
}
