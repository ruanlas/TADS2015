package br.com.ninjadevs.tests;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import br.com.ninjadevs.models.FileContainer;
import br.com.ninjadevs.models.Metadata;
import br.com.ninjadevs.runnables.RunnableData;

public class TesteComDatas {

	public static void main(String[] args) {

		long startProgram = System.currentTimeMillis();

		LocalDate start = LocalDate.of(2016, 10, 16);

		ArrayList<File> result = new ArrayList<>();

		FileContainer directory = new FileContainer("/home");

		Thread thread = new Thread(new RunnableData(directory, start, result));

		System.out.println("Comecei!");

		thread.start();

		int i = 0;

		while (thread.isAlive()) {

			if (result.size() > i) {

				i++;

				if (result.get(i - 1) != null) {

					try {
						Metadata meta = new Metadata(result.get(i - 1));
						System.out.println(
								result.get(i - 1).getCanonicalPath() + " ---- " + meta.getLastModifiedFormated());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}

		System.out.println(result.size());

		System.out.println(System.currentTimeMillis() - startProgram);

	}

}
