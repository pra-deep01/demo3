package pack1;

import java.io.FileInputStream;

public class Parsing {
	public static void main(String[] args) {
		FileInputStream fin = null;
		String path = "E:\\QCCA7\\Files\\Fruit.csv";
		fin = new FileInputStream(path);
		String fruit = "";
		int r = fin.read();
		while (r! = -1)
		{
			fruit = fruit + (char)r;
			r = fin.read();
		}
		String[] f= fruit.split(",");
		for(String[] i : s)
		{
			System.out.println(s);
		}
	}

}
