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
 * Servlet implementation class ViewProductController
 */
@WebServlet("/ViewProductController")
public class ViewProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewProductController() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("haha");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String productname=request.getParameter("pname");
		System.out.println(productname);
		ProductModel productModel=null;
		List<ProductModel> productList=null;
		UserModel userModel=null;
		
		HttpSession session=request.getSession();
		String username;
		username=(String)session.getAttribute("username");
		try 
		{
			productModel= new ProductServiceImpl().getProduct(productname);
			userModel=new LoginServiceImpl().FetchUser(username);
			productList=new ProductServiceImpl().fetchAllProduct();			
			request.setAttribute("product", productModel);
			request.setAttribute("user", userModel);
			request.setAttribute("productlist", productList);			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		RequestDispatcher rd=request.getRequestDispatcher("/ViewProduct.jsp");
		rd.forward(request, response);
		
		
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
