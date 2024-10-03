package Pattern;

public class PyramidOfNumber {

    public static void main(String[] args) {
        int rowCount=1;
        for (int i=0;i<5; i++){
         for(int j=5; j>i; j--){
             System.out.print(" ");
            }

            for(int z=1; z<=rowCount; z++){
                System.out.print(rowCount);
                System.out.print(" ");


            }
            System.out.println(" ");
            rowCount++;
        }
    }
}
