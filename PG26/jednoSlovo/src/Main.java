import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String slovo = sc.next();



        char[] arr = slovo.toCharArray();
        int stovky = prevedNaCislo(arr[0])*100;
        int desitky = prevedNaCislo(arr[1])*10;
        int jednotky = prevedNaCislo(arr[2]);

        System.out.println(stovky+desitky+jednotky);

    }

    public static int prevedNaCislo(char ch) {


        int cislo = 0;

        switch (ch) {
            case '1': cislo = 1; break;
            case '2': cislo = 2; break;
            case '3': cislo = 3; break;
            case '4': cislo = 4; break;
            case '5': cislo = 5; break;
            case '6': cislo = 6; break;
            case '7': cislo = 7; break;
            case '8': cislo = 8; break;
            case '9': cislo = 9; break;
            case '0': cislo = 0; break;
        }
        return cislo;
    }

}

