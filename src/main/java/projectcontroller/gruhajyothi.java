package projectcontroller;

import java.io.IOException;

import projectdtoo.gruhajyothi1;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import projectdao.jyothi1;
import projectdtoo.gruhajyothi1;
//import projectdtoo.jyothi;

@WebServlet("/nithin123")
public class gruhajyothi extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String aadhar = req.getParameter("aadhar");
		String name = req.getParameter("name");
		String bill = req.getParameter("bill");
		String ration = req.getParameter("ration");
		Long aadhar1 = Long.parseLong(aadhar);
		int bill1 = Integer.parseInt(bill);
		int ration1 = Integer.parseInt(ration);
		gruhajyothi1 j1 = new gruhajyothi1();
		j1.setAadharno(aadhar1);
		j1.setBill(bill1);
		j1.setName(name);
		j1.setRationcard(ration1);
		jyothi1 j2 = new jyothi1();
		j2.insert(j1);
		

	}

}
