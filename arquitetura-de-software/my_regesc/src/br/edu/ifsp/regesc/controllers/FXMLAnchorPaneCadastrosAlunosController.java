
package br.edu.ifsp.regesc.controllers;

import br.edu.ifsp.regesc.dao.StudentDAO;
import br.edu.ifsp.regesc.models.Student;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;


public class FXMLAnchorPaneCadastrosAlunosController implements Initializable {
    @FXML
    private TableView<Student> tableViewAlunos;
    @FXML
    private TableColumn<Student, Long> tableColumnId;
    @FXML
    private TableColumn<Student, String> tableColumnNome;
    @FXML
    private TableColumn<Student, Integer> tableColumnIdade;
    @FXML
    private Label labelId;
    @FXML
    private Label labelNome;
    @FXML
    private Label labelIdade;

    
    private List<Student> studentList;
    private ObservableList<Student> studentObservableList;
    
    private StudentDAO dao;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.dao = new StudentDAO();
        
        loadStudents();

        // Listen acionado diante de quaisquer alterações na seleção de itens do TableView
        tableViewAlunos.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> selectItemTableViewAlunos(newValue));
        
        // double click on a table row
//        tableViewAlunos.setOnMousePressed(new EventHandler<MouseEvent>() {
//            @Override 
//            public void handle(MouseEvent event) {
//                if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
//                    System.out.println(tableViewAlunos.getSelectionModel().getSelectedItem());                   
//                }
//            }
//        });
    }
    
    
    public void loadStudents() {
        this.studentList = this.dao.findAll();
        
        this.tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("name")); // a string é o nome do atributo da classe do objeto
        
        this.studentObservableList = FXCollections.observableArrayList(studentList);
        tableViewAlunos.setItems(studentObservableList);
    }
    
    
    public void selectItemTableViewAlunos(Student student) {
        System.out.println(student);
        if (student == null) {
            labelId.setText("");
            labelNome.setText("");
            labelIdade.setText("");
        } else {
            labelId.setText(String.valueOf(student.getId()));
            labelNome.setText(student.getName());
            labelIdade.setText(String.valueOf(student.getAge()));
        }
    }
}
