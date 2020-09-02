package br.com.helloWorld.q1.factories;

import br.com.helloWorld.q1.msgs.HelloWorld;

public class HelloWorldArquivoFactory implements  HelloWorldFactory{
	
	@Override
	public HelloWorld imprimeMensagem() {
		return (HelloWorld) new HelloWorldArquivoFactory();
	}

}
