package ernadas_keliones;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;

@Controller
public class PageController {
	
	@Autowired 
	EntityManagerFactory factory;	
	
	// @Bean
	public SessionFactory sessionFactory() {

		
	        if (factory.unwrap(SessionFactory.class) == null) {
	            throw new NullPointerException("factory is not a hibernate factory");
	        }
	        return factory.unwrap(SessionFactory.class);
	}	
	
    @GetMapping("/")
    public String pradzia(Model model) {
        model.addAttribute("lst_menu", Menu.values() );    	
        return "index";
    }	
	
    @GetMapping("/keliones")
    public String keliones(Model model) {
        model.addAttribute("lst_menu", Menu.values() );    	
        return "keliones";
    }	
    
	/**
	 * Gražina puslapio, kuris per AJAX užkrauna, savyje užkrauna kelionių sąrašą, šabloną kelionex
	 * 
	 * {@link AjaxController#getAllKelionesX}
	 * @return puslapio šablonas kelionex
	 */    
    @GetMapping("/kelionesx")
    public String kelionesx() {
        return "kelionesx";
    }    
    
    @GetMapping("/klientai")
    public String klientai(Model model) {
        model.addAttribute("lst_menu", Menu.values() );    	
        return "klientai";
    }    

    @GetMapping("/klientas")
    public String klientas(@RequestParam Integer id, Model model) {
        model.addAttribute("lst_menu", Menu.values() );
        return "klientas";
    }  
        
	@GetMapping(path="/pasiulymai")
	public  String											
		getPasiulymai(
			@RequestParam Integer id
			, Model model
	) {

		Session session = this.sessionFactory().openSession(); 
		
		Pasiulymai pasiulymai =  new Pasiulymai( session );
        model.addAttribute("lst_pasiulymai", pasiulymai.pasiulymai( id ) );
        model.addAttribute("lst_menu", Menu.values() );        
		return "pasiulymai";
	}    
}
