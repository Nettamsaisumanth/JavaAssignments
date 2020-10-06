/*Handling a checked exception by opening a file
Write a  code opens a text file and writes its content to the standard output. What happens if the file doesn’t exist?
*/

package com.problem1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filehandling {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/saisumanth NETTEM/Desktop/HCL THINGS/sample file.txt");
		File file1 = new File("C:/Users/saisumanth NETTEM/Desktop/HCL THINGS/sample file1.txt");
		FileInputStream fileinputstream = new FileInputStream(file);
		FileOutputStream fileoutputstream = new FileOutputStream(file1);
		try {

			byte[] buffer = new byte[1024];
			int length;
			while ((length = fileinputstream.read(buffer)) > 0) {
				fileoutputstream.write(buffer, 0, length);
				System.out.println((char) length);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File is not found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			fileinputstream.close();
			fileoutputstream.close();
		}

	}
}
