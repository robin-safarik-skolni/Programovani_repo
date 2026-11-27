void main() {
    Clovek[] c = {
            new Clovek("A", "B", 240),
            new Clovek("C", "D", 220),
            new Clovek("E", "F", 200),
            new Clovek("G", "H", 180),
            new Clovek("I", "J", 160),
            new Clovek("K", "L", 140),
            new Clovek("M", "N", 120),
            new Clovek("O", "P", 100),
            new Clovek("Q", "R", 80),
            new Clovek("S", "T", 60),
            new Clovek("U", "V", 40),
            new Clovek("W", "X", 20),
            new Clovek("Y", "Z", 0),
    };



    bublinkoveRazeni(c);


    for (int i = 0; i < c.length; i++) {
        System.out.println(c[i]);
    }
}

private static void prohod(Clovek[] arr, int x, int y) {
    Clovek vypln = arr[x];

    arr[x] = arr[y];
    arr[y] = vypln;
}

private static void bublinkoveRazeni(Clovek[] c) {
    boolean opakuj = true;
    while(opakuj) {
        opakuj = false;
        for (int i = 0; i < c.length-1; i++) {
            if(c[i].vek > c[i+1].vek) {
                prohod(c, i, i+1);
                opakuj = true;
            }
        }
    }
}