/**
 * 
 */
package com.cogent.spring.core;

/**
 * @author dick
 *
 *         17 окт. 2022 г.
 */
public class Car {

	private Engine engine;

	public void drive() {

		engine.startEngine();
		System.out.println("EN ROUTE");
		engine.stopEngine();
	}

}
