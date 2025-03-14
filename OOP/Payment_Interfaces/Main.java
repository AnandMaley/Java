import java.util.*;

interface Payment{
    public void pay(double amount);
}

class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Please Swipe the Card!\n"+amount+" debited.");
    }
}

class UPIPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Please scan the QR code!\n"+amount+" debited.");
    }
}

public class Main {
    public static void main(String[] args) {
        CreditCardPayment c = new CreditCardPayment();
        // c.pay(500);
        UPIPayment u = new UPIPayment();
        // u.pay(200);
        ArrayList<Payment> a = new ArrayList<>();
        a.add(c);
        a.add(u);
        System.out.print("Enter a 0 for CreditCardPayment\nEnter a 1 for UPIPayment:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 0:
                a.get(0).pay(500);
                break;

            case 1:
                a.get(1).pay(200);
                break;
            default:
            System.out.println("Done!!");
                break;
        }
        sc.close();
    }
}