package projectcontroller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import projectdao.lakshmi;
import projectdtoo.lakshmi1;
@WebServlet("/gruhalakshmi")
public class gruhalakshmi extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String aadhar=req.getParameter("aadhar");
		String name=req.getParameter("name");
		String income=req.getParameter("income");
		String ration=req.getParameter("ration");
		Long aadhar1=Long.parseLong(aadhar);
		int income1=Integer.parseInt(income);
		int ration1=Integer.parseInt(ration);
		lakshmi1 l1=new lakshmi1();
		l1.setAadharno(aadhar1);
		l1.setIncome(income1);
		l1.setName(name);
		l1.setRationno(ration1);
	lakshmi l2=new lakshmi();
	l2.insert(l1);
	
		
	}

}
