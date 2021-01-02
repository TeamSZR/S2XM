package com.yc.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.yc.common.util.DBHelper;

public class SearchDao {

	/**
	 * 
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> listname(String name) throws SQLException{
		String sql="select * from sq_song where 1=1 ";
		List<Object> params=new ArrayList<>();
		if(name!=null&&name.trim().isEmpty()==false){
			sql+="and singer like ?";
			params.add("%"+name+"%");
		}
		Object []pArray=params.toArray();
		DBHelper dbh=new DBHelper();
		return dbh.selectListMap(sql, pArray);
		
		
	}
	
	public List<Map<String, Object>> listsong(String name) throws SQLException{
		String sql="select * from sq_song where 1=1 ";
		List<Object> params=new ArrayList<>();
		if(name!=null&&name.trim().isEmpty()==false){
			sql+="and name like ?";
			params.add("%"+name+"%");
		}
		Object []pArray=params.toArray();
		DBHelper dbh=new DBHelper();
		return dbh.selectListMap(sql, pArray);
	}
	
	public List<Map<String, Object>> listnamepy(String name) throws SQLException{
		String sql="select * from sq_song where 1=1 ";
		List<Object> params=new ArrayList<>();
		if(name!=null&&name.trim().isEmpty()==false){
			sql+="and name_py like ?";
			params.add("%"+name+"%");
		}
		Object []pArray=params.toArray();
		DBHelper dbh=new DBHelper();
		return dbh.selectListMap(sql, pArray);
		
		
	}
	
	public List<Map<String, Object>> listsongpy(String name) throws SQLException{
		String sql="select * from sq_song where 1=1 ";
		List<Object> params=new ArrayList<>();
		if(name!=null&&name.trim().isEmpty()==false){
			sql+="and song_py like ?";
			params.add("%"+name+"%");
		}
		Object []pArray=params.toArray();
		DBHelper dbh=new DBHelper();
		return dbh.selectListMap(sql, pArray);
	}
	
}
