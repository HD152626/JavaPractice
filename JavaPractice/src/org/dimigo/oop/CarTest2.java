/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_CarTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class CarTest2 {
	public static void main(String[] args) {
		Car2 HD = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car2 KIA = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		Car2 SS = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		
		System.out.println(" <<자동차 목록>>");
		System.out.println("제조사명 : "+HD.getCompany());
		System.out.println("모델명 : "+HD.getModel());
		System.out.println("색상 : "+HD.getColor());
		System.out.println("최대속도 : "+HD.getMaxSpeed() + "km");
		System.out.println("가격 : "+String.format("%,d", HD.getPrice()) + "원");

		System.out.println();
		System.out.println("제조사명 : "+KIA.getCompany());
		System.out.println("모델명 : "+KIA.getModel());
		System.out.println("색상 : "+KIA.getColor());
		System.out.println("최대속도 : "+KIA.getMaxSpeed() + "km");
		System.out.println("가격 : "+String.format("%,d", KIA.getPrice()) + "원");

		System.out.println();
		System.out.println("제조사명 : "+SS.getCompany());
		System.out.println("모델명 : "+SS.getModel());
		System.out.println("색상 : "+SS.getColor());
		System.out.println("최대속도 : "+SS.getMaxSpeed() + "km");
		System.out.println("가격 : "+String.format("%,d", SS.getPrice()) + "원");
		
	}
}
