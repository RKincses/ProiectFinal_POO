import javax.swing.*;

public class ComenziP {

    private String expNume;                         //Detaliile Expeditorului
    private long  expTelefon;
    private String expJudet;
    private String expLocalitate;
    private int expCodPostal;
    private String expAdresa;
    private String destNume;                        // Detaliile Destinatarului
    private long destTelefon;
    private String destJudet;
    private String destLocalitate;
    private int destCodPostal;
    private String destAdresa;

    // Constructor Expeditor

    public ComenziP(String Nume, long Telefon, String Judet,String Localitate,int CodPostal, String Adresa ){
        this.expNume = Nume;
        this.expTelefon = Telefon;
        this.expJudet = Judet;
        this.expLocalitate = Localitate;
        this.expCodPostal = CodPostal;
        this.expAdresa = Adresa;
    }

    // Constructor Destinatar

    public ComenziP(String Nume, long Telefon, String Judet,int CodPostal,String Localitate, String Adresa ){
        this.destNume = Nume;
        this.destTelefon = Telefon;
        this.destJudet = Judet;
        this.destLocalitate = Localitate;
        this.destCodPostal = CodPostal;
        this.destAdresa = Adresa;
    }
}
