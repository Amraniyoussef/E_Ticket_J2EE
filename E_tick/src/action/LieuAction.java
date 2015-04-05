package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;
import model.Lieu;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import service.IServiceObject;
import form.ClientForm;
import form.LieuForm;

public class LieuAction extends ActionSupport{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception{
	
		LieuForm pr = (LieuForm)form;
		
		System.out.println("Nom : " + pr.getCapacite());
		System.out.println("Age : " + pr.getAdresse());
		System.out.println("CodeP : " + pr.getNbCategorie());

		System.out.println("Ville : " + pr.getNomLieu());
		
		
		IServiceObject lieuService=(IServiceObject)getWebApplicationContext().getBean("lieuService");
		
		
		Lieu li = new Lieu();
		li.setAdresse(pr.getAdresse());
		li.setCapacite(pr.getCapacite());
		li.setNbCategorie(pr.getNbCategorie());
		li.setNomLieu(pr.getNomLieu());
		lieuService.create(li);
		
		
		
		
	
			return mapping.findForward("suite");
	
		
	}
}

