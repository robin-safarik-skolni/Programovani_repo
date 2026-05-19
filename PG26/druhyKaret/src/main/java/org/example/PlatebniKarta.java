package org.example;

public class PlatebniKarta {
    String typ;
    int rokPlatnosti;
    String jmenoVlastnika;

    public PlatebniKarta(String typ, int rokPlatnosti, String jmenoVlastnika) {
        this.typ = typ;
        this.rokPlatnosti = rokPlatnosti;
        this.jmenoVlastnika = jmenoVlastnika;
    }

    @Override
    public String toString() {
        return "PlatebniKarta{" +
                "typ='" + typ + '\'' +
                ", rokPlatnosti=" + rokPlatnosti +
                ", jmenoVlastnika='" + jmenoVlastnika + '\'' +
                '}';
    }

    public static void main(String[] args) {
        PlatebniKarta[] poleKaret = {
            new PlatebniKarta("Visa", 2026, "Cgřřiý"),
            new PlatebniKarta("MasterC", 2026, "Ghkstřt"),
            new PlatebniKarta("Visa", 2050, "Gdskjaf"),
            new PlatebniKarta("Visa", 2030, "Jiajsž"),
            new PlatebniKarta("AMEX", 2027, "Řřýáž"),
        };

        for (PlatebniKarta pole : poleKaret) {
            System.out.println(pole.toString());
        }

        public int compareTo(PlatebniKarta o) {
            if(typ.compareTo(o.typ) < 0) {
                return -1;
            } else if (typ.compareTo(o.typ) > 0) {
                return 1;
            } else {return 0;}
        }
    }
}

/*

typ
rokPlatnosti
jmenoVlastnika

pole o 5 položkách s 5 kartami

*/