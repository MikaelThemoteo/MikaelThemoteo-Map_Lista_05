package br.com.helloWorld.q1.factories;

import br.com.helloWorld.q1.msgs.HelloWorld;

public class HelloWorldTelaFactory implements HelloWorldFactory{
	
	@Override 
	public HelloWorld imprimeMensagem() {
		return (HelloWorld) new HelloWorldTelaFactory();
	}

}
