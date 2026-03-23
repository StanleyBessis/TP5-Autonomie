    package sio.demo2;

    import javafx.collections.FXCollections;
    import javafx.fxml.FXML;
    import javafx.fxml.Initializable;
    import javafx.scene.control.Label;
    import javafx.scene.control.TableColumn;
    import javafx.scene.control.TableView;
    import javafx.scene.control.cell.PropertyValueFactory;
    import sio.demo2.Modele.Cours;
    import sio.demo2.Modele.CoursCollectif;
    import sio.demo2.Modele.CoursIndividuel;
    import sio.demo2.Modele.Instrument;

    import java.net.URL;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.ResourceBundle;

    public class HelloController implements Initializable {

        @FXML
        private TableView<Cours> tvCours;
        @FXML
        private TableColumn<Cours, String> tcDescription;
        @FXML
        private TableColumn<Cours, Double> tcPrix;

        @Override
        public void initialize(URL url, ResourceBundle rb) {
            ArrayList<Cours> lesCours = new ArrayList<>();


            Instrument guitare = new Instrument(1, "Guitare");
            Instrument piano = new Instrument(2, "Piano");


            lesCours.add(new Cours(1) {
                public double getPrix() {
                    return prix;
                }

                public String getInfos() {
                    return "Numéro : " + idCours;
                }
            });
            lesCours.add(new Cours(2) {
                public double getPrix() {
                    return prix;
                }

                public String getInfos() {
                    return "Numéro : " + idCours;
                }
            });


            lesCours.add(new CoursIndividuel(5, guitare));
            lesCours.add(new CoursIndividuel(6, piano));
            lesCours.add(new CoursCollectif(3, 5.0, "Apprendre le solfège", 7, 15));
            lesCours.add(new CoursCollectif(4, 5.0, "Chorale - Adultes", 18, 30));


            Collections.sort(lesCours);


            tcDescription.setCellValueFactory(new PropertyValueFactory<>("infos"));
            tcPrix.setCellValueFactory(new PropertyValueFactory<>("prix"));
            tvCours.setItems(FXCollections.observableArrayList(lesCours));
        }
    }