/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_PersonTest2
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 11.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class PersonTest2 {
	public static void main(String[] args) {
		Person[] persons = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("田中"),
				new Chinese("王明")
		};
		
		for(Person p : persons){
			greeting(p);
		}
	}
	
	private static void greeting(Person p){
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		System.out.println();
	}
}
