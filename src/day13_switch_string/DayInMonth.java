package day13_switch_string;

public class DayInMonth {
    public static void main(String[] args) {

        String month = "June";

        switch (month){

            case "february":
                System.out.println("28 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 days");
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "Octomber":
            case "Dcember":
                System.out.println("31 days");
                break;
            default:
                System.out.println("Invalid month");


        }
    }
}
