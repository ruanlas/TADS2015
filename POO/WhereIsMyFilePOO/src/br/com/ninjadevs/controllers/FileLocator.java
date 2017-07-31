/**
 * This class contains methods to find files and directories.
 * @author Daniel Brai - Arthur Rozado
 * 
 */

package br.com.ninjadevs.controllers;

import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;

import br.com.ninjadevs.models.FileContainer;

public class FileLocator {

	/**
	 * Verifies if target file or directory is in specified folder.
	 * 
	 * @param directory
	 *            The folder to search.
	 * @param target
	 *            The folder or file which intends to find.
	 * @return true if the search term is in directory or false otherwise.
	 */
	public static boolean isInDirectory(FileContainer directory, String target) {
		for (int index = 0; index < directory.getDirectories().size(); index++) {
			if (directory.getDirectories().get(index).getName().equals(target)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Searches a file or folder in a specific directory. If an occurrence is
	 * located, it is added to the list provided.
	 * 
	 * @param directory
	 *            The folder to search.
	 * @param target
	 *            The folder or file which intends to find.
	 * @param result
	 *            The list that will be the recipient of the occurrences that
	 *            are found..
	 */
	public static void searchFile(File directory, String target, ArrayList<File> result) {
		try {

			File[] files = directory.listFiles();

			if (files != null) {

				for (File file : files) {

					if (file.canRead() && file != null) {

						if (file.getName().contains(target)) {
							result.add(file);
						}

						if (file.isDirectory()) {
							searchFile(file, target, result);

						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Searches a file or folder in a specific directory; this search isn't case
	 * sensitive. If an occurrence is located, it is added to the list provided.
	 * 
	 * @param directory
	 *            The folder to search.
	 * @param target
	 *            The folder or file which intends to find.
	 * @param result
	 *            The list that will be the recipient of the occurrences that
	 *            are found..
	 */
	public static void searchFileIgnoreCaseSensitive(File directory, String target, ArrayList<File> result) {
		try {

			File[] files = directory.listFiles();

			if (files != null) {

				for (File file : files) {

					if (file.canRead() && file != null) {

						// if (file.getName().contains(target)) {
						// result.add(file);
						// }

						if (file.getName().toLowerCase().contains(target.toLowerCase())) {
							result.add(file);
						}

						if (file.isDirectory()) {
							searchFileIgnoreCaseSensitive(file, target, result);

						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Searches a file or folder in a specific directory that matches the
	 * interval passed. If an occurrence is located, it is added to the list
	 * provided.
	 * 
	 * @param directory
	 *            The folder to search.
	 * @param target
	 *            The folder or file which intends to find.
	 * @param result
	 *            The list that will be the recipient of the occurrences that
	 *            are found..
	 */
	public static void searchFileByInterval(File directory, LocalDate start, LocalDate end, ArrayList<File> result) {
		try {

			File[] files = directory.listFiles();

			if (files != null) {

				for (File file : files) {

					if (file.canRead() && file != null) {

						if ((Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate()
								.isAfter(start))
								&& (Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault())
										.toLocalDate().isBefore(end))) {
							result.add(file);
						}

						if (file.isDirectory()) {
							searchFileByInterval(file, start, end, result);

						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Searches a file or folder in a specific directory that matches the date
	 * passed. If an occurrence is located, it is added to the list provided.
	 * 
	 * @param directory
	 *            The folder to search.
	 * @param target
	 *            The folder or file which intends to find.
	 * @param result
	 *            The list that will be the recipient of the occurrences that
	 *            are found..
	 */
	public static void searchFileByDate(File directory, LocalDate target, ArrayList<File> result) {
		try {

			File[] files = directory.listFiles();

			if (files != null) {

				for (File file : files) {

					if (file.canRead() && file != null) {

						if (Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate()
								.equals(target)) {
							result.add(file);
						}

						if (file.isDirectory()) {
							searchFileByDate(file, target, result);

						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Searches a file or folder in a specific directory that matches the file
	 * format provided. If an occurrence is located, it is added to the list
	 * provided.
	 * 
	 * @param directory
	 *            The folder to search.
	 * @param target
	 *            The folder or file which intends to find.
	 * @param result
	 *            The list that will be the recipient of the occurrences that
	 *            are found..
	 */
	public static void searchFileByExtension(File directory, String extension, ArrayList<File> result) {
		try {

			File[] files = directory.listFiles();

			if (files != null) {

				for (File file : files) {

					if (file.canRead() && file != null) {

//						if (file.getName().contains(target)) {
//						 result.add(file);
//						}
						
//						int delimiter = file.getName().lastIndexOf('.');
//
//						if (file.getName().substring(delimiter).equals(extension.toLowerCase())) {
//							result.add(file);
//						}
						
						if(file.getName().endsWith(extension.toLowerCase())){
							result.add(file);
						}

						if (file.isDirectory()) {
							searchFileByExtension(file, extension, result);

						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
