package br.com.ninjadevs.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import br.com.ninjadevs.models.FileContainer;
import br.com.ninjadevs.runnables.RunnableDoPerifa;

public class TesteDoPeriferico {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();

		
		ArrayList<File> result = new ArrayList<>();
		
		FileContainer container = new FileContainer("/home");
		
		Thread thread = new Thread(new RunnableDoPerifa(container, "batataFrita", result));
		
//		for (File file: result){
//			
//			System.out.println(file.getAbsolutePath());
//		}
		
		thread.start();
		
		int i = 0;
		
		while (thread.isAlive()){
			
			if (result.size() > i){
				
				i++;
				
				if (result.get(i-1) != null){
				
					try {
						System.out.println(result.get(i-1).getCanonicalPath());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		}
		
		System.out.println(result.size());
		
		System.out.println(System.currentTimeMillis() - start);
	}
}
