package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ImageView btn_settings, btn_user, btn_rewards, btn_smedia,btn_close,img_userstn;
    @FXML
    private ImageView img_sortA1,img_sortA2,img_sortA3,img_sortA4;

    @FXML
    private AnchorPane pane_settings, pane_user, pane_rewards, pane_smedia;

    @FXML
    private void handleButtonAction (MouseEvent event ) {
        if (event.getTarget() == btn_settings) {
            pane_settings.setVisible(true);
            pane_user.setVisible(false);
            pane_rewards.setVisible(false);
            pane_smedia.setVisible(false);
        }
        else if (event.getTarget() == btn_user) {
            pane_user.setVisible(true);
            pane_settings.setVisible(false);
            pane_rewards.setVisible(false);
            pane_smedia.setVisible(false);
        }
        else if (event.getTarget() == btn_rewards) {
            pane_user.setVisible(false);
            pane_settings.setVisible(false);
            pane_rewards.setVisible(true);
            pane_smedia.setVisible(false);
        }
        else if (event.getTarget() == btn_smedia) {
            pane_user.setVisible(false);
            pane_settings.setVisible(false);
            pane_rewards.setVisible(false);
            pane_smedia.setVisible(true);
        }
        else if (event.getTarget() == btn_close) {
            pane_user.setVisible(false);
            pane_settings.setVisible(false);
            pane_rewards.setVisible(false);
            pane_smedia.setVisible(false);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btn_settings.setImage(
                new Image("iconset.png")
        );

        btn_user.setImage(
                new Image("icons8-user-40.png")
        );
        btn_rewards.setImage(
                new Image("icons8-medal-30.png")
        );
        btn_smedia.setImage(
                new Image("icons8-instagram-50.png")
        );
        btn_close.setImage(
                new Image("icons8-shutdown-48.png")
        );
        img_userstn.setImage(
                new Image("icons8-user-50.png")
        );

        File file = new File("C:\\Users\\dilra\\eclipse-workspace\\taskbar_FX\\resources\\icons8-sort-up-50.png");
        Image image = new Image(file.toURI().toString());
        img_sortA2.setImage(image);
        img_sortA3.setImage(image);
        img_sortA4.setImage(image);
        img_sortA1.setImage(image);
    }
}
