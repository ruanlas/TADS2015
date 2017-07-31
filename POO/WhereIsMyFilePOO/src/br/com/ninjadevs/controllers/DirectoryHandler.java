/**
 * 
 * This class acts as a directory handler, and provides the basic operations to work with them, 
 * such as opening, navigation and presentation of its contents.
 * @author Daniel Brai Arthur Rozado
 * 
 */
package br.com.ninjadevs.controllers;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.ninjadevs.models.FileContainer;

public class DirectoryHandler {

	/**
	 * Open the target directory from current folder.
	 * 
	 * @param currentDirectory
	 *            The folder that contains all other directories and files,
	 *            which we're currently.
	 * @param directoryToOpen
	 *            The directory to be opened.
	 * @return true if the target directory can be accessed or false otherwise.
	 */
	public static boolean openDirectory(FileContainer currentDirectory, String directoryToOpen) {
		try {
			currentDirectory.setRoot(Paths
					.get(currentDirectory.getRoot().toString() + File.separator + directoryToOpen + File.separator));
			currentDirectory.prepareContent();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	/**
	 * Open the target directory from current folder.
	 * 
	 * @param currentDirectory
	 *            The folder that contains all other directories and files,
	 *            which we're currently.
	 * @param directoryToOpen
	 *            The directory to be opened.
	 * @return true if the target directory can be accessed or false otherwise.
	 */
	public static boolean openDirectory(FileContainer currentDirectory, File directoryToOpen) {
		try {
			if ((directoryToOpen.isDirectory()) && (currentDirectory.getDirectories().contains(directoryToOpen))) {
				currentDirectory.setRoot(Paths.get(currentDirectory.getRoot().toString() + File.separator
						+ directoryToOpen.getName() + File.separator));
				currentDirectory.prepareContent();
				return true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	/**
	 * Returns a level in the path, to parent directory if exists.
	 * 
	 * @param currentDirectory
	 *            The folder that contains all other directories and files,
	 *            which we're currently.
	 * @return true if the parent directory can be accessed or false otherwise.
	 */
	public static boolean returnToParent(FileContainer currentDirectory) {
		try {
			currentDirectory.setRoot(currentDirectory.getRoot().getParent());
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	/**
	 * Returns to root directory, that is the user's home folder.
	 * 
	 * @param currentDirectory
	 *            The folder that contains all other directories and files,
	 *            which we're currently.
	 * @return true if the root directory can be accessed or false otherwise.
	 */
	public static boolean returnToRoot(FileContainer currentDirectory) {
		try {
			currentDirectory.setRoot(currentDirectory.getAbsolutePath());
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	/**
	 * Shows the name of all directories in the specified folder.
	 * 
	 * @param currentDirectory
	 *            The folder that contains all other directories and files,
	 *            which we're currently.
	 */
	public static void showDirectories(FileContainer currentDirectory) {
		for (File folder : currentDirectory.getDirectories()) {
			System.out.println(folder.getName());
		}
	}

	/**
	 * Shows the name of all files in the specified folder.
	 * 
	 * @param currentDirectory
	 *            The folder that contains all other directories and files,
	 *            which we're currently.
	 */
	public static void showFiles(FileContainer currentDirectory) {
		for (File file : currentDirectory.getFiles()) {
			System.out.println(file.getName());
		}
	}

	/**
	 * Gets all visible directories contained in the specified folder.
	 * 
	 * @param currentDirectory
	 *            The folder that contains all other directories and files,
	 *            which we're currently.
	 * @return A ArrayList containing the directories that can be displayed.
	 */
	public static ArrayList<File> getVisibleDirectories(FileContainer targetDirectory) {
		ArrayList<File> visibleDirectories = new ArrayList<>();

		for (int i = 0; i < targetDirectory.getDirectories().size(); i++) {
			if (!targetDirectory.getDirectories().get(i).isHidden()) {
				System.out.println(targetDirectory.getDirectories().get(i).getName());
			}
		}
		return visibleDirectories;
	}

	/**
	 * Gets all hidden directories contained in the specified folder.
	 * 
	 * @param currentDirectory
	 *            The folder that contains all other directories and files,
	 *            which we're currently.
	 * @return A ArrayList containing the directories that can't be displayed.
	 */
	public static ArrayList<File> getHiddenDirectories(FileContainer targetDirectory) {
		ArrayList<File> hiddenDirectories = new ArrayList<>();

		for (int i = 0; i < targetDirectory.getDirectories().size(); i++) {
			if (targetDirectory.getDirectories().get(i).isHidden()) {
				System.out.println(targetDirectory.getDirectories().get(i).getName());
			}
		}
		return hiddenDirectories;
	}

	/**
	 * Shows the name of all directories in the specified folder that can be
	 * displayed.
	 * 
	 * @param currentDirectory
	 *            The folder that contains all other directories and files,
	 *            which we're currently.
	 */
	public static void showVisibleDirectories(FileContainer currentDirectory) {
		for (File folder : currentDirectory.getDirectories()) {
			if (!folder.isHidden()) {
				System.out.println(folder.getName());
			}
		}
	}

	/**
	 * Shows the name of all files in the specified folder that can be
	 * displayed.
	 * 
	 * @param currentDirectory
	 *            The folder that contains all other directories and files,
	 *            which we're currently.
	 */
	public static void showVisibleFiles(FileContainer currentDirectory) {
		for (File file : currentDirectory.getFiles()) {
			if (!file.isHidden()) {
				System.out.println(file.getName());
			}
		}
	}
}
