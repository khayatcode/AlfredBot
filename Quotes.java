import java.util.Calendar;
import java.util.Date;

public class Quotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    // public String guestGreeting(String name) {
    //     // YOUR CODE HERE
    //     return String.format("Hello %s, lovely to see you. How are you?", name);
    // }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s, Lovely to see you", dayPeriod, name);
    }
    public String guestGreeting(String name){
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        if (hour < 12){
            return guestGreeting(name, "morning");
        }
        else if (hour < 17){
            return guestGreeting(name, "afternoon");
        }
        else {
            return guestGreeting(name, "evening");
        }
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("It is currently %s", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        String str = conversation;
        int alexisIndex = str.indexOf("Alexis");
        int alfredIndex = str.indexOf("Alfred");

        if (alexisIndex != -1 ){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (alfredIndex != -1){
            return "At your service. As you wish, naturally.";
        }
        else {
            return "Right. And with that I shall retire.";
        }
    }
    
}
