package br.com.ninjadevs.program;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

	public List<File> getFileList( File file ){
		
		List<File> files = new ArrayList<>();
		
		for(File f:file.listFiles()){
			
			if (f.isFile()){
			
				files.add(f);
			}
		}
		
		return files;
	}

	public List<File> getFolderList( File file ){
		
		List<File> folders = new ArrayList<>();
		
		for(File f:file.listFiles()){
			
			if (f.isDirectory()){
			
				folders.add(f);
			}
		}
		
		return folders;
	}
}