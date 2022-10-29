public class Soferi{
    private String nume;
    private String prenume;
    private String nrMasina;
    public Soferi(String nume, String prenume, String nrMasina)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.nrMasina = nrMasina;
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

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setNrMasina(String nrMasina) {
        this.nrMasina = nrMasina;
    }

    public String toString(){
        String afisare = "Nume: " + nume + " " + prenume + " Nr. Masina: " + nrMasina;
        return afisare;
    }
}