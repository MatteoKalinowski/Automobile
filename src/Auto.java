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
                sleep((int)(Math.random() * 10000)); // max 10 sec
                p.esci(id);
            }
        } catch (InterruptedException e) {}
    }
}
