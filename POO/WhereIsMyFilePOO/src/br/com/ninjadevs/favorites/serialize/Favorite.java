package br.com.ninjadevs.favorites.serialize;

import java.io.Serializable;

public class Favorite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1076861334475338466L;
	
	public String name;
	public String dir;
	
	public Favorite(String name, String dir) {
	
		this.name = name;
		this.dir = dir;
		
	}
}