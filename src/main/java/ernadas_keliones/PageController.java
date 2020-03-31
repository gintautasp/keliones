package ernadas_keliones;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	
	
    @GetMapping("/keliones")
    public String keliones() {
        return "keliones";
    }	
    
    @GetMapping("/kelionesx")
    public String kelionesx() {
        return "kelionesx";
    }    
    
    @GetMapping("/klientai")
    public String klientai() {
        return "klientai";
    }    

    @GetMapping("/klientas")
    public String klientas(@RequestParam Integer id) {

        return "klientas";
    }    
}
