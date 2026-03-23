module sio.demo2 {
    requires javafx.controls;
    requires javafx.fxml;

    // Autorise JavaFX à lire ton contrôleur
    opens sio.demo2 to javafx.fxml;

    // LA LIGNE MAGIQUE : Autorise le TableView à lire tes objets Cours, Instrument, etc.
    opens sio.demo2.Modele to javafx.base;

    exports sio.demo2;
}