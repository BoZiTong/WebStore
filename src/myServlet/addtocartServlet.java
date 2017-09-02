package myServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mypack.cartDB;
import mypack.shoppingCart;

/**
 * Servlet implementation class addtocartServlet
 */
@WebServlet("/addtocartServlet")
public class addtocartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addtocartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String itemId = request.getParameter("itemId");
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		HttpSession session = request.getSession();
		if(session.getAttribute("userId") != null){
			String userId = (String) session.getAttribute("userId");
			try {
				cartDB.addItem(userId, itemId, quantity);
			} catch (SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.setContentType("text/html; charset=utf-8");
			response.getWriter().println("<script>alert('添加成功');window.location.href='cart.jsp'</script>");
	
		}else{
			shoppingCart cart = (shoppingCart) session.getAttribute("cart");
			cart.add(itemId, quantity);
			response.setContentType("text/html; charset=utf-8");
			response.getWriter().println("<script>alert('添加成功');window.location.href='cart.jsp'</script>");
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
