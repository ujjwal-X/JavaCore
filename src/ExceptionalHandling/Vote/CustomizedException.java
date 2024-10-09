package ExceptionalHandling.Vote;

import java.util.Scanner;

public class CustomizedException {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        try{
            if(age<18){
                throw new NotEligibleForVote();
            }else if (age>25 && age<40 ) {
                System.out.println("eligible for vote enter the value");
                int vote=sc.nextInt();
                if(vote<=4){
                    System.out.println("thanks for voting");
                }
                else{
                    System.out.println("in your age limit you can give only Four vote");
                }

            }
            else if (age>18 && age<25 ) {
                System.out.println("eligible for vote enter the value");
                int vote=sc.nextInt();
                if(vote<=2){
                    System.out.println("thanks for voting");
                }
                else{
                    System.out.println("in your age limit you can give only two vote");
                }

            }
            else if (age>18) {
                System.out.println("eligible for vote enter the value");
                int vote=sc.nextInt();
                if(vote<=1){
                    System.out.println("thanks for voting");
                }
                else{
                    System.out.println("in your age limit you can give only one vote");
                }

            }

        }
        catch(NotEligibleForVote e){
            System.out.println(e.toString());
        }



    }
}
