package br.com.ninjadevs.favorites;

import br.com.ninjadevs.favorites.serialize.Favorite;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FavoriteProperty {

	private StringProperty name;
	private StringProperty dir;
	
	public FavoriteProperty(Favorite f) {
	
		this.name = new SimpleStringProperty(f.name);
		this.dir = new SimpleStringProperty(f.dir);
	}

	public final StringProperty getName() {
		return name;
	}

	public final void setName(StringProperty name) {
		this.name = name;
	}

	public final StringProperty getDir() {
		return dir;
	}

	public final void setDir(StringProperty dir) {
		this.dir = dir;
	}
	
}
