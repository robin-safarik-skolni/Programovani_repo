import java.util.Arrays;
import java.util.Scanner;

public class Clovek implements Comparable<Clovek>{
    private String jmeno;
    private String prijmeni;
    private int vek;


    public Clovek(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;

    }

    public int getSalary() {
        return 40000;
    }
    @Override
    public String toString() {
        return "Clovek{" + "jmeno='" + jmeno + "\'" + ", prijmeni='" + prijmeni + "\'" + "}";
    }

    @Override
    public int compareTo(Clovek o) {
        int vysledekporovnani = prijmeni.compareTo(o.prijmeni);
        if (vysledekporovnani == 0) {
            vysledekporovnani = jmeno.compareTo(o.jmeno);
        }
        return vysledekporovnani;
    }



    static void main() {
        Clovek lide[] = new Clovek[];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            jmeno = sc.next();
            prijmeni = sc.nextInt();
        }

    }


}
