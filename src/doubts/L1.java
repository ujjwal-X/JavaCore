package doubts;

public class L1 {
    public static void main(String[] args) {
        Integer x=10;
        Integer y=20;
        swap(x,y);
        System.out.println(x+" "+y);
    }
    static  public void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;

    }
}

