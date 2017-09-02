package myServlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mypack.secret;
import mypack.userDB;

/**
 * Servlet implementation class signupServlet
 */
@WebServlet("/signupServlet")
public class signupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		if(request.getParameter("p1").equals(request.getParameter("p2"))){
			try {
				String password = secret.Encrypt(request.getParameter("p1"),"bozitong41455058").substring(0, 7);
				String nickName = request.getParameter("nickName");
				String gender = request.getParameter("gender");
				String mail = request.getParameter("mail");
				String phone = request.getParameter("phone");
				String address = request.getParameter("address");
				Vector<String> mails = userDB.getMail();
				for(int i = 0; i < mails.size(); i++){
					if(mail.equals(mails.get(i))){
						response.setContentType("text/html; charset=utf-8");
						response.getWriter().println("<script>alert('邮箱已被注册');window.location.href='signup.jsp'</script>");
					}
				}
				String userId = userDB.insertUser(password, nickName, gender, mail, phone, address);
				HttpSession session = request.getSession();
				session.setAttribute("userId", userId);
				response.setContentType("text/html; charset=utf-8");
				response.getWriter().println("<script>alert('注册成功');window.location.href='index.jsp'</script>");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			response.setContentType("text/html; charset=utf-8");
			response.getWriter().println("<script>alert('两次输入密码输入不一致，请重新输入');window.location.href='signup.jsp'</script>");
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
