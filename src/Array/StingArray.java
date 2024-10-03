package Array;
//String[] formatted = new String[]{"Ujjawal Kumar Shrivastave", "Conference Kumar Value", "Bottle Kumar Cap"};
//
//        System.out.println("Ujjawal Kumar - Shrivastava");
public class StingArray {
    public static void main(String[] args) {
        String[] formatted = new String[]{"Ujjwal Kumar Shrivastava Kumar ", "Conference Kumar Value Kumar",
                "Kumar Shanu Kumar Singre","Bottle Kumar Cap Kumar"};

        for (int i = 0; i < formatted.length; i++) {
            formatted[i] = formatted[i].replaceFirst("Kumar", "Kumar -");
        }

        for (String str : formatted) {
            System.out.println(str);
        }



    }
}
