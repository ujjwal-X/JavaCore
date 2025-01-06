package doubts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WithoutMergeSort {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        // Adding initial 100 elements (for example)
        for (int i = 0; i < 100; i++) {
            arrayList.add((int)(Math.random() * 1000) + 1);
        }


        System.out.println(arrayList);

        List<Integer> sorted=arrayList.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> arrayList1 = new ArrayList<>();

        System.out.println("Enter the number of elements you want to add:");
        int n = scanner.nextInt();  // Number of elements to input

        System.out.println("Enter " + n + " numbers:");

        // Loop to take user input and add it to the ArrayList
        for (int i = 0; i < n; i++) {
            char character = scanner.next().charAt(0);  // Read character input
            arrayList1.add(character);                  // Add to the ArrayList
        }


        List <Character> s=arrayList1.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(s);


    }
}
