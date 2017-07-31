package br.com.ninjadevs.runnables;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

import br.com.ninjadevs.controllers.FileLocator;

public class RunnableIntervalo implements Runnable {

	File directory;
	LocalDate start, end;
	ArrayList<File> result;

	public RunnableIntervalo(File container, LocalDate start, LocalDate end, ArrayList<File> result) {
		super();
		this.directory = container;
		this.start = start;
		this.end = end;
		this.result = result;
	}

	@Override
	public void run() {

		FileLocator.searchFileByInterval(directory, start, end, result);
	}

}
