/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Condition
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class Loop {
	
	public static void sleep(int time){
	    try {
	      Thread.sleep(time);
	    } catch (InterruptedException e) { }
	}
	
	public static String Job(){
		String UserJob = new String();
		int a = new Random().nextInt(3) + 1;
		switch(a){
		case 1:
			UserJob = "마법사";
			break;
		case 2:
			UserJob = "영주";
			break;
		case 3:
			UserJob = "기사";
			break;
		case 4:
			UserJob = "농민";
			break;
		}
		return UserJob;
	}
	
	public static int menu(){
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("  <<게임 메뉴>>");
		System.out.println("1. 공격력 증가");
		System.out.println("2. 공격력 감소");
		System.out.println("3. 캐릭터 설정");
		System.out.println("9. 종료");
		System.out.println("---------------------------");
		System.out.println("메뉴 입력 => ");
		int input = scan.nextInt();
		return input;
	}
	
	public static void main(String[] args) {
		int input, Str = 100;
		boolean a = true;
		while(a){
			input = menu();
			switch(input){
			case 1:
				Str += 10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + Str);
				break;
			case 2:
				Str -= 10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + Str);
				break;
			case 3:
				System.out.println(Job() + "(으)로 설정되었습니다.");
				break;
			case 9:
				a = false;
				break;
			default:
				System.out.println("없는 메뉴입니다.");
				break;
			}
			sleep(500);
		}
		System.out.println("이제 공부하세요!");
	}
}
