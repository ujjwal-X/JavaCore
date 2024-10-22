package basic;

public class DecimalToBinary {
    public static void main(String[] args) {
        int x=11;
        int binary = 0;
        int answer=0;
        while (x>0){
            int reminder=x%2;
            binary=binary*10+reminder;
            x=x/2;
        }
        while (binary>0){
            int reminder=binary%10;
            answer=answer*10+reminder;
            binary=binary/10;

        }
        System.out.println(answer);

    }
}
