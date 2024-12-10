module com.example.universidadesistema {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.universidadesistema to javafx.fxml;
    exports com.example.universidadesistema;
}