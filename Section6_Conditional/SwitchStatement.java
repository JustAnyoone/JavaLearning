package Section6_Conditional;

public class SwitchStatement {
    public static void main(String[] args) {

        // int value = 3;
        // if (value == 1) {
        //     System.out.println("Value was 1 ");
        // } else if (value == 2){
        //     System.out.println("Value was 2 ");
        // } else {
        //     System.out.println("Was not 1 or 2");
        // }
    

        int switchValue = 5;
        //<-- cannot use long, float, double or boolean
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5: 
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        } 
        
        String month = "MXYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month){

        //---------------------Regular switch expression--------------------------------------
        
        // switch (month) {
        //     case "JANUARY":
        //     case "FEBRUARY":
        //     case "MARCH":
        //         return "1st"; //<--- Work like a break      
        //     case "APRIL":
        //     case "MAY":
        //     case "JUNE":
        //         return "2st";
        //     case "JULY":
        //     case "AUGUST":
        //     case "SEPTEMBER":
        //         return "3st";                
        //     case "OCTOBER":
        //     case "NOVEMBER":
        //     case "DECEMBER":
        //         return "4st";    
        // }

        // return "bad";

        //------------------------Enchanced switch expression------------------------------

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse; //<- yield == return, but for a vlue coming out of a switch
                //CLAUDE { -> Case needs multiple statements/logic before producing a result 
                //-> wrap in {} and usae yield at the end to specify the value }
            }
        };

    }
}
