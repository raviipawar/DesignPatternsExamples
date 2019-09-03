package com.ravi.model;

public class Server implements Computer{


	private String RAM;
	private String HDD;
	private String CPU;
	
	public Server(String rAM, String hDD, String cPU) {
		super();
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.RAM;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.HDD;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.CPU;
	}

	@Override
	public String toString() {
		return "Server [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + "]";
	}
	
	
}
