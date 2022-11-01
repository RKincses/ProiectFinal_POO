public interface Comanda {
    public Persoana getExpeditor();
    public Persoana getDestinatar();
    public int getId_comanda();
    public void setExpeditor(Persoana expeditor);
    public void setDestinatar(Persoana destinatar);
    public void setId_comanda(int id_comanda);
}
