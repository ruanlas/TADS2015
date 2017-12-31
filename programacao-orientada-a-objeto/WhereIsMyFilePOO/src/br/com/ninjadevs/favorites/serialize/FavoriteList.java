package br.com.ninjadevs.favorites.serialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FavoriteList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6194268202620674450L;
	
	public List<Favorite> favorites;
	
	public FavoriteList() {
	
		favorites = new ArrayList<>();
		
	}
}
