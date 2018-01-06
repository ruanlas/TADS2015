package jogo.pokemongol.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import jogo.pokemongol.dao.PokemonDAO;
import jogo.pokemongol.models.Pokemon;

public class APConsultaPokemonController implements Initializable{
	
	@FXML
	private TableView<Pokemon> tbViewPokemon;
	@FXML
	private TableColumn<Pokemon, Long> columnId;
	@FXML
	private TableColumn<Pokemon, String> columnNome;
	@FXML
	private Label lblId;
	@FXML
	private Label lblNome;
	@FXML
	private Label lblXp;
	@FXML
	private Label lblIdTreinador;
	
	private ArrayList<Pokemon> pokemonList;
	private ObservableList<Pokemon> pokemonObservableList;
	private PokemonDAO dao = new PokemonDAO();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		loadTableViewPokemons();
		
		tbViewPokemon.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> selectItemTableViewPokemon(newValue));
	}
	
	private void selectItemTableViewPokemon(Pokemon newValue) {
		if(newValue != null){
			lblId.setText(String.valueOf(newValue.getId()));
			lblIdTreinador.setText(String.valueOf(newValue.getTreinador_id()));
			lblNome.setText(String.valueOf(newValue.getNome()));
			lblXp.setText(String.valueOf(newValue.getXp()));
		}
	}

	public void	loadTableViewPokemons() {
		this.pokemonList = dao.listAll();
		
		columnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		
		this.pokemonObservableList = FXCollections.observableArrayList(this.pokemonList);
		this.tbViewPokemon.setItems(this.pokemonObservableList);
	}
	

}
