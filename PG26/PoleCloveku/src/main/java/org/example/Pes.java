package org.example;

public class Pes {
    String jmeno;
    String rasa;
    public Pes(String jmeno, String rasa) {
        this.jmeno = jmeno;
        this.rasa = rasa;
    }
    public void vypisSe() {
        System.out.println(jmeno);
        System.out.println(rasa);

    }
    @Override

    public int compareTo(Pes kamarad) {
        String jmenoKamarada = kamarad.jmeno;
        int porovnaniJmena = jmeno.compareTo(jmenoKamarada);
        return porovnaniJmena;
    }
}
