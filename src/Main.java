public class Main {
    public static void main(String[] args) {
        Parcheggio p = new Parcheggio();

        for (int i = 0; i < 10; i++) {
            new Auto(p, i).start();
        }
    }
}