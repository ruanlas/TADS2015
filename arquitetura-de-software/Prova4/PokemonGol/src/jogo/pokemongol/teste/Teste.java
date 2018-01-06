package jogo.pokemongol.teste;

import jogo.pokemongol.dao.PokemonDAO;
import jogo.pokemongol.dao.TreinadorDAO;
import jogo.pokemongol.db.ConnectionFactory;
import jogo.pokemongol.models.Pokemon;
import jogo.pokemongol.models.Treinador;

public class Teste {
	public static void main(String[] args) {
//		Pokemon pokemon = new Pokemon("Pokemon1", 322, null);
		PokemonDAO dao = new PokemonDAO();
//		dao.insertPokemon(pokemon);
		Treinador treinador = new Treinador("Ruan Silva", "Valinhos", 22);
		TreinadorDAO daot = new TreinadorDAO();
//		daot.insertTreinador(treinador);
		
		for (Pokemon poke : dao.listAll()) {
			System.out.println(poke);
		}
		System.out.println();
		for (Treinador trein : daot.listAll()) {
			System.out.println(trein);
		}
		
	}
}
