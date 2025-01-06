package enumspecial;

public class Main {
    public static void main(String[] args) {



        Day today = Day.FRIDAY;
        System.out.println("Today is: " + today);


//        values(): Returns an array of all constants.
//ordinal(): Returns the position of the enum constant.
//name(): Returns the name of the enum constant.
        // Enum in a switch-case
        switch (today) {
            case Day.MONDAY:

                System.out.println("Start of the week!");
                break;
            case Day.FRIDAY:
                System.out.println("Weekend is near!");
                break;
            default:
                System.out.println("Another regular day.");
        }
    }
}

