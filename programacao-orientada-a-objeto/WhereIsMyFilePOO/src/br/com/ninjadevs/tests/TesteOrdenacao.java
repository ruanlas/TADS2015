package br.com.ninjadevs.tests;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

import br.com.ninjadevs.controllers.FileLocator;
import br.com.ninjadevs.controllers.FileOrganizer;
import br.com.ninjadevs.models.FileContainer;
import br.com.ninjadevs.models.Metadata;

public class TesteOrdenacao {

	public static void main(String[] args) {

		long startProgram = System.currentTimeMillis();

		ArrayList<File> result = new ArrayList<>();

		FileContainer directory = new FileContainer("/home");

		FileLocator.searchFileByDate(directory, LocalDate.of(2016, 10, 16), result);

		FileOrganizer.sortByNameDescending(result);

		for (File file : result) {
			Metadata data = new Metadata(file);
			System.out.println(file.getName() + " ---- " + data.getLastModifiedFormated());
		}

		System.out.println("Total de entradas: " + result.size());

		System.out.println(System.currentTimeMillis() - startProgram);
	}
}
