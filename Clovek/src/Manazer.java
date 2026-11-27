public class Manazer extends Clovek {

    private Clovek [] podrizeni;

    public Manazer(String jmeno, String prijmeni, Clovek[] podrizeni) {
        super(jmeno, prijmeni);
    }

    @Override
    public int getSalary () {
        return super.getSalary() + podrizeni.length * 2000;
    }
    @Override
    public String toString() {
        return super.toString() + "plat:" + "\'" + getSalary();
    }
}
