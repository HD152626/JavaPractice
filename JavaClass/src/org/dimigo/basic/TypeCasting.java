/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_TypeCasting
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class TypeCasting {
	public static void main(String[] args) {
		 int monthPay = 1700000, clerk = 3, shop = 1500;
		 long yearPay;
		 System.out.println("  << 디미베네 연간 인건비 >>");
		 System.out.println(" 월 평균 급여 : " + String.format("%,d", monthPay) + "원");
		 System.out.println(" 점포 내 직원 수 : " + clerk + "명");
		 System.out.println(" 점포 수 : " + String.format("%,d", shop) + "개\n");
		 yearPay = monthPay * 12 * clerk * shop;
		 System.out.println(" 연간 인건비 : " + String.format("%,d", yearPay) + "원");
	}
}
