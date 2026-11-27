public class Intern extends Clovek{

    public Intern(String jmeno, String prijmeni) {
        super(jmeno, prijmeni);
    }
    @Override
    public int getSalary() {
        return super.getSalary() / 2;
    }
}
