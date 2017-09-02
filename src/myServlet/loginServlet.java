package myServlet;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mypack.cartDB;
import mypack.checkOut;
import mypack.secret;
import mypack.shoppingCart;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password;
		try {
			password = secret.Encrypt(request.getParameter("password"),"bozitong41455058").substring(0,7);
		String uid = "";
		int flag = checkOut.judge(username);
		switch (flag) {
		case 1:
			uid = checkOut.byMail(username, password);
			if(uid != null){
				HttpSession session = request.getSession();
				session.setAttribute("userId",uid);
				shoppingCart cart = (shoppingCart)session.getAttribute("cart");
				for(Iterator<String> i = cart.getItems().iterator(); i.hasNext();){
					String itemId = i.next();
					cartDB.addItem(uid, itemId, cart.getQuantity(itemId));
				}
				response.sendRedirect("index.jsp");
			}
			else{
				response.setContentType("text/html; charset=utf-8");
				response.getWriter().println("<script>alert('输入信息有误，请重新输入');window.location.href='login.jsp'</script>");
			}
		case 2:
			uid = checkOut.byPhone(username, password);
			if(uid != null){
				HttpSession session = request.getSession();
				session.setAttribute("userId",uid);
				shoppingCart cart = (shoppingCart)session.getAttribute("cart");
				for(Iterator<String> i = cart.getItems().iterator(); i.hasNext();){
					String itemId = i.next();
					cartDB.addItem(uid, itemId, cart.getQuantity(itemId));
				}
				response.sendRedirect("index.jsp");
			}
			else{
				response.setContentType("text/html; charset=utf-8");
				response.getWriter().println("<script>alert('输入信息有误，请重新输入');window.location.href='login.jsp'</script>");
			}
		case 3:
			uid = checkOut.byNickName(username, password);
			if(uid != null){
				HttpSession session = request.getSession();
				session.setAttribute("userId",uid);
				shoppingCart cart = (shoppingCart)session.getAttribute("cart");
				for(Iterator<String> i = cart.getItems().iterator(); i.hasNext();){
					String itemId = i.next();
					cartDB.addItem(uid, itemId, cart.getQuantity(itemId));
				}
				response.sendRedirect("index.jsp");
			}
			else{
				response.setContentType("text/html; charset=utf-8");
				response.getWriter().println("<script>alert('输入信息有误，请重新输入');window.location.href='login.jsp'</script>");
			}
			default:
			break;
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
