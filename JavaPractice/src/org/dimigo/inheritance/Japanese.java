/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_Japanese
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class Japanese extends Person {
	public Japanese(String name){
		super(name);
	}
	
	public void sayHello(){
		System.out.println("こんにちは");
	}
	
	public void sayBye(){
		System.out.println("さようなら");
	}
	
	public String toString(){
		return "私は日本人である" + super.getName() + "です。";
	}
}
