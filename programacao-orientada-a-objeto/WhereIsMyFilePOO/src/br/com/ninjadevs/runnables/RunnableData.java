package br.com.ninjadevs.runnables;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

import br.com.ninjadevs.controllers.FileLocator;

public class RunnableData implements Runnable {
	File directory;
	LocalDate start;
	ArrayList<File> result;

	public RunnableData(File container, LocalDate start, ArrayList<File> result) {
		super();
		this.directory = container;
		this.start = start;
		this.result = result;
	}

	@Override
	public void run() {

		FileLocator.searchFileByDate(directory, start, result);
	}

}
