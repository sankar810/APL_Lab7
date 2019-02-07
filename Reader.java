package filewordreader;

import java.util.Scanner;
import java.io.File;


public class Reader implements Runnable{
	
	private String filename;

	public Reader(String filename) {
		this.filename=filename;
		run();
	}

	@Override
	public void run() {
		try {
		int count = 0;
		Scanner in = new Scanner(new File(filename));

        while (in.hasNext())
        {
           in.next();
           count++;
        }
        System.out.println(filename + ": " + count);
		}
		catch(Exception e) {
			System.out.println("Could not"+filename);
		}
	}
}
