/**
 * 
 */
package org.dimgo.basic;

/**
 * <pre>
 * org.dimgo.basic
 *   |_PrimitveDataType
 * 
 * 1. 개요 : IU 프로필 출력
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class PrimitveDataType {
	public static void main(String[] args) {
		String name = "이지은";
		boolean isMale = false;
		int age = 25;
		double height = 161.8;
		float weight = (float)44.3;
		char bloodType = 'A';
		
		System.out.println("    <<아이유 프로필>>");
		System.out.println(" 이름     : " + name);
		if(isMale) System.out.println(" 성별     : 남자");
		else System.out.println(" 성별     : 여자");
		System.out.println(" 나이     : " + age);
		System.out.println(" 신장     : " + height + "cm");
		System.out.println(" 체중     : " + weight + "kg");
		System.out.println(" 혈액형 : " + bloodType + "형");
	}
}
