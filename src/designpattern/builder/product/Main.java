package designpattern.builder.product;

public class Main {
    public static void main(String[] args) {
        Builder b=new Builder();
        b.setBrand("Apple");
        b.setName("Iphone");
        b.setDesc("This is an Ios device ram 8 gb storage 128 gb");
        b.setPrice(100000);

        Product p=new Product(b);
        System.out.println(p.getName());
    }
}
