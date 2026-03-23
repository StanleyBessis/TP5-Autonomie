package sio.demo2.Modele;

public class CourIndividuel extends Cours {
    private Instrument instrument;

    public CoursIndividuel(int id, Instrument instrument) {
        super(id);
        this.instrument = instrument;
    }

    @Override
    public String getInfos() {
        return "";
    }

    @Override
    public double getPrix() {
        return 0;
    }
}
