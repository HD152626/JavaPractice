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
public class CarTest {
	public static void main(String[] args) {
		Car HD = new Car();
		Car KIA = new Car();
		Car SS = new Car();
		
		HD.setCompany("현대자동차");
		HD.setModel("제네시스");
		HD.setColor("검정색");
		HD.setMaxSpeed(225);
		HD.setPrice(50000000);

		KIA.setCompany("기아자동차");
		KIA.setModel("K7");
		KIA.setColor("흰색");
		KIA.setMaxSpeed(246);
		KIA.setPrice(40000000);

		SS.setCompany("삼성자동차");
		SS.setModel("SM7");
		SS.setColor("회색");
		SS.setMaxSpeed(200);
		SS.setPrice(38000000);
		
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
