package br.com.ninjadevs.tests;

import br.com.ninjadevs.controllers.DirectoryHandler;
import br.com.ninjadevs.controllers.FileLocator;
import br.com.ninjadevs.models.FileContainer;

public class TestaDirectoryHandler {

	public static void main(String[] args) {
		FileContainer myFolder = new FileContainer();

		System.out.println(myFolder.getRoot());
		// DirectoryHandler.showVisibleDirectories(myFolder);
		// DirectoryHandler.showVisibleFiles(myFolder);

		System.out.println(DirectoryHandler.openDirectory(myFolder, "Documents"));
		System.out.println(myFolder.getRoot());
		DirectoryHandler.showVisibleDirectories(myFolder);
		// DirectoryHandler.showVisibleFiles(myFolder);

		System.out.println(FileLocator.isInDirectory(myFolder, "faculdade"));

		DirectoryHandler.openDirectory(myFolder, "Documents");

		// System.out.println(myFolder.getRoot());

		// File teste = new File("/home/brai");
		// System.out.println(teste.separator);

	}

}
