package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class file_to_string
{
	public static void main(String[] args) throws IOException {
		String ans = "";
		String filename =  "D:\\Hust document\\Term 4\\OOP lab\\Lab 2\\AimsProject\\OtherProject\\src\\hust\\soict\\globalict\\garbage\\test.txt";
		byte[] inputBytes = {0};
		long startTime, endTime;
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		//String outputString = "";
		StringBuilder outputStringBuilder = new StringBuilder();
		for(byte b:inputBytes)
		{
			outputStringBuilder.append((char)b);
			//outputString+=(char)b;
		}
		endTime  =System.currentTimeMillis();
		System.out.println(endTime-startTime);
}
}

