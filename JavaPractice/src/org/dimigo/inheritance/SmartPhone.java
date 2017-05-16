/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhone
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class SmartPhone {
	private String model, company;
	private int price;
	
	public SmartPhone(){
		
	}
	
	public SmartPhone(String model, String company, int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn(){
		System.out.println(this.model + "의 전원을 켭니다.");
	}
	
	public void turnOff(){
		System.out.println(this.model + "의 전원을 끕니다.");
	}
	
	public void pay(){
		System.out.println("결제합니다.");
	}
	
	public void useSpecialFunction(SmartPhone phone){
		if(phone instanceof Galaxy){
			((Galaxy)phone).useWirelessCharging();
		}
		else if(phone instanceof IPhone){
			((IPhone)phone).useAirDrop();
		}
	}
	
	public String toString(){
		return "모델명 : " + this.model + ", 제조사 : " + this.company + ", 가격 : " + String.format("%,d", this.price) + "원";
	}
}
