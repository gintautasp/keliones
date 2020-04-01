package ernadas_keliones;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * 
 * Pavyzdinė mokomosios web aplikacijos - kelionių informacinės sistemos AJAX užklausų kontroleris
 * 
 * @author shplintas
 *
 */

@Controller    // This means that this class is a Controller
@RequestMapping(path="/ajax") // This means URL's start with /demo (after Application path)
public class AjaxController {
	
	
	/**
	 * Duomenų bazės lentelės <i>keliones</i> JPA repositorija
	 * 
	 * @see <a href="https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html">JPA repositorija</a>
	 * {@link Keliones}
	 */	
	@Autowired
	KelionesRepository kelionesRepository;
	
	@Autowired
	KlientaiRepository klientaiRepository;	
	
	@Autowired
	KlientaiKelionesRepository klientaiKelionesRepository;		
	
	@GetMapping(path="/saugoti-kelione") // Map ONLY GET Requests
	public @ResponseBody String saugotiKelione (@RequestParam Integer id 
			, @RequestParam String pav
			, @RequestParam String apras
			, @RequestParam Integer flagPoilsines
			, @RequestParam Integer flagPazintines	
			, @RequestParam Integer flagViskasIsk	
			, @RequestParam Integer flagLaisvPasir
			) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		String res = "Not done";
		Keliones n = new Keliones();
		
		if (id > 0) {
		
			Optional <Keliones> found = kelionesRepository.findById( id );
		
			// variantas trynimuiui
			// uzsakymaiRepository.deleteById(id);
		
			if ( found.isPresent() ) {
			
			   n = found.get();
			   n.setId(id);
			}
		}
		
	    n.setPav( pav );
	    n.setApras(apras);
	    n.setFlagPazintines(flagPazintines);
	    n.setFlagPoilsines(flagPoilsines);
		n.setFlagViskasIsk(flagViskasIsk);
		n.setFlagLaisvPasir(flagLaisvPasir);
	    kelionesRepository.save(n);	
	    res = "Saved";
	    
		return res;
	}
	
	@GetMapping(path="/salinti-kelione") // Map ONLY GET Requests
	public @ResponseBody String salintiKelione (@RequestParam Integer id 
			) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		Optional <Keliones> found = kelionesRepository.findById( id );
		
		String res = "Not done";
		
		if ( found.isPresent() ) {
			
			   Keliones n = found.get();
			   kelionesRepository.deleteById(id);
			   res = "Deleted";
		}		
		return res;
	}		

	@GetMapping(path="/lst-keliones")
	public @ResponseBody Iterable<Keliones> getAllKeliones() {
		// This returns a JSON or XML with the users
		return kelionesRepository.findAll();
	}
	
	/**
	 * Pateikia visų kelionių JSON sąrašą
	 * 
	 * [@link Keliones]
	 * @return Iterable<Keliones>
	 */
	@GetMapping(path="/lst-kelionesx")
	public @ResponseBody Iterable<Keliones> getAllKelionesX() {
		// This returns a JSON or XML with the users
		return kelionesRepository.findAll();
	}	

	@GetMapping(path="/saugoti-klienta") // Map ONLY GET Requests
	public @ResponseBody String saugotiKlienta (@RequestParam Integer id 
			, @RequestParam String pav
			, @RequestParam Integer flagPoilsines
			, @RequestParam Integer flagPazintines	
			, @RequestParam Integer flagViskasIsk	
			, @RequestParam Integer flagLaisvPasir
			) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		String res = "Not done";
		Klientai n = new Klientai();
		
		if (id > 0) {
		
			Optional <Klientai> found = klientaiRepository.findById( id );
		
			// variantas trynimuiui
			// uzsakymaiRepository.deleteById(id);
		
			if ( found.isPresent() ) {
			
			   n = found.get();
			   n.setId(id);
			}
		}
		
	    n.setPav( pav );
	    n.setFlagPazintines(flagPazintines);
	    n.setFlagPoilsines(flagPoilsines);
		n.setFlagViskasIsk(flagViskasIsk);
		n.setFlagLaisvPasir(flagLaisvPasir);
	    klientaiRepository.save(n);	
	    res = "Saved";
	    
		return res;
	}
	
	@GetMapping(path="/salinti-klienta") // Map ONLY GET Requests
	public @ResponseBody String salintiKlienta (@RequestParam Integer id 
			) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		Optional <Klientai> found = klientaiRepository.findById( id );
		
		String res = "Not done";
		
		if ( found.isPresent() ) {
			
			   Klientai n = found.get();
			   klientaiRepository.deleteById(id);
			   res = "Deleted";
		}		
		return res;
	}		

	@GetMapping(path="/lst-klientai")
	public @ResponseBody Iterable<Klientai> getAllKlientai() {
		// This returns a JSON or XML with the users
		return klientaiRepository.findAll();
	}	
	
	@GetMapping(path="/klientas")
	public @ResponseBody Optional<Klientai> getKlientas(@RequestParam Integer id) {
		// This returns a JSON or XML with the users
		Optional <Klientai> found = klientaiRepository.findById( id );		
		/*
		if ( found.isPresent() ) {
			
			   Uzsakymai n = found.get();
		}		
		*/	
		return found;
	}	
	
	@GetMapping(path="/kliento-kelione") // Map ONLY GET Requests
	public @ResponseBody String saugotiProduktaPatiekalo (@RequestParam Integer id 
			, @RequestParam(defaultValue="0") Integer id_kl
			, @RequestParam(defaultValue="0") Integer id_keliones
			) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		String res = "Not done";
		KlientaiKeliones n = new KlientaiKeliones();
		
		System.out.println ( "id: " + id + " kliento. id: " + id_kl + " keliones. id " + id_keliones );
		
		if (id > 0) {
		
			Optional <KlientaiKeliones> found = klientaiKelionesRepository.findById( id );
		
			// variantas trynimuiui
			// uzsakymaiRepository.deleteById(id);
		
			if ( found.isPresent() ) {
			
			   n = found.get();
			  //  n.setId(id);
			}
			
		} else {
		
			if ( ( id_kl > 0 ) && ( id_keliones > 0 ) ) {
				
				n.setKlientai_id ( id_kl );
				n.setKeliones_id( id_keliones );
			}
		}
		
		System.out.println ( n.toString() );			   			   
		klientaiKelionesRepository.save(n);	
		res = "Saved";
	    
		return res;
	}
	
	@GetMapping(path="/salinti-kliento-kelione") // Map ONLY GET Requests
	public @ResponseBody String salintiKlientoKelione (@RequestParam Integer id_kl
			, @RequestParam Integer id 
			) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		Optional <KlientaiKeliones> found = klientaiKelionesRepository.findById( id );
		
		String res = "Not done";
		
		if ( found.isPresent() ) {
			
			   KlientaiKeliones n = found.get();
			   klientaiKelionesRepository.deleteById(id);
			   res = "Deleted";
		}		
		return res;
	}	
}
