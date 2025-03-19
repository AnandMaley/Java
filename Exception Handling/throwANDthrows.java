
import java.util.*;
public class throwANDthrows {
    public static void ThrowsandThrow() throws ArrayIndexOutOfBoundsException, IllegalArgumentException{
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if(b<20){
            throw new  IllegalArgumentException("Illegal Argument Exception");
        }
        try{
            int[] a = new int[5];
            a[6] = 8;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception");
        }
    }
    public static void main(String[] args) {
        ThrowsandThrow();
    }
}
