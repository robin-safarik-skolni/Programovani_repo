import lombok.ToString;

@ToString
public class Zamestnanec extends Clovek {
    private int plat;

    public Zamestnanec(String jmeno, String prijmeni, int vek, int plat) {
        super(jmeno, prijmeni, vek);
    }
}
