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

import com.aswath.model.LoginModel;
import com.aswath.model.ProductModel;
import com.aswath.model.UserModel;
import com.aswath.service.LoginServiceImpl;
import com.aswath.service.ProductServiceImpl;

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
		UserModel userModel=null;
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		List<ProductModel> productList=null;
		
		
		LoginModel loginModel=new LoginModel(username,password);
		
		
		int i=new LoginServiceImpl().Login(loginModel);
		
		
		if(i==1) 
		{
			HttpSession session=request.getSession();
			session.setAttribute("username",username);
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
		else 
		{
			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);			
		}
						
		pw.close();
		}

}
