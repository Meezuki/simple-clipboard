package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Content {
	private String title;
	private String fileName;
	
//	public void addToFile() {
//		try {
//		      //File newFile = new File(title + ".txt");
//				File newFile = new File("clipboardContent.txt");
//		      if (newFile.createNewFile()) {
//		        System.out.println("File created: " + newFile.getName());
//		      } else {
//		        System.out.println("File already exists.");
//		      }
//		      
//		      FileWriter myWriter = new FileWriter(newFile);
//		      myWriter.write(fileName);
//		      myWriter.close();
//		    } catch (IOException e) {
//		      System.out.println("An error occurred.");
//		      e.printStackTrace();
//		    }
//	}
	
	public Content(String title, String fileName) {
		this.setTitle(title);
		this.setfileName(fileName);
	}

	public String getfileName() {
		return fileName;
	}

	public void setfileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

}
