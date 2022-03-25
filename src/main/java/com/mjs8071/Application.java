package com.mjs8071;

import java.io.File;

public class Application {

	public static void main(String[] args) {

		//machine constructor
		File filePath = new File("vendingmachine.csv");
		Machine vendingMachine = new Machine();
		vendingMachine.run(filePath);

	}
}
