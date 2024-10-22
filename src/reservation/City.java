package reservation;

import javax.xml.transform.Source;
import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] city=new String[]{"Indore","Ujjain","Dewas","Rewa","Khargone"};
        int[] price=new int[]{1000,500,600,700,800};
        int totalAmount=0;
        int size= city.length;
        while (true) {
            System.out.println("1. City and Prices");
            System.out.println("2. Buy Tickets");
            System.out.println("3. Total Amount");
            System.out.println("4. Exit");

            int x=sc.nextInt();

            switch (x) {
                case 1:
                    showDetails(size,city,price);
                    break;
                case 2:
                    ticketBuying(size,city,price);
                    break;
                case 3:
                    System.out.println("Total amount is "+totalAmount);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");


            }
        }
    }
    static  void showDetails(int size,String[] city,int[] price){
        for (int i=0;i<size;i++){
            System.out.println( i+" "+city[i]+" "+price[i]);

        }
        System.out.println("=========================================================================");

    }
    static void ticketBuying(int size,String[] city,int[] price){
        showDetails(size,city,price);
        int totalPrize = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Select city");
        int x=sc.nextInt();
        if(x==1){
            System.out.println("How many tickets of"+city[x]+"you want to buy");
            int y=sc.nextInt();
            totalPrize=price[x]*y;
        }else if(x==2){
            System.out.println("How many tickets you want to buy");
            int y=sc.nextInt();
            totalPrize=price[x]*y;
        } else if (x==3) {
            System.out.println("How many tickets you want to buy");
            int y=sc.nextInt();
            totalPrize=price[x]*y;
        } else if (x==4) {
            System.out.println("How many tickets you want to buy");
            int y=sc.nextInt();
            totalPrize=price[x]*y;
        } else if (x==5) {
            System.out.println("How many tickets you want to buy");
            int y=sc.nextInt();
            totalPrize=price[x]*y;
        }
        System.out.println("Total amount is"+ totalPrize);
        System.out.println("Would you like to continue y for yes or n for no");
        String c=sc.next();
        if(c.equals("y")){
            System.out.println("Ticket SuccessFully Purchased");
        } else if (c.equals("n")) {
            return;
        }

    }

}
