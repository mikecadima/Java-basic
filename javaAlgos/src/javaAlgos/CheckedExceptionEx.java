package javaAlgos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionEx {
	public static void openFile() throws FileNotFoundException {
		new FileInputStream("C:\\DoesNotExist.txt");
	}
	public static void main(String[] args) {
		try {
			openFile();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
