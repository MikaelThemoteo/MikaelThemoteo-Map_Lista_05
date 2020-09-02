package br.com.helloWorld.q1;

import com.sun.jmx.snmp.Timestamp;

import br.com.helloWorld.q1.factories.HelloWorldFactory;
import br.com.helloWorld.q1.factories.HelloWorldTelaFactory;
import br.com.helloWorld.q1.msgs.HelloWorldArquivo;

public class Main {
		
	static HelloWorldFactory factory;
	
	public static void main(String[] args) {
		Timestamp time = new Timestamp();
		
		if(time.getSysUpTime()> 10) {
			factory = (HelloWorldFactory) new HelloWorldArquivo();
			factory.imprimeMensagem();
		}else {
			factory = (HelloWorldFactory) new HelloWorldTelaFactory();
			factory.imprimeMensagem();
		}
		
	}

}
