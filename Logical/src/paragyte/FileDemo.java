package paragyte;

import java.io.File;
import java.io.IOException;

public class FileDemo {
		
	public static void main(String[] args) throws IOException {
		File f = new File("abcd" , "abc.txt"); 
		System.out.println("Exist : "+f.exists());
		System.out.println("f.isDirectory() : '"+f.isDirectory());
		f.createNewFile();
		f = File.createTempFile("new", "old");
		System.out.println("getAbsolutePath : "+f.getAbsolutePath());
		System.out.println("lastModified : "+f.lastModified());
		System.out.println("getName : "+f.getName());
		System.out.println("length : "+f.length());
		System.out.println("getParent : "+f.getParent());
		
		System.out.println(f);
	}
}
