package br.com.ninjadevs.runnables;

import java.io.File;
import java.util.ArrayList;

import br.com.ninjadevs.controllers.FileLocator;

public class RunnableDoPerifa implements Runnable {

	File container;
	String text;
	ArrayList<File> result;

	public RunnableDoPerifa(File container, String text, ArrayList<File> result) {

		this.container = container;
		this.text = text;
		this.result = result;
	}

	@Override
	public void run() {
		FileLocator.searchFile(container, text, result);
	}

}
