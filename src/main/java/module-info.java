module aerodeparture {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;

    opens aerodeparture to javafx.fxml;
    exports aerodeparture;
}
