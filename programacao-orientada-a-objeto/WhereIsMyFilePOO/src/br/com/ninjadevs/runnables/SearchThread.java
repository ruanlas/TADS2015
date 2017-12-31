package br.com.ninjadevs.runnables;

import java.time.LocalDate;

import br.com.ninjadevs.controllers.FileExplorerBrowserController;
import br.com.ninjadevs.controllers.FileLocator;

public class SearchThread implements Runnable {
	
	boolean date;
	LocalDate dateValue;
	boolean dateEnd;
	LocalDate dateValueEnd;
	boolean type;
	String typeValue;
	boolean name;
	String nameValue;
	boolean CaseSensitive;
	FileExplorerBrowserController browserController;

	public SearchThread(boolean date, LocalDate dateValue, boolean dateEnd, LocalDate dateValueEnd, boolean type,
			String typeValue, boolean name, String nameValue, boolean caseSensitive,
			FileExplorerBrowserController browserController) {
		super();
		this.date = date;
		this.dateValue = dateValue;
		this.dateEnd = dateEnd;
		this.dateValueEnd = dateValueEnd;
		this.type = type;
		this.typeValue = typeValue;
		this.name = name;
		this.nameValue = nameValue;
		CaseSensitive = caseSensitive;
		this.browserController = browserController;
	}



	@Override
	public void run() {

		if(name && CaseSensitive){
			
			FileLocator.searchFile(browserController.getFile(), nameValue, browserController.results);
			
		} else if(name && !CaseSensitive){
			
			FileLocator.searchFileIgnoreCaseSensitive(browserController.getFile(), nameValue, browserController.results);
		}
		
		if(type){
			
			FileLocator.searchFileByExtension(browserController.getFile(), typeValue, browserController.results);
		}
		
		if(date && !dateEnd){
			
			FileLocator.searchFileByDate(browserController.getFile(), dateValue, browserController.results);
		} else if (date && dateEnd){
			
			FileLocator.searchFileByInterval(browserController.getFile(), dateValue, dateValueEnd, browserController.results);
		}
		
	}

}
