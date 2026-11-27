public class Hlavni {
    static void main() {

        Tvar tvar[] = {
            new Kruh(52),
            new Ctverec(1024),
            new TrojuhelnikPravouhly(40, 30),
            new Bod(),
            new Ctverec(1000)

        };

        for (int i = 0; i < 5; i++) {
            System.out.println(tvar[i].toString());

        }

    }
}
