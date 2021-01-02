package com.yc.Biz;

import java.sql.SQLException;

import com.yc.Dao.ZanDao;
import com.yc.common.biz.BizException;
import com.yc.common.util.Utils;

public class DzBiz2 {

	private ZanDao zd=new ZanDao();
	public void updatedz(String uname,String singername) throws BizException {
		Utils.checkNull(uname, "用户名不能为空");
		Utils.checkNull(uname, "歌手不能空");
		try {
			if(zd.getcnt(singername, uname)==1) {
				zd.qxzan(uname,singername);
			}else {
				zd.zanadd(uname, singername);
			}
				
		} catch (SQLException e) {
			throw new BizException("系统繁忙 稍后再试");
		}	
	}
}
