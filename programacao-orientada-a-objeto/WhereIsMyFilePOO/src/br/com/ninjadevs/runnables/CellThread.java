package br.com.ninjadevs.runnables;

import java.io.IOException;

import br.com.ninjadevs.controllers.FileExplorerBrowserController;

public class CellThread implements Runnable {
	
	Thread search;
	FileExplorerBrowserController browserController;
	
	public CellThread(Thread search, FileExplorerBrowserController browserController) {

		this.search = search;
		this.browserController = browserController;
	}

	@Override
	public void run() {

		int i = -1;

		while (search.isAlive()) {

			while ((browserController.results.size() - 1) > i) {

				i++;
				
				try {
					System.out.println(browserController.results.get(i).getCanonicalPath());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				browserController.addCellFromResult(i);
			}
		}
	}
}
