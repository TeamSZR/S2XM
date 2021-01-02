package com.yc.Web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.Biz.DzBiz;
import com.yc.Biz.DzBiz2;
import com.yc.Dao.ZanDao;
import com.yc.common.biz.BizException;
import com.yc.common.web.BaseServlet;

@WebServlet("/zan.s")
public class ZanServlet extends BaseServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private DzBiz2 db2=new DzBiz2();
	private ZanDao zd=new ZanDao();
	public void addzan(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String singername=request.getParameter("name");
		String uname="sq";
			try {
				db2.updatedz(uname, singername);
				write(response,"成功");
			} catch (BizException e) {
				write(response,"点赞失败 原因:"+e.getMessage());
			}

	}
	
	public void getzan(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String singername=request.getParameter("singername");
		try {
			write(response, zd.getzans(singername));
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	public void checkuser(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String singername=request.getParameter("singername");
		String uname="sq";
		try {
			write(response, zd.getcnt(singername, uname));
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}

	}
	
}