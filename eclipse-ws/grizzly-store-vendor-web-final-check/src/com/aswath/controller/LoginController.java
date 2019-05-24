package com.aswath.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aswath.model.InventoryModel;
import com.aswath.model.ProductModel;
import com.aswath.model.VendorModel;
import com.aswath.service.ProductServiceImpl;
import com.aswath.service.VendorServiceImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		VendorModel vendor=null;
		VendorModel vendorModel=null;
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		vendor=new VendorModel(username,password);
		int i=new VendorServiceImpl().LoginService(vendor);
		List<InventoryModel> inventoryList=null;
		
		List<ProductModel> productList=null;
		
		
		
		
		
		
		if(i==1) 
		{
			HttpSession session=request.getSession();
			session.setAttribute("username",username);
			try 
			{
				vendorModel=new VendorServiceImpl().fetchVendor(username);		
				productList=new ProductServiceImpl().fetchAllProduct();
				inventoryList=new VendorServiceImpl().inventorylist();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			request.setAttribute("user", vendorModel);
			request.setAttribute("productlist", productList);
			request.setAttribute("inventoryList", inventoryList);
			RequestDispatcher rd=request.getRequestDispatcher("/HomePage.jsp");
			
			rd.forward(request, response);
		}
		else 
		{
			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);	
		}
		
		
		
		pw.close();
		//doGet(request, response);
	}

}
