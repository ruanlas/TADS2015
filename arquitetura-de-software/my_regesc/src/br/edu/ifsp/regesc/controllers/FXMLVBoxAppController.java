
package br.edu.ifsp.regesc.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;


public class FXMLVBoxAppController implements Initializable {
    @FXML
    private Menu menuCadastros;
    @FXML
    private MenuItem menuItemAlunos;
    @FXML
    private MenuItem menuItemCursos;
    @FXML
    private Menu menuHelp;
    @FXML
    private AnchorPane anchorPane;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    
    @FXML
    public void handleMenuCadastrosAlunos() throws IOException {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
        AnchorPane ap = (AnchorPane) FXMLLoader.load(getClass().getResource("/br/edu/ifsp/regesc/views/FXMLAnchorPaneCadastrosAlunos.fxml"));
        this.anchorPane.getChildren().setAll(ap);
    }
    
}
