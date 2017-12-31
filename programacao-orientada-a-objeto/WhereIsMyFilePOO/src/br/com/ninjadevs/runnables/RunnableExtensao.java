package br.com.ninjadevs.runnables;

import java.io.File;
import java.util.ArrayList;

import br.com.ninjadevs.controllers.FileLocator;

public class RunnableExtensao implements Runnable {

	File directory;
	String text;
	ArrayList<File> result;

	public RunnableExtensao(File directory, String text, ArrayList<File> result) {
		super();
		this.directory = directory;
		this.text = text;
		this.result = result;
	}

	@Override
	public void run() {

		FileLocator.searchFile(directory, text, result);
	}

}
