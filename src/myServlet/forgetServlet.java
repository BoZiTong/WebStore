package myServlet;

import java.io.IOException;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mypack.Mail;
import mypack.secret;
import mypack.userDB;

/**
 * Servlet implementation class forgetServlet
 */
@WebServlet("/forgetServlet")
public class forgetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forgetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		if(request.getParameter("userId") == null){
		String contact = request.getParameter("mail");
		try {
			Vector<String> mail = userDB.getMail();
			for(int i = 0; i < mail.size(); i++){
				if(mail.get(i).equals(contact)){
					String content = "亲爱的用户"+request.getParameter("nickName")+"，您正在使用找回密码功能，请点击如下链接修改您的密码<br><a href='http://localhost/WebStore/modifypassword.jsp?userId="+userDB.getUser(contact)+"'>http://localhost/WebStore/modifypassword.jsp?userId="+userDB.getUser(contact)+"</a>";
					Mail.send(content, contact, "找回密码");
					response.setContentType("text/html; charset=utf-8");
					response.getWriter().println("<script>alert('发送邮件成功，请查收');window.location.href='index.jsp'</script>");
				}
			}
			response.setContentType("text/html; charset=utf-8");
			response.getWriter().println("<script>alert('邮箱输入错误，请重新输入');window.location.href='forgetpassword.jsp'</script>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}else{
			String userId = request.getParameter("userId");
			try{
			if(request.getParameter("p1").equals(request.getParameter("p2"))){
				String password = secret.Encrypt(request.getParameter("p2"), "bozitong41455058").substring(0,7);
				userDB.setPassword(userId, password);
				response.setContentType("text/html; charset=utf-8");
				response.getWriter().println("<script>alert('修改成功');window.location.href='http://localhost/WebStore/login.jsp'</script>");
			}else{response.setContentType("text/html; charset=utf-8");
			response.getWriter().println("<script>alert('两次输入密码输入不一致，请重新输入');window.location.href='http://localhost/WebStore/modifypassword.jsp?userId="+userId+"'</script>");
			}}catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
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
