package sio.demo2.Modele;

public abstract class Cours implements ICalcul, Comparable<Cours>  {
    protected int idCours;
    protected double prix = 5.0;

    public Cours(int idCours) {
        this.idCours = idCours;
    }
    public abstract String getInfos();
    @Override
    public int compareTo(Cours autre) {
        return Double.compare(this.getPrix(), autre.getPrix());
    }

}
