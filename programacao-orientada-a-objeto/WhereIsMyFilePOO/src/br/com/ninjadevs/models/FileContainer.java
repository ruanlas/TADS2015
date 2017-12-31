package br.com.ninjadevs.models;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileContainer extends File {

	private static final long serialVersionUID = 1L;
	private Path root = null;
	ArrayList<File> directories = null;
	ArrayList<File> files = null;

	public FileContainer() {
		super(System.getProperty("user.home"));
		root = Paths.get(System.getProperty("user.home") + File.separator);

		this.prepareContent();
	}

	public FileContainer(File file) {
		super(file.getAbsolutePath());
		root = Paths.get(System.getProperty("user.home") + File.separator);
		System.out.println(System.getProperty("user.home") + File.separator);

		this.prepareContent();
	}

	public FileContainer(String pathname) {
		super(pathname);
		root = Paths.get(System.getProperty("user.home") + File.separator);

		this.prepareContent();
	}

	public Path getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = Paths.get(root);
	}

	public ArrayList<File> getDirectories() {
		return directories;
	}

	public void setDirectories(ArrayList<File> directories) {
		this.directories = directories;
	}

	public ArrayList<File> getFiles() {
		return files;
	}

	public void setFiles(ArrayList<File> files) {
		this.files = files;
	}

	public void setRoot(Path root) {
		this.root = root;
	}

	public void prepareContent() {

		File[] contentList = this.listFiles();
		directories = new ArrayList<>();
		files = new ArrayList<>();

		if (this.isFile()) {
			return;
		}

		if (!this.canRead()) {
			return;
		}

		for (File file : contentList) {

			if (file.isDirectory()) {
				directories.add(file);
			} else if (file.isFile()) {
				files.add(file);
			}
		}
	}
}
