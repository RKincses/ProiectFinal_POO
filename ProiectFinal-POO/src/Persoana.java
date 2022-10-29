public class Persoana {
    private String nume;
    private String nrTelefon;
    private String judet;
    private String localitate;
    private String codPostal;
    private String adresa;
    public Persoana(String nume, String nrTelefon, String judet, String localitate, String codPostal, String adresa)
    {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.judet = judet;
        this.localitate = localitate;
        this.codPostal = codPostal;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getJudet() {
        return judet;
    }

    public String getLocalitate() {
        return localitate;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}