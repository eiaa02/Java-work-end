import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		for (int i = 1153; i < 1158; i++) {
			File file = new File("C:\\Users\\Administrator\\Desktop\\Work\\src\\main\\Test" + i + ".java");
			file.createNewFile();

			BufferedWriter br = new BufferedWriter(new FileWriter(file));
			br.write("package main;\n" +
					"import java.util.Scanner;\n" +
					"\n" +
					"public class Test" + i + "{\n" +
					"\tstatic Scanner input = new Scanner(System.in);\n" +
					"\t\n" +
					"\tpublic static void main(String[] args) {\n" +
					"\t\t\n" +
					"\t}\n" +
					"}");
			br.close();
		}

	}
}
