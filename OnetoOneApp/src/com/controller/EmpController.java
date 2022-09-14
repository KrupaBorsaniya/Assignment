package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Emp;
import com.bean.EmpInfo;
import com.dao.EmpDao;


@WebServlet("/EmpController")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert"))
		{
			EmpInfo e=new EmpInfo();
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setEmail(request.getParameter("email"));
			
			EmpDao.insertEmpInfo(e);
			
			Emp e1=new Emp();
			e1.setJob(request.getParameter("job"));
			e1.setSalary(Double.parseDouble(request.getParameter("salary")));
			e1.setEinfo(e);
			
			EmpDao.insertEmp(e1);
			response.sendRedirect("emp.jsp");
		}
	}

}
