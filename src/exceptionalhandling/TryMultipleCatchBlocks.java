package exceptionalhandling;

public class TryMultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 0);
        }
//        catch (Exception e){
//            System.out.println("Exception");
//        }
//        catch (ArithmeticException e){
// This is not a good practice to write first parent and then child to handle exception thats why we have to always write
// parent first as we know exception is the parent of all the exception
//        if you want to  correct this write Arithmetic on top and parent exception class in bottom

        catch (ArithmeticException a) {
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
