package br.com.ninjadevs.controllers;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FileOrganizer {

	/**
	 * Sorts a file List, organizing its content by name, in alphabetical order.
	 * 
	 * @param entries
	 *            The folder that contains all directories and files, which
	 *            we're wish sort.
	 * @return A ArrayList containing the files after the sort method.
	 */

	public static ArrayList<File> sortByNameAscending(List<File> entries) {

		Collections.sort(entries, new Comparator<File>() {
			public int compare(File fileA, File fileB) {
				return fileA.getName().toUpperCase().compareToIgnoreCase(fileB.getName().toUpperCase());
			}
		});
		return null;
	}

	/**
	 * Sorts a file List, organizing its content by name, in inversal
	 * alphabetical order.
	 * 
	 * @param entries
	 *            The folder that contains all directories and files, which
	 *            we're wish sort.
	 * @return A ArrayList containing the files after the sort method.
	 */

	public static ArrayList<File> sortByNameDescending(List<File> entries) {

		Collections.sort(entries, new Comparator<File>() {
			public int compare(File fileA, File fileB) {
				return -(fileA.getName().toUpperCase().compareToIgnoreCase(fileB.getName().toUpperCase()));
			}
		});
		return null;
	}

	/**
	 * Sorts a file List, organizing its content by file length, in ascending
	 * order.
	 * 
	 * @param entries
	 *            The folder that contains all directories and files, which
	 *            we're wish sort.
	 * @return A ArrayList containing the files after the sort method.
	 */
	public static ArrayList<File> sortByAscendingSize(List<File> entries) {
		Collections.sort(entries, new Comparator<File>() {
			public int compare(File fileA, File fileB) {
				if (fileA.length() < fileB.length()) {
					return -1;
				}
				if (fileA.length() > fileB.length()) {
					return 1;
				}
				return 0;
			}
		});
		return null;
	}

	/**
	 * Sorts a file List, organizing its content by file length, in descending
	 * order.
	 * 
	 * @param entries
	 *            The folder that contains all directories and files, which
	 *            we're wish sort.
	 * @return A ArrayList containing the files after the sort method.
	 */
	public static ArrayList<File> sortByDescendingSize(List<File> entries) {
		Collections.sort(entries, new Comparator<File>() {
			public int compare(File fileA, File fileB) {
				if (fileA.length() > fileB.length()) {
					return -1;
				}
				if (fileA.length() < fileB.length()) {
					return 1;
				}
				return 0;
			}
		});
		return null;
	}

	/**
	 * Sorts a file List, arranging its content by its last modified date, in
	 * ascending order.
	 * 
	 * @param entries
	 *            The folder that contains all directories and files, which
	 *            we're wish sort.
	 * @return A ArrayList containing the files after the sort method.
	 */
	public static ArrayList<File> sortByDateAscending(List<File> entries) {
		Collections.sort(entries, new Comparator<File>() {
			public int compare(File fileA, File fileB) {
				if (Instant.ofEpochMilli(fileA.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate().isAfter(
						Instant.ofEpochMilli(fileB.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate())) {
					return -1;
				}
				if (Instant.ofEpochMilli(fileA.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate().isBefore(
						Instant.ofEpochMilli(fileB.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate())) {
					return 1;
				}
				return 0;
			}
		});
		return null;

	}

	/**
	 * Sorts a file List, arranging its content by its last modified date, in
	 * descending order.
	 * 
	 * @param entries
	 *            The folder that contains all directories and files, which
	 *            we're wish sort.
	 * @return A ArrayList containing the files after the sort method.
	 */
	public static ArrayList<File> sortByDateDescending(List<File> entries) {
		Collections.sort(entries, new Comparator<File>() {
			public int compare(File fileA, File fileB) {
				if (Instant.ofEpochMilli(fileA.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate().isBefore(
						Instant.ofEpochMilli(fileB.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate())) {
					return -1;
				}
				if (Instant.ofEpochMilli(fileA.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate().isAfter(
						Instant.ofEpochMilli(fileB.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate())) {
					return 1;
				}
				return 0;
			}
		});
		return null;

	}
}
