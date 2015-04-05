package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;
import model.Seance;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import service.IServiceObject;
import form.ClientForm;
import form.SeanceForm;

public class SeanceAction extends ActionSupport{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception{
	
		SeanceForm pr = (SeanceForm)form;
		
		System.out.println("Nom : " + pr.getHeureDebut());
		System.out.println("Age : " + pr.getHeureFin());
		
		
		IServiceObject seanceService=(IServiceObject)getWebApplicationContext().getBean("seanceService");
		
		Seance s = new Seance();
		s.setHeureDebut(pr.getHeureDebut());
		s.setHeureFin(pr.getHeureFin());
		seanceService.create(s);
		
		
		
		
		
	
			return mapping.findForward("suite");
	
		
	}
}
