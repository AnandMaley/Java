import java.util.*;
class Division_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b==0){
                throw new ArithmeticException("Division by zero is not possible");
            }
            System.out.println("Division of two numbers is: "+(a/b));
        }catch (InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter numbers only.");
        }catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            System.out.println("Finally block is always executed");
        }
        sc.close();
    }
}   