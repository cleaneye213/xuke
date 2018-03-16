package com.xuke.unit.test;

public class LadyBoy extends Man{
	
	Lady getLady() {
		return new Lady();
	}

	class Lady extends Women{
		
	}
	
	public static void main(String[] args) {
		LadyBoy lb=new LadyBoy();
		Man m=new Man();
		lb.getLady().marryTo(m);
	}
}
