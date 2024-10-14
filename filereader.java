import java.io.FileReader;
import java.io.Filewriter;
import java.io.IOException;
class GFG {
	public static void main(String args[])
	{
		try {
			FileReader fr = new FileReader("gfgInput.txt");
			FileWriter fw = new FileReader("gfgOutput.txt");
			String str = "";
			int i;
			while ((i=fr.read())!=-1) {
				str +=(char)i;
			}
			System.out.println(str);
			fw.writer(str);
			fr.close();
			fw.close();
			System.out.println("File reading and writing both done");
			fr.close();
			
		}
		catch (IOException e) {
			System.out.println(
				"There are some IOException");
		}
	}
}

