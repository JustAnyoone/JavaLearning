package Section_5.MethodOverloading;
//Little Glue -> 1 minute = 60sec | 1 hour = 60minutes, 3600sec

public class SecondstoMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(3725));
        System.out.println(getDurationString(30,  150));
        System.out.println(getDurationString(59,  50, 50)); //<-- Personal Addition (days counter)
    }

    public static String getDurationString(int seconds){
        if (seconds >= 0){
            int remaingSeconds = (seconds % 60); //--> Return the value of remaing seconds
            int minutes = (seconds / 60); //--> Return the total minutes
            seconds = remaingSeconds;

            return getDurationString(seconds, minutes);
        }
        else return "invalid inputs";

    }

    public static String getDurationString(int seconds, int minutes){
        if (minutes >= 0 & seconds >= 0 & seconds <= 59) {
            int remaingMinutes = ( minutes % 60); //--> Return the remaing minutes
            int hours = (minutes / 60); //total of hours
            return hours + "h " + remaingMinutes +"m " + seconds +"s ";
        }
        else return "Invalid Inputs";
    }
    //---------------------------Personal_Addition-------------------------------------
      public static String getDurationString(int seconds, int minutes, int hour){
        if (minutes >= 0 & minutes <= 59 & seconds >= 0 & seconds <= 59) {
            int remaingDays = (hour % 24);
            int days = (hour / 24);
            return days +"d " + remaingDays + "h " + minutes +"m " + seconds +"s ";
        }
        else return "Invalid Inputs";
    }
}
