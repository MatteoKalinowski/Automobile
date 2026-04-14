class Auto extends Thread {
    Parcheggio p;
    int id;

    Auto(Parcheggio p, int id) {
        this.p = p;
        this.id = id;
    }

    public void run() {
        try {
            if (p.entra(id)) {
                sleep((int)(Math.random() * 10) * 1000);
                p.esci(id);
            }
        } catch (InterruptedException e) {}
    }
}
