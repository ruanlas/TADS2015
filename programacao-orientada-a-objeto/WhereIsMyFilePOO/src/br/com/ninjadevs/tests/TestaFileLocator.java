package br.com.ninjadevs.tests;

import java.io.File;
import java.util.ArrayList;

import br.com.ninjadevs.controllers.DirectoryHandler;
import br.com.ninjadevs.controllers.FileLocator;
import br.com.ninjadevs.models.FileContainer;
import br.com.ninjadevs.models.Metadata;

public class TestaFileLocator {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();


		FileContainer directory = new FileContainer();
		Metadata meta = new Metadata(directory);
						
		System.out.println(meta.getName());
		System.out.println(meta.getLocal());
		System.out.println(meta.getConvertedSize());
		System.out.println(meta.getType());
		System.out.println(meta.getLastModifiedFormated());	
		System.out.println(meta.getVisibility());	
		System.out.println();
		
		ArrayList<File> result = new ArrayList<>();
		
		System.out.println(directory.getRoot());
		
		FileLocator.searchFile(directory, "manjaro", result);
		
		for (File file : result){
			Metadata meta2 = new Metadata(file);
			
			System.out.println(meta2.getName());
			System.out.println(meta2.getLocal());
			System.out.println(meta2.getConvertedSize());
			System.out.println(meta2.getType());
			System.out.println(meta2.getLastModifiedFormated());	
			System.out.println(meta2.getVisibility());				
			System.out.println(meta2.getPermissions());	
			System.out.println(" ");
		}
		
		DirectoryHandler.openDirectory(directory, "Documents");
		
		System.out.println(directory.getRoot());
		

		System.out.println(System.currentTimeMillis() - start);
		
		
		
	}

}
