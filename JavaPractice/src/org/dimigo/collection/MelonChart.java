/**
 * 
 */
package org.dimigo.collection;

import java.util.*;

/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class MelonChart {
	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		
		list.add(new Music("I LUV IT", "PSY"));
		list.add(new Music("맞지?", "언니쓰"));
		
		System.out.println("-- << 멜론 차트 >> --");
		printList(list);
		
		System.out.println("-- << 2위 곡 추가 >> --");
		list.add(1, new Music("SIGNAL", "Twice"));
		printList(list);
		
		System.out.println("-- << 3위 곡 변경 >> --");
		list.set(2, new Music("Pallete", "IU"));
		printList(list);
		
		System.out.println("-- << 2위 곡 삭제 >> --");
		list.remove(1);
		printList(list);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		list.removeAll(list);
		printList(list);
	}
	
	public static void printList(List<Music> list){
		int num = 1;
		for(Music music : list){
			System.out.println(num + ". " + music);
			num++;
		}
		System.out.println();
	}
}
