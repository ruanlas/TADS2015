/**
 * 
 * This class serves as a file handle, and performs the necessary operations to work with them, 
 * such as showing visible or hidden files.
 * @author Daniel Brai - Arthur Rozado
 * 
 */

package br.com.ninjadevs.controllers;

import java.io.File;
import java.util.ArrayList;

import br.com.ninjadevs.models.FileContainer;

public class FileHandler {

	/**
	 * Gets all visible files contained in the specified folder.
	 * 
	 * @param currentDirectory
	 *            The folder that contains all other directories and files,
	 *            which we're currently.
	 * @return A ArrayList containing the files that can be displayed.
	 */
	public static ArrayList<File> getVisibleFiles(FileContainer targetDirectory) {
		ArrayList<File> visibleFiles = new ArrayList<>();

		for (int i = 0; i < targetDirectory.getFiles().size(); i++) {
			if (!targetDirectory.getFiles().get(i).isHidden()) {
				System.out.println(targetDirectory.getFiles().get(i).getName());
			}
		}
		return visibleFiles;
	}

	/**
	 * Gets all hidden files contained in the specified folder.
	 * 
	 * @param currentDirectory
	 *            The folder that contains all other directories and files,
	 *            which we're currently.
	 * @return A ArrayList containing the files that can't be displayed.
	 */
	public static ArrayList<File> getHiddenFiles(FileContainer targetDirectory) {
		ArrayList<File> hiddenFiles = new ArrayList<>();

		for (int i = 0; i < targetDirectory.getFiles().size(); i++) {
			if (targetDirectory.getFiles().get(i).isHidden()) {
				System.out.println(targetDirectory.getFiles().get(i).getName());
			}
		}
		return hiddenFiles;
	}
}
