/**
 * 
 */
package org.dimigo.io;


import java.io.*;


/**
 * <pre>
 * org.dimigo.io
 *   |_ArakoMenu
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class ArakoMenu {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				Writer writer = new BufferedWriter(new FileWriter(
						"C:/Users/Weed/workspace/git/JavaPractice/JavaPractice/src/org/dimigo/io/menu.txt"));
				BufferedReader reader = new BufferedReader(new FileReader(
						"C:/Users/Weed/workspace/git/JavaPractice/JavaPractice/src/org/dimigo/io/menu.txt"))) {
			String inputData;
			while((inputData = br.readLine()) != null){
				writer.write(inputData);
				writer.write("\n");
			}
			writer.close();
			
			System.out.println(" << 메뉴 출력 >>");
			String outputData;
			while((outputData = reader.readLine()) != null){
				System.out.println(outputData);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}