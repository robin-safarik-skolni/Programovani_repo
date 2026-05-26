import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrectiBibli {
    public static void main(String[] args) {
        String jmenoSouboru = "src\\complet.txt";
        File soubor = new File(jmenoSouboru);
        Scanner sc = null;
        ArrayList arr = new ArrayList(); //vyroste tak, jak potřebujem

        try {
            sc = new Scanner(soubor);

            while (sc.hasNext()) {
                String slovo = sc.next();
                if(uzJsmeTohleSlovoVideli(slovo, arr) == true){

                } else {
                    arr.add(slovo);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nenalezení.");
        }
        System.out.println(arr.size());
        System.out.println(pocitadlo);
        System.out.println(nejdelsiSlovo);

    }
    static long pocitadlo = 0;
    static String nejdelsiSlovo = "";

    private static boolean uzJsmeTohleSlovoVideli(String slovo, ArrayList arr) {
        for(int i = 0; i < arr.size(); i++){
            String znameSlovo = arr.get(i).toString();

            pocitadlo++;

            if(slovo.length() > nejdelsiSlovo.length()){
                nejdelsiSlovo = slovo;
            }

            if(slovo.equals(znameSlovo)){
                return true;
            }
        }
        return false;
    }
}
