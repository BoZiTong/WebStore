package myServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mypack.secret;
import mypack.userDB;

/**
 * Servlet implementation class userServlet
 */
@WebServlet("/userServlet")
public class userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userServlet() {
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
		String userId = (String) session.getAttribute("userId");
		if(request.getParameter("type").equals("info")){
			String nickName = request.getParameter("nickName");
			String gender = request.getParameter("gender");
			String mail = request.getParameter("mail");
			String phone = request.getParameter("phone");
			String address = request.getParameter("address");
			try {
				userDB.setNickName(userId, nickName);
				userDB.setGender(userId, gender);
				userDB.setMail(userId, mail);
				userDB.setPhone(userId, phone);
				userDB.setAddress(userId, address);
			} catch (SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.setContentType("text/html; charset=utf-8");
			response.getWriter().println("<script>alert('修改成功');window.location.href='userinfo.jsp?type=info'</script>");
		}else{
			try {
				if(secret.Encrypt(request.getParameter("p1"),"bozitong41455058").substring(0,7).equals(userDB.getPassword(userId))){
					if(request.getParameter("p2").equals(request.getParameter("p3"))){
						String password = secret.Encrypt(request.getParameter("p2"), "bozitong41455058").substring(0,7);
						userDB.setPassword(userId, password);
						response.setContentType("text/html; charset=utf-8");
						response.getWriter().println("<script>alert('修改成功');window.location.href='userinfo.jsp?type=password'</script>");
					}else{response.setContentType("text/html; charset=utf-8");
					response.getWriter().println("<script>alert('两次输入密码输入不一致，请重新输入');window.location.href='userinfo.jsp?type=password'</script>");
					}
				}else{
					response.setContentType("text/html; charset=utf-8");
					response.getWriter().println("<script>alert('原密码错误，请重新输入');window.location.href='userinfo.jsp?type=password'</script>");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
