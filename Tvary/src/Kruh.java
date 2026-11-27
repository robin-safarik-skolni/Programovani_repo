public class Kruh extends Obly {
    double polomer;
    public Kruh(double polomer) {
        this.polomer = polomer;
    }
    public String druh() {
        return "kruh";
    }

    @Override
    public double obvod() {
        return Math.PI * 2 * polomer;
    }

    @Override
    public String toString() {
        return "druh: kruh" + super.toString();
    }
    @Override
    public double compareTo() {
        
    }
}
