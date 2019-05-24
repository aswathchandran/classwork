package com.pack.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.model.Customer;
import com.pack.service.CustomerServiceImpl;


/**
 * Servlet implementation class EditCustomerController
 */
public class EditCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		Customer c=null;
		int customer_id=Integer.parseInt(request.getParameter("custid"));
		try {
		c=new CustomerServiceImpl().fetchCustomer(customer_id);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		if(c!=null) 
		{
			request.setAttribute("cust", c);
			RequestDispatcher rd=request.getRequestDispatcher("/editCustomer.jsp");
			rd.forward(request, response);
		}
		pw.close();
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
