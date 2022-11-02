public class Comenzi implements Comanda {
    private Persoana expeditor;
    private Persoana destinatar;
    private int id_comanda;
    private int id_livrator;
    public Comenzi(Persoana expeditor, Persoana destinatar, int id_comanda)
    {
        this.expeditor = expeditor;
        this.destinatar = destinatar;
        this.id_comanda = id_comanda;
        this.id_livrator = 0;
    }

    public Persoana getExpeditor() {
        return expeditor;
    }

    public Persoana getDestinatar() { return destinatar; }

    public int getId_comanda() {
        return id_comanda;
    }
    public int getId_livrator() {
        return id_livrator;
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
    public void setId_livrator(int id_livrator) {
        this.id_livrator = id_livrator;
    }

    public String toString(){
        String afisare = "Expeditor: " + expeditor.getNrTelefon() + " Destinatar: " + destinatar.getNrTelefon() + " ID comanda: " + id_comanda;
        return afisare;
    }

    public Object[] toString2(){
        String afisare = "Expeditor { " + "Nume :"+ expeditor.getNume()+
                " Telefon : " + expeditor.getNrTelefon() +" Judet : " + expeditor.getJudet() + " Adresa : " +expeditor.getAdresa() +
                " Cod Postal :" + expeditor.getCodPostal() + " Localitate: " + expeditor.getLocalitate() +
                "} Destinatar { " +
                "Nume :"+ destinatar.getNume()+ " Telefon : " + destinatar.getNrTelefon() +" Judet : " + destinatar.getJudet() +
                " Adresa : " +destinatar.getAdresa() + " Cod Postal :" + destinatar.getCodPostal() + " Localitate: "
                + destinatar.getLocalitate() + "}";
        return new String[]{afisare};
    }
}