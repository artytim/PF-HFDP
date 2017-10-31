package designpatterns.decorator.io;

import java.io.*;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;

		String current = System.getProperty("user.dir");
		System.out.println("Current working directory in Java : " + current);

		try {
			InputStream in = 
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("./test.txt")));

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
