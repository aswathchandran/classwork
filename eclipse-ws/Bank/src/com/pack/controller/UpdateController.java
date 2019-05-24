package com.pack.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.model.Customer;
import com.pack.service.CustomerServiceImpl;

/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int i=0;
		response.setContentType("text/html");
		int customer_id=Integer.parseInt(request.getParameter("customer_id"));
		String address=request.getParameter("address");
		Float salery=Float.parseFloat(request.getParameter("salery"));
		String city= request.getParameter("city");
		
		
		
		Customer customer=new Customer(customer_id,address,salery,city);
		
		try 
		{
			i=new CustomerServiceImpl().updateCustomer(customer);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		if(i==1) 
		{
			System.out.println("updated sucessfully");
			List<Customer> customerList=new CustomerServiceImpl().fetchCustomers();
			request.setAttribute("custList",customerList );
			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);				
		}
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
