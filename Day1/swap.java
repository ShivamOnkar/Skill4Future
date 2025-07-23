// import java.util.Scanner;

public class swap {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // int ch = str.charAt(0);
        
        int a = 10;
        int b = 15;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a+ "  "+ b);
    }
}
