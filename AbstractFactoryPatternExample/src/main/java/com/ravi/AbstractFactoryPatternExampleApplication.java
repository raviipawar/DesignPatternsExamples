package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ravi.factory.Factory1;
import com.ravi.factory.Factory2;
import com.ravi.model.Client;

@SpringBootApplication
public class AbstractFactoryPatternExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbstractFactoryPatternExampleApplication.class, args);
		Client client =  new Client(new Factory1());
		Client client1 =  new Client(new Factory2());
		client.operation();
		client1.operation();
	}

}
