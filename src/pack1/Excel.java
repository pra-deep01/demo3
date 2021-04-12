//create an excel for the given format
//eid name gender  sal
//1    A    M      100
//2    B    F      250
//3    C    M      300
//save the file in csv format
// task 1  : Write a java program to read the csv file and to perform the following task
//1. count the no of employees
// 2.find  the max sal
// 3.find the min sal
// 4. total and avg sal


package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excel {
	public static void main(String[] args) throws FileNotFoundException,IOException {
		FileInputStream fin = null;
		String path = "E:\\QCCA7\\Files\\Emp.csv";
		fin = new FileInputStream(path);
		String str = "";
		int r=0;
		while(r != -1)
		{
        r = fin.read();
       // str = str + r ;
       // System.out.println(str);
       System.out.print((char)r);
		}
       int count = 0;
       while(r!=-1)
       {
    	   if(r==-1)
    	   {
    	   count++;
    	   }
       }
        System.out.println("No of employees:"+(count-1));
	}
}
