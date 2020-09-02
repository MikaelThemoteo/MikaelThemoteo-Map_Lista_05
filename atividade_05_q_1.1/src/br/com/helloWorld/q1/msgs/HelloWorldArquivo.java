package br.com.helloWorld.q1.msgs;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldArquivo implements HelloWorld{
	
	@Override
	public void printMsg()
	{
		try {
			FileWriter arquivo = new FileWriter("C:\\output.txt");
			PrintWriter escrevrArq = new PrintWriter(arquivo);
			
			escrevrArq.printf("Hello World!\n Mikael =D");
			
			arquivo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
