package projectcontroller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import projectdao.shakthi2;
import projectdtoo.shakthi1;
@WebServlet("/shakthi")
public class shakthi extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String aadhar=req.getParameter("aadhar");
		String ration=req.getParameter("ration");
		long aadhar1=Long.parseLong(aadhar);
		int ration1=Integer.parseInt(ration);
		shakthi1 s1=new shakthi1();
		s1.setAadharno(aadhar1);
		s1.setName(name);
		s1.setRation(ration1);
		shakthi2 s2=new shakthi2();
		s2.insert(s1);
		
	}

}
