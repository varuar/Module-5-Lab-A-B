package MODULE5LABA.mavenproject1;

import java.io.IOException;
import javafx.fxml.FXML;

public class FXMLExampleController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
