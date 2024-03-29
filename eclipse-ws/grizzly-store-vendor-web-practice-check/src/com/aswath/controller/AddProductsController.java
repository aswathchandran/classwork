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

import com.aswath.model.ProductModel;
import com.aswath.model.UserModel;
import com.aswath.service.LoginServiceImpl;
import com.aswath.service.ProductServiceImpl;

/**
 * Servlet implementation class AddProductsController
 */
@WebServlet("/AddProductsController")
public class AddProductsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductsController() {
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
			
			List<ProductModel> productList=null;
			UserModel userModel=null;
			int i=0;
			
			String category=request.getParameter("category");
			String productname=request.getParameter("productname");
			String description=request.getParameter("description");
			float price=Float.parseFloat(request.getParameter("price"));
			String brand=request.getParameter("brand");
			float rating=(float) 5.00;
			String image=request.getParameter("image");
			
			ProductModel product=null;
			product=new ProductModel(productname,category,description,price,image,brand,rating);
			ProductServiceImpl productService=new ProductServiceImpl();
			i=productService.insertNewProduct(product);
			
			if(i==1) 
			{
				System.out.println("Product inserted sucessfully");
				HttpSession session=request.getSession();
				String username;
				username=(String)session.getAttribute("username");
					try 
					{
						userModel=new LoginServiceImpl().FetchUser(username);
						productList=new ProductServiceImpl().fetchAllProduct();					
					}
					catch (Exception e)
					{
						System.out.println(e);
					}
				request.setAttribute("user", userModel);
				request.setAttribute("productlist", productList);
				RequestDispatcher rd=request.getRequestDispatcher("/homePage.jsp");
				rd.forward(request, response);
			}
	}

}
