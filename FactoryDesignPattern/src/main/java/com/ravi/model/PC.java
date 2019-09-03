package com.ravi.model;

public class PC implements Computer{

	private String RAM;
	private String HDD;
	private String CPU;
	
	public PC(String rAM, String hDD, String cPU) {
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
		return "PC [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + "]";
	}

	
	
	
}
