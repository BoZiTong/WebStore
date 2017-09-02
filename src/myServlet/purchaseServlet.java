 package myServlet;
 
 
import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mypack.cartDB;
import mypack.itemDB;
import mypack.orderDB;

/**
 * Servlet implementation class purchaseServlet
 */
@WebServlet("/purchaseServlet")
public class purchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public purchaseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		if(session.getAttribute("userId") == null){
			response.setContentType("text/html; charset=utf-8");
			response.getWriter().println("<script>alert('请先登录！');window.location.href='login.jsp'</script>");
		}else{
			String userId = (String) session.getAttribute("userId");
			if(request.getParameter("itemId") != null){
				try {
					String itemId = request.getParameter("itemId");
					itemDB.setQuantity(itemId, cartDB.getQuantity(itemId, userId));
					Calendar calendar = Calendar.getInstance();
					String description = cartDB.getQuantity(itemId, userId) + "件" + itemDB.getName(itemId);
					String orderId = userId + String.valueOf(calendar.get(Calendar.YEAR)) + String.valueOf(calendar.get(Calendar.MONTH)) + String.valueOf(calendar.get(Calendar.DATE)) + String.valueOf(calendar.get(Calendar.HOUR_OF_DAY)) + String.valueOf(calendar.get(Calendar.MINUTE)) + String.valueOf(calendar.get(Calendar.SECOND));
					orderDB.insertOrder(orderId, userId, description, cartDB.purchase(userId, itemId));	
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				response.setContentType("text/html; charset=utf-8");
				response.getWriter().println("<script>alert('购买成功');window.location.href='index.jsp'</script>");
			}else{
				try {
					Vector<String> item = cartDB.getItem(userId);
					String description = "";
					float price = 0.0f;
					for(int i = 0; i < item.size(); i++){
						itemDB.setQuantity(item.get(i), cartDB.getQuantity(item.get(i), userId));
						description += cartDB.getQuantity(item.get(i), userId) + "件" + itemDB.getName(item.get(i));	
						price += cartDB.purchase(userId, item.get(i));
					}
					Calendar calendar = Calendar.getInstance();
					String orderId = userId + String.valueOf(calendar.get(Calendar.YEAR)) + String.valueOf(calendar.get(Calendar.MONTH)) + String.valueOf(calendar.get(Calendar.DATE)) + String.valueOf(calendar.get(Calendar.HOUR_OF_DAY)) + String.valueOf(calendar.get(Calendar.MINUTE)) + String.valueOf(calendar.get(Calendar.SECOND));
					orderDB.insertOrder(orderId, userId, description, price);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				response.setContentType("text/html; charset=utf-8");
				response.getWriter().println("<script>alert('购买成功');window.location.href='index.jsp'</script>");
			}
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
