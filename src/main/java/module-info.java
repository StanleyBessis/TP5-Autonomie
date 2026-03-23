module sio.demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.demo2 to javafx.fxml;
    exports sio.demo2;
}