package projectcontroller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import projectdao.yuvanidhi2;
import projectdtoo.yuvanidhi1;
@WebServlet("/yuvanidhi")
public class yuvanidhi extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String aadhar=req.getParameter("aadhar");
		String name=req.getParameter("name");
		String ration=req.getParameter("ration");
		Long aadhar1=Long.parseLong(aadhar);
		int ration1=Integer.parseInt(ration);
		yuvanidhi1 y1=new yuvanidhi1();
		y1.setAadharno(aadhar1);
		y1.setName(name);
		y1.setRationno(ration1);
		yuvanidhi2 y2=new yuvanidhi2();
		y2.insert(y1);
		
	}

}
