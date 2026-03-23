package sio.demo2.Modele;


public class Instrument {
    private int idInstrument;
    private String nomInstrument;

    public Instrument(int id, String nom) {
        this.idInstrument = id;
        this.nomInstrument = nom;
    }

    public String getNomInstrument() { return nomInstrument; }
}