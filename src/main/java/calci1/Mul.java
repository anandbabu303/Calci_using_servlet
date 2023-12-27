package calci1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/mul")
public class Mul extends HttpServlet{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doGet(req, resp);
	int num1=Integer.parseInt(req.getParameter("num1"));
	int num2=Integer.parseInt(req.getParameter("num2"));
	double mul=num1*num2;
	resp.getWriter().print("mul  "+mul);
}
}
