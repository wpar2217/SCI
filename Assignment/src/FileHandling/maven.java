package FileHandling;

import java.io.File;
import java.io.IOException;

public class maven {
	public static void main(String[] args) throws IOException {
		File f1 = new File("D:\\Parthu\\resume.txt");
		if(f1.exists())
			f1.delete();
		System.out.println(f1.createNewFile());
	}

}
