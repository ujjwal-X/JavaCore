package stringpractice.StringQuestions;
class Fibonacii{
    public static void main(String[] args) {
        int a = 5;
        int f = 0;
        int s = 1;
        int t = f + s;
        if(a==0){
            System.out.println("Number is not valid");
        }
        for (int i = 1; i <=a; i++) {

            if (i==1) {
                System.out.println(f);

            }
            else if (i == 2) {
                System.out.println(s);

            }
            else {
                System.out.println(t);
                int temp = f;
                f = s;
                s = t;
                t = f + s;

            }
        }






        // while (x <= a) {
        //     if (x == 0) {
        //         System.out.println(0);
        //     }
        //     if (x == 1) {
        //         System.out.println(f);
        //     }
        //     if (x == 2) {
        //         System.out.println(s);
        //     }
        //     System.out.println(t);
        //     int temp = f;
        //     f = s;
        //     s = t;
        //     t = f + s;
        //     x++;
        // }
    }
}
