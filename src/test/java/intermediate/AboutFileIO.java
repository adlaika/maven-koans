package intermediate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static util.KoanConstants.__;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AboutFileIO {

	@Test
	public void fileObjectDoesntCreateFile() {
		File f = new File("foo.txt");
		assertEquals(f.exists(), __);
	}

	@Test
	public void fileCreationAndDeletion() throws IOException {
		File f = new File("foo.txt");
		f.createNewFile();
		assertEquals(f.exists(), __);
		f.delete();
		assertEquals(f.exists(), __);
	}

	@Test
	public void basicFileWritingAndReading() throws IOException {
		File file = new File("file.txt");
		FileWriter fw = new FileWriter(file);
		fw.write("First line\nSecond line");
		fw.flush();
		fw.close();

		char[] in = new char[50];
		int size = 0;
		FileReader fr = new FileReader(file);
		size = fr.read(in);
		// No flush necessary!
		fr.close();
		assertEquals(size, __);
		assertEquals(new String(in), __);
		file.delete();
	}

	@Test
	public void betterFileWritingAndReading() throws IOException {
		File file = new File("file.txt");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("First line");
		pw.println("Second line");
		pw.close();

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		assertEquals(br.readLine(), __); // first line
		assertEquals(br.readLine(), __); // second line
		assertEquals(br.readLine(), __); // what now?
	}

	@Test
	public void directChainingForReadingAndWriting() throws IOException {
		File file = new File("file.txt");
		PrintWriter pw = new PrintWriter(file);
		pw.println("1. line");
		pw.println("2. line");
		pw.close();

		StringBuffer sb = new StringBuffer();
		// Add the loop to go through the file line by line and add the line
		// to the StringBuffer
		assertEquals(sb.toString(), "1. line\n2. line");
	}
}
