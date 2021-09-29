package com.factorypattern;

public class Main {

	public static void main(String[] args) {
		
		HardDisk hardDisk2 = new HardDisk((short) 500);
		Keyboard keyboard2 = new Keyboard("Logitech");
		Mouse mouse2 = new Mouse("Dell");
		Processor processor2 = new Processor("i3", "Intel");
		Ram ram2 = new Ram((byte) 6);
		Computer computer2 = new Computer();
		
		computer2.setHardDisk(hardDisk2);
		computer2.setKeyboard(keyboard2);
		computer2.setMouse(mouse2);
		computer2.setProcessor(processor2);
		computer2.setRam(ram2);
		computer2.setPrice(25000);
		
		ComputerFactory computerFactory = new ComputerFactory();
		Computer computer3 = computerFactory.getComputer(Computer.Budget.MEDIUM,(byte) 8, "i5", "Intel", (short) 500, "Logitech", "Dell");
	}

}
