public class Soferi{
    private String nume;
    private String prenume;
    private String nrMasina;
    private int id_sofer;
    public Soferi(String nume, String prenume, String nrMasina,int id_sofer)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.nrMasina = nrMasina;
        this.id_sofer = id_sofer;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNrMasina() {
        return nrMasina;
    }

    public int getId_sofer() {
        return id_sofer;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setNrMasina(String nrMasina) {
        this.nrMasina = nrMasina;
    }

    public void setId_sofer(int id_sofer) {
        this.id_sofer = id_sofer;
    }

    public String toString(){
        String afisare = "Nume: " + nume + " " + prenume + " Nr. Masina: " + nrMasina + " ID sofer: " + id_sofer;
        return afisare;
    }
}