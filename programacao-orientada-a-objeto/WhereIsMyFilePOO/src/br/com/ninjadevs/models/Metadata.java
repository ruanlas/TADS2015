/**
 * This class is a model that represents all metadata present in a folder and/or file.
 * @author Daniel Brai - Arthur Rozado
 * 
 */

package br.com.ninjadevs.models;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Metadata {

	private String name;
	private String type;
	private String local;
	private float size;
	private long lastModified;
	private String visibility;
	private String permissions;

	/**
	 * Retrieves all metadata needed to present in GUI interface.
	 * 
	 * @param file
	 *            The target which we intent retrieve informations.
	 */
	public Metadata(File file) {
		name = file.getName();

		if (file.isFile()) {
			type = "File";
		} else {
			type = "Directory";
		}

		size = file.length();
		local = file.getAbsolutePath();
		lastModified = file.lastModified();

		if (file.isHidden()) {
			visibility = "Hidden";
		} else {
			visibility = "Visible";
		}

		if (file.canExecute() && file.canRead() && file.canWrite()) {
			this.permissions = "Execução, Leitura e Escrita";
		} else if (file.canExecute() && file.canRead() && !file.canWrite()) {
			this.permissions = "Execução e Leitura";
		} else if (file.canExecute() && !file.canRead() && file.canWrite()) {
			this.permissions = "Execução e Escrita";
		} else if (!file.canExecute() && file.canRead() && file.canWrite()) {
			this.permissions = "Leitura e Escrita";
		} else if (file.canExecute() && !file.canRead() && !file.canWrite()) {
			this.permissions = "Execução";
		} else if (!file.canExecute() && file.canRead() && !file.canWrite()) {
			this.permissions = "Leitura";
		} else if (!file.canExecute() && !file.canRead() && file.canWrite()) {
			this.permissions = "Escrita";
		}
	}

	/**
	 * @return the size
	 */
	public float getSize() {
		return size;
	}

	/**
	 * @return the permissions of file/directory.
	 */
	public String getPermissions() {
		return permissions;
	}

	/**
	 * @return the name of file/directory.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return if the target is a directory or file.
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the local where teh file/directory is located.
	 */
	public String getLocal() {
		return local;
	}

	/**
	 * @return the size of file, converted into a convenient mensure unity
	 *         (bytes, KB, MB or GB).
	 */
	public String getConvertedSize() {
		float tmp = this.size;
		int count = 0;

		while ((tmp > 1000)) {
			tmp = tmp / 1000;
			count++;
		}

		switch (count) {
		case 0:
			return tmp + " bytes";
		case 1:
			return tmp + " kilobytes";
		case 2:
			return tmp + " megabytes";
		case 3:
			return tmp + " gigabytes";
		case 4:
			return tmp + " terabytes";
		default:
			return null;
		}
	}

	/**
	 * @return the target's visibility.
	 */
	public String getVisibility() {
		return visibility;
	}

	public long getLastModified() {
		return lastModified;
	}

	/**
	 * @return the date of last modified, into a convenient format.
	 */
	public String getLastModifiedFormated() {
		return new SimpleDateFormat("EEEE, dd").format(new Date(this.lastModified)) + " de "
				+ new SimpleDateFormat("MMMM").format(new Date(this.lastModified)) + " de "
				+ new SimpleDateFormat("yyyy, HH:mm:ss").format(new Date(this.lastModified));
	}
}
