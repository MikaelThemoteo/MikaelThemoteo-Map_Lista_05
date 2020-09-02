package br.com.helloWorld.q1.app;

import br.com.helloWorld.q1.factories.HelloWorldFactory;
import br.com.helloWorld.q1.msgs.HelloWorld;

public class Application {

	private HelloWorld msg;
	
	public Application (HelloWorldFactory factory) {
		msg = factory.imprimeMensagem();
	}
	
	public void imprimeMensagem() {
		((HelloWorldFactory) msg).imprimeMensagem();
		
	}
}
