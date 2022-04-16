import java.util.*;

public class StdinStdout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int a = scan.nextInt();
        scan.close();
        

        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
              
    }
}