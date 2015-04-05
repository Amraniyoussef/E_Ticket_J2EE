package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import model.Client;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import service.IServiceObject;
import form.ClientForm;

public class ClientAction extends ActionSupport{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception{
	
		ClientForm pr = (ClientForm)form;
		
		System.out.println("Nom : " + pr.getNomClient());
		System.out.println("Age : " + pr.getPrenomClient());
		System.out.println("CodeP : " + pr.getAdresseClient());

		System.out.println("Ville : " + pr.getLoginClient());
		
		
		IServiceObject clientService=(IServiceObject)getWebApplicationContext().getBean("clientService");
		
		Client cl = new Client();
		cl.setNomClient(pr.getNomClient());
		cl.setPrenomClient(pr.getPrenomClient());
		cl.setAdresseClient( pr.getAdresseClient());
		cl.setTelClient(pr.getTelClient());
		cl.setLoginClient(pr.getLoginClient());
		cl.setPassClient(pr.getPassClient());
		clientService.create(cl);
		
		
		
		
		
	
			return mapping.findForward("suite");
	
		
	}
}

