package com.factorypattern;

public class ComputerFactory {
	public Computer getComputer(Computer.Budget budget,byte ramSize, String processorName, String processorVendor, short hardDiskName, String keyboardVendor,String mouseVendor) {
		HardDisk hardDisk = new HardDisk(hardDiskName);
		Keyboard keyboard = new Keyboard(keyboardVendor);
		Mouse mouse = new Mouse(mouseVendor);
		Computer computer = new Computer();
		Ram ram = RamFactory.getInstance().get(budget);
		Processor processor = ProcessorFactory.getInstance().get(budget);
		
		computer.setHardDisk(hardDisk);
		computer.setKeyboard(keyboard);
		computer.setMouse(mouse);
		computer.setProcessor(processor);
		computer.setRam(ram);
		computer.setPrice(40000);
		
		return computer;
	}
}
