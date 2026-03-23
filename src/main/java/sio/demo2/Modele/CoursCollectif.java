package sio.demo2.Modele;

public class CoursCollectif extends Cours {
    private String nomCours;
    private int ageMini;
    private int nbPlacesMax;

    public CoursCollectif(int id, double prix, String nom, int age, int places) {
        super(id);
        this.prix = prix;
        this.nomCours = nom;
        this.ageMini = age;
        this.nbPlacesMax = places;
    }

    @Override
    public double getPrix() {
        double supplement;
        if (ageMini < 10) supplement = 12.0;
        else if (ageMini < 20) supplement = 15.0;
        else supplement = 17.0;

        return this.prix + supplement;
    }

    @Override
    public String getInfos() {
        return "Numéro : " + idCours + " Nom : " + nomCours + " Age mini : " + ageMini + " Nb Places : " + nbPlacesMax; // [cite: 52, 65]
    }
}