/*
 * Code to Create a Directory named with durga123 in current working Directory and  create a file named with abc.txt in that Directory . 
 * */
package paragyte;

import java.io.File;
import java.io.IOException;

public class FileInCurrentWorkingDir {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("H:\\Core Java With OCJP_SCJP_ File I_O","abc.txt");
		f.createNewFile();
		String[] s = f.list();
		for (String string : s) {
			System.out.println(string);
		}
		File f1 = new File(f, "jk.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
	}
}
