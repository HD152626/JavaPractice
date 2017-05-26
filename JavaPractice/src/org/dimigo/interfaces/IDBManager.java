/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_IDBManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 26.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public interface IDBManager {
	String ORACLE_DATABASE = "ORACLE";
	String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	static IDBManager getDBObject(String database){
		IDBManager Oracle = new OracleDB();
		IDBManager Sybase = new SybaseDB();
		IDBManager NULL = null;
		if(database.equals(ORACLE_DATABASE)){
			return Oracle;
		}
		else if(database.equals(SYBASE_DATABASE)){
			return Sybase;
		}
		else{
			return NULL;
		}
	}
}
