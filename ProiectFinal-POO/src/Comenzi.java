public class Comenzi(){
    private Persoana expeditor = new Persoana();
    private Persoana destinatar = new Persoana();
    private int id_comanda;
    public Comenzi(Persoana expeditor, Persoana destinatar, int id_comanda)
    {
        this.expeditor = expeditor;
        this.destinatar = destinatar;
        this.id_comanda = id_comanda;
    }

    public Persoana getExpeditor() {
        return expeditor;
    }

    public Persoana getDestinatar() { return destinatar; }

    public int getId_comanda() {
        return id_comanda;
    }

    public void setExpeditor(Persoana expeditor) {
        this.expeditor = expeditor;
    }

    public void setDestinatar(Persoana destinatar) {
        this.destinatar = destinatar;
    }

    public void setId_comanda(int id_comanda) {
        this.id_comanda = id_comanda;
    }

    public String toString(){
        String afisare = "Expeditor: " + expeditor.getNrTelefon() + " Destinatar: " + destinatar.getNrTelefon() + "ID comanda: " + id_comanda;
        return afisare;
    }
}