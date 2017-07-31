package br.com.ninjadevs.favorites.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.ninjadevs.program.SCM;

public class SerializeFavorite {

	public FavoriteList favoriteList;
	
	public SerializeFavorite() {
	
		Deserialize();
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		Serialize();
		super.finalize();
		
	}
	
	public boolean Serialize(){
		
		try {
			
			File file = new File(SCM.userDir + SCM.separator + "Config");
			if (!file.exists()){file.mkdir();}
			
			file = new File(SCM.userDir + SCM.separator + "Config" + SCM.separator + "Favorites.ser");
			if (file.exists()){file.delete();}
			file.createNewFile();
			
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(favoriteList);
			
			objectOutputStream.close();
			fileOutputStream.close();
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
			return false;
		
		} catch (IOException e) {
			
			e.printStackTrace();
			return false;
		
		}
		
		return true;
	}
	
	public boolean Deserialize(){
		
		try {
			
			File file = new File(SCM.userDir + SCM.separator + "Config"
						+ SCM.separator + "Favorites.ser");
		
			FileInputStream fileInputStream = new FileInputStream(file);
		
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			favoriteList = (FavoriteList) objectInputStream.readObject();
			
			objectInputStream.close();
			fileInputStream.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			return false;
			
		} catch (FileNotFoundException e){
			
			restoreDefault();
			
		} catch (IOException e) {
		
			e.printStackTrace();
			return false;
			
		}
		
		return true;
	}
	
	public boolean restoreDefault(){
		
		favoriteList = new FavoriteList();
		
		if (SCM.osName.contains("Linux")){
			
			add("Home", SCM.homeFolder);
			add("Desktop", SCM.homeFolder + SCM.separator + "Desktop");
			add("Documents", SCM.homeFolder + SCM.separator + "Documents");
			add("Downloads", SCM.homeFolder + SCM.separator + "Downloads");
			add("Music", SCM.homeFolder + SCM.separator + "Music");
			add("Pictures", SCM.homeFolder + SCM.separator + "Pictures");
			add("Videos", SCM.homeFolder + SCM.separator + "Videos");
			
			Serialize();
			
		}
		
		return true;
	}
	
	public boolean add(String name, String dir){
		
		favoriteList.favorites.add(new Favorite(name, dir));
		
		return true;
	}
}
