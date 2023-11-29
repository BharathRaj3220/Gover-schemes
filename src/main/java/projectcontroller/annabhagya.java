package projectcontroller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import projectdao.annabhagya2;
import projectdtoo.annabhagya1;
@WebServlet("/annabhagya")
public class annabhagya  extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String aadhar=req.getParameter("aadhar");
		String ration=req.getParameter("ration");
		int ration1=Integer.parseInt(ration);
		Long aadhar1=Long.parseLong(aadhar);
		annabhagya1 a1=new annabhagya1();
		a1.setAadharno(aadhar1);
		a1.setName(name);
		a1.setRationno(ration1);
		annabhagya2 a2=new annabhagya2();
		a2.insert(a1);
		
	}

}
