import java.io.*;

public class LaunchIO {

	public static void main(String[] args) throws Exception {
		String path1 = "C://io//input.txt";
		String path2 = "C://io//output.txt";
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		String a;
		while((a = br.readLine())!=null) {
			bw.write(a);
			System.out.println(a);
		}
		bw.flush();
		br.close();
	}

}
