public abstract class Tvar {
    public String druh() {
        return "";
    }
    public String skupina(){
        return "";
    }
    public double obvod(){
        return 0;
    }

    public String toString() {
        String vystup;
        vystup = "druh: " + druh() + ", ";
        vystup += "skupina: " + skupina() + ", ";
        vystup += "obvod: " + obvod();

        return vystup;
    }
}
