package br.com.ninjadevs.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import br.com.ninjadevs.models.FileContainer;
import br.com.ninjadevs.runnables.RunnableExtensao;

public class TesteComExtensao {
	public static void main(String[] args) {

		long startProgram = System.currentTimeMillis();

		ArrayList<File> result = new ArrayList<>();

		FileContainer directory = new FileContainer("/home");

		Thread thread = new Thread(new RunnableExtensao(directory, "txt", result));

		System.out.println("Comecei!");

		thread.start();

		int i = 0;

		while (thread.isAlive()) {

			if (result.size() > i) {

				i++;

				if (result.get(i - 1) != null) {

					try {
						System.out.println(result.get(i - 1).getCanonicalPath());
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
