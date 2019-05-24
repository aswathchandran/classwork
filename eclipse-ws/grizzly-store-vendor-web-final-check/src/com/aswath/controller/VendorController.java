package com.aswath.controller;

import java.io.IOException;
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
import com.aswath.model.VendorListModel;
import com.aswath.model.VendorModel;
import com.aswath.service.ProductServiceImpl;
import com.aswath.service.VendorServiceImpl;

/**
 * Servlet implementation class VendorController
 */
@WebServlet("/VendorController")
public class VendorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VendorController() {
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
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		int productid=Integer.parseInt(request.getParameter("productid"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		
		VendorModel vendorModel=null;
		List<ProductModel> productList=null;
		List<InventoryModel> inventoryList=null;
		String username;
		VendorListModel vendorListModel=new VendorListModel(productid,quantity);
		
		int i=new VendorServiceImpl().addVendorList(vendorListModel);
		
		if(i==1) 
		{
			HttpSession session=request.getSession();
			username=(String) session.getAttribute("username");
		
			try 
			{
				inventoryList=new VendorServiceImpl().inventorylist();
				vendorModel=new VendorServiceImpl().fetchVendor(username);		
				productList=new ProductServiceImpl().fetchAllProduct();
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
		
		
		
		
	}

}
