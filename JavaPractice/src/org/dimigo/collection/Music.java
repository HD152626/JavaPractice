/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *   |_Music
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class Music {
	private String title, singer;
	
	public Music(String title, String singer){
		this.title = title;
		this.singer = singer;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getSinger(){
		return this.singer;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setSinger(String singer){
		this.singer = singer;
	}
	
	public String toString(){
		return this.title + " (" + this.singer + ")";
	}
}
