package com.factorymethod.patttern;

abstract class Vehicle {
	
	public abstract int getWheel();

	public String toString() {
		return "Wheel: " + this.getWheel();
	}
}