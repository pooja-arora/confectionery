package com.confectionary.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.confectionery.bean.Customer;
import com.confectionery.dao.customerDAO;

public class ControllerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		String customerName=request.getParameter("customerName");
		String item=request.getParameter("item");
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		int pricePerItem=Integer.parseInt(request.getParameter("pricePerItem"));
		int totalCost=Integer.parseInt(request.getParameter("totalCost"));
		
		HttpSession session = request.getSession(true);
		
		customerDAO dao=new customerDAO();
		dao.addData(customerName, item, quantity, pricePerItem, totalCost);
		try {
			response.sendRedirect("ConfSuccess");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
