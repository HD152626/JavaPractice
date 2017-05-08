/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_Chinese
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class Chinese extends Person {
	public Chinese(String name){
		super(name);
	}
	
	public void sayHello(){
		System.out.println("你好");
	}
	
	public void sayBye(){
		System.out.println("再见");
	}
	
	public String toString(){
		return "我是中国人" + super.getName();
	}
}
