

public class TrojuhelnikPravouhly extends Rohaty {
    double odvesna_a;
    double odvesna_b;
    double prepona;
    public TrojuhelnikPravouhly(double odvesna_a, double odvesna_b) {
        this.odvesna_a = odvesna_a;
        this.odvesna_b = odvesna_b;
    }
    public String druh() {
        return "pravouhlyTrojuhelnik";
    }
    public double obvod() {
        prepona = Math.sqrt(Math.pow(odvesna_a, 2) + Math.pow(odvesna_b, 2));
        return prepona + odvesna_a + odvesna_b;
    }
}
