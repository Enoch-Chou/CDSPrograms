package Chapters.Semester2Review;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class WordCounterTest 
{
	public static void main(String[] args) throws FileNotFoundException
	{
			
		FileReader reader = new FileReader("src/Chapters/Semester2Review/poem.txt");
		file = new Scanner(reader);
		
		WordCounter w = new WordCounter();
			
		while(file.hasNext())
		{
			String word = (file.next());
			w.addWord(word);
			System.out.println(word);
			
		}	
		System.out.println();
		
		System.out.print(w);
	}
	private static Scanner file;
}

