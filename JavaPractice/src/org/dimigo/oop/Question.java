/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class Question {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] correct = {
				"아이유",
				"장나라",
				"과학"
		};
		StringBuilder[] question = {
				new StringBuilder("1. 가장 좋아하는 가수는?"),
				new StringBuilder("2. 가장 좋아하는 배우는?"),
				new StringBuilder("3. 가장 좋아하는 과목은?")
		};
		
		String[] answer = {
				null, null, null
		};
		for(int i = 0; i < 3; i++){
			System.out.println(question[i]);
			answer[i] = scan.nextLine();
			if(answer[i] != null && answer[i].equals(correct[i])){
				System.out.println("정답입니다!");
			}
			else{
				System.out.println("틀렸습니다!");
			}
		}
		System.out.println(" << 결과 출력 >>");
		for(int i = 0; i < 3; i++){
			question[i].append(" " + correct[i] + "입니다.");
			System.out.println(question[i]);
		}
		
		scan.close();
	}
}
