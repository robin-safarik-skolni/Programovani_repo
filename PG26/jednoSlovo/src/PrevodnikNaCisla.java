import java.util.Scanner;

public class PrevodnikNaCisla {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String slovo = sc.next();
        char[] arr = slovo.toCharArray();
        /*
        int stovky = arr[0] *100;
        int desitky = arr[1] *10;
        int jednotky = arr[2] ;
        int soucet = stovky + desitky + jednotky;
        */
        System.out.print(arr[0]);
        System.out.print(arr[1]);
        System.out.println(arr[2]);
    }
}
