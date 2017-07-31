package br.com.ninjadevs.controllers.listener;

import br.com.ninjadevs.controllers.FileExplorerBrowserController;
import br.com.ninjadevs.favorites.FavoriteProperty;
import br.com.ninjadevs.models.FileContainer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ListenerTableViewFavorite implements ChangeListener<FavoriteProperty> {
	
	FileExplorerBrowserController browserController;
	
	public ListenerTableViewFavorite(FileExplorerBrowserController browserController) {
		
		this.browserController = browserController;
	}
	
	@Override
	public void changed(ObservableValue<? extends FavoriteProperty> observable, FavoriteProperty oldValue, FavoriteProperty newValue) {

		if (newValue == null){return;}
		
		browserController.updateListFiles(new FileContainer(newValue.getDir().get()));
		browserController.TableViewFavorite.getSelectionModel().select(-1);
	}
}
