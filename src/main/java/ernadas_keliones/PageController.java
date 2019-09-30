package ernadas_keliones;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	
    @GetMapping("/keliones")
    public String keliones() {
        return "keliones";
    }	
    
    @GetMapping("/klientai")
    public String klientai() {
        return "klientai";
    }    

}
