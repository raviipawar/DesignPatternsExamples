package com.ravi;

import com.ravi.factory.ComputerFactory;
import com.ravi.factory.ComputerType;
import com.ravi.model.Computer;

public class ComputerClient {

	public static void main(String[] args) {

		Computer Pc = ComputerFactory.createComputer(ComputerType.PC, "4GB", "512GB", "Core 2 Duo");
		System.out.println(Pc.toString());
		
		Computer Server = ComputerFactory.createComputer(ComputerType.Server, "8GB", "2TB", "Octa Core");
		System.out.println(Server);
		
		Computer SuperComputer = ComputerFactory.createComputer(ComputerType.SuperComputer, "128GB", "32TB", "I11");
		System.out.println(SuperComputer);
	}

}
