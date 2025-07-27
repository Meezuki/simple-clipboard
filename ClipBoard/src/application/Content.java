package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Content {
	private String title;
	private String text;
	
	public void addToFile(String text, String title) {
		try {
		      File newFile = new File(title + ".txt");
		      if (newFile.createNewFile()) {
		        System.out.println("File created: " + newFile.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		      
		      FileWriter myWriter = new FileWriter("filename.txt");
		      myWriter.write(text);
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	public Content(String title, String text) {
		this.setTitle(title);
		this.setText(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

}
