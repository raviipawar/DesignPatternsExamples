package com.ravi.factory;

import com.ravi.model.Computer;
import com.ravi.model.PC;
import com.ravi.model.Server;
import com.ravi.model.SuperComputer;

public class ComputerFactory {

	public static Computer createComputer(ComputerType type, String RAM, String HDD, String CPU) {
		
		Computer comp = null;
		switch(type) {
		case PC :
			comp= new PC(RAM,HDD,CPU);
			break;
		case Server :
			comp = new Server(RAM, HDD, CPU);
			break;
		case SuperComputer :
			comp = new SuperComputer();
			break;
		}
		
		return comp;
	}
}
