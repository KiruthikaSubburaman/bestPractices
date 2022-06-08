package com.chainsys.bestPractices.decoupled;

//Objects of this class can work with any engine, and with any wheel
//The car class is decoupled from PetrolEngine class, and SteelWheel class
public class Bike {
  private IEngine engine; //early bound with engine interface
  public IEngine getEngine() {
	return engine;
}
//The type of engine, will be injected to the bike class 
 // At runtime using the setter method. This is called as setter based 
 // dependency injection
public void setEngine(IEngine engine) {
	this.engine = engine;
}
//The type of wheel, will be injected to the bike class 
// At runtime using the setter method. This is called as setter based 
// dependency injection
public void setWheels(IWheel[] wheels) {
	this.wheels = wheels;
}
private IWheel[] wheels; //early bound with wheel interface
  
	/*
	 * public Bike(IEngine engine,IWheel[] wheel) { this.engine=engine;
	 * this.wheels=wheel;
	 * 
	 * }
	 */
public void startBike() {
     engine.start();
     wheels[0].rotate();
     wheels[1].rotate();
   
}
public IWheel[] getWheels() {
     return this.wheels;
}
}