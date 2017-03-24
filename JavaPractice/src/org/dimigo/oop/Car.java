/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Car
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public void setCompany(String a){
		company = a;
	}
	public void setModel(String a){
		model = a;
	}
	public void setColor(String a){
		color = a;
	}
	public void setMaxSpeed(int a){
		maxSpeed = a;
	}
	public void setPrice(int a){
		price = a;
	}
	
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
	public int getPrice(){
		return price;
	}
	
}
