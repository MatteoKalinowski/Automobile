class Parcheggio {
    private int posti = 5;

    public synchronized boolean entra(int id) throws InterruptedException {
        if (posti == 0) {
            System.out.println("Auto " + id + " in attesa...");
            wait(20000); // attende max 20 sec
        }

        if (posti == 0) {
            System.out.println("Auto " + id + " rinuncia");
            return false;
        }

        posti--;
        System.out.println("Auto " + id + " entra. Posti: " + posti);
        return true;
    }

    public synchronized void esci(int id) {
        posti++;
        System.out.println("Auto " + id + " esce. Posti: " + posti);
        notifyAll();
    }
}