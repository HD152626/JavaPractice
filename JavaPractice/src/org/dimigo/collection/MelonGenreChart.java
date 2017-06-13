/**
 * 
 */
package org.dimigo.collection;

import java.util.*;

/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonGenreChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class MelonGenreChart {
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		
		map.put("발라드", new ArrayList<Music>());
		map.put("댄스", new ArrayList<Music>());
		
		map.get("발라드").add(new Music("Palette", "IU"));
		map.get("댄스").add(new Music("I LUV IT", "PSY"));
		map.get("댄스").add(new Music("맞지?", "언니쓰"));
		System.out.println("-- << 멜론 장르별 차트 >> --");
		printMap(map);
		
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		map.get("댄스").set(1, new Music("SIGNAL", "TWICE"));
		printMap(map);
		
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		map.get("댄스").remove(0);
		printMap(map);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		map.clear();
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()){
			System.out.println("[" + key + "]");
			int num = 1;
			for(Music music : map.get(key)){
				System.out.println(num + ". " + music);
				num++;
			}
		}
		System.out.println();
	}
}
