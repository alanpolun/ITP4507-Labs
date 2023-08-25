import java.io.*;

public class TestWriteText {
	public static void main(String[] args){
		try {
			FileWriter outputFile = new FileWriter(args[0]);
			PrintWriter out = new PrintWriter(outputFile);
			
			// Write text to file
			out.println("line 1");
			out.println("line 2");
			// write the text from buffer to the file
			out.flush();
			// close the file after use
			out.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
