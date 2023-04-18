module com.mycompany.calcularidade {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.calcularidade to javafx.fxml;
    exports com.mycompany.calcularidade;
}
