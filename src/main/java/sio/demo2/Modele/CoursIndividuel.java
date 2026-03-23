package sio.demo2.Modele;

import sio.demo2.Modele.Cours;
import sio.demo2.Modele.Instrument;

public class CoursIndividuel extends Cours {
    private Instrument instrument;

    public CoursIndividuel(int id, Instrument instrument) {
        super(id);
        this.instrument = instrument;
    }

    @Override
    public double getPrix() {
        double supplement = 9.0;
        String nom = instrument.getNomInstrument().toLowerCase();

        if (nom.equals("guitare")) supplement = 7.5;
        else if (nom.equals("piano")) supplement = 10.5;

        return this.prix + supplement;
    }

    @Override
    public String getInfos() {
        return "Numéro : " + idCours + " Instrument : " + instrument.getNomInstrument();
    }
}