import java.util.*;

public class NestedTrycatch {
    public static void main(String[] args) {
        try{
            try{
                int[] a = new int[5];
                a[7] = 8;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bound exception");
            }
            int a = 5/0;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
    }
}
