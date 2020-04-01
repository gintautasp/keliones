package ernadas_keliones;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;


/**
 * Duomenų bazės lentelės <i>keliones</i> 1-o įrašo klasė
 * 
 * @author Gintautas
 *
 */
@Entity
public class Keliones {
	
	/**
	 * Įrašo id
	 */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
	/**
	 * Kelionės pavadinimas
	 */
    private String pav;
    
	/**
	 * Kelionės aprašymas
	 */    
    private String apras;
    
	/**
	 * Kelionės kaina
	 */    
    private Double kaina;
    
	/**
	 * Kelionės trukmė valandomis
	 */
    private Integer trukmeVal;
    
	/**
	 * Požymis rodantis ar kelionė yra poilsinė
	 */    
    private Integer flagPoilsines;	
    
	/**
	 * Požymis rodantis ar kelionė yra pažintinė
	 */       
    private Integer flagPazintines;
    
	/**
	 * Požymis rodantis ar į kelionės kaina yra viskas įskaiciuota
	 */       
    private Integer flagViskasIsk;	
    
	/**
	 * Požymis kažką rodantis neatsimenu ką
	 */     
    private Integer flagLaisvPasir;

	/**
	 * Id getter'is
	 * 
	 * @return id įrašo Id
	 */       
	public Integer getId() {
		return id;
	}

	/**
	 * Id setter'is
	 * 
	 * @param id įrašo Id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Pavadininimo (laukelis <i>pav</i>) getter'is
	 * 
	 * @return pav pavadininimo (laukelis <i>pav</i>)
	 */	
	public String getPav() {
		return pav;
	}
	
	/**
	 * Pavadininimo (laukelis <i>pav</i>) setter'is
	 * 
	 * @param pav pavadininimas (laukelis <i>pav</i>)
	 */	
	public void setPav(String pav) {
		this.pav = pav;
	}

	/**
	 * Aprasymo (laukelis <i>apras</i>) getter'is
	 * 
	 * @return apras (laukelis <i>apras</i>)
	 */	
	public String getApras() {
		return apras;
	}

	/**
	 * Aprasymo (laukelis <i>apras</i>) setter'is
	 * 
	 * @param apras aprašymas (laukelis <i>apras</i>)
	 */		
	public void setApras(String apras) {
		this.apras = apras;
	}
	
	/**
	 * Kainos (laukelis <i>kaina</i>) getter'is
	 * 
	 * @return kaina (laukelis <i>kaina</i>)
	 */	
	public Double getKaina() {
		return kaina;
	}
	
	/**
	 * Kainos (laukelis <i>kaina</i>) setter'is
	 * 
	 * @param kaina (laukelis <i>kaina</i>)
	 */	
	public void setKaina(Double kaina) {
		this.kaina = kaina;
	}

	/**
	 * Trukmės, valandomis (laukelis <i>trukme_val</i>) getter'is
	 * 
	 * @return trukmeVal (laukelis <i>trukme_val</i>)
	 */
	public Integer getTrukmeVal() {
		return trukmeVal;
	}

	/**
	 * Trukmės, valandomis (laukelis <i>trukme_val</i>) setter'is
	 * 
	 * @param trukmeVal (laukelis <i>trukme_val</i>)
	 */	
	public void setTrukmeVal(Integer trukmeVal) {
		this.trukmeVal = trukmeVal;
	}

	/**
	 * Požymio, kad kelionė poilsinė (laukelis <i>flag_poilsines</i>) getter'is
	 * 
	 * @return flagPoilsines (laukelis <i>flag_poilsines</i>)
	 */	
	public Integer getFlagPoilsines() {
		return flagPoilsines;
	}

	/**
	 * Požymio, kad kelionė poilsinė (laukelis <i>flag_poilsines</i>) setter'is
	 * 
	 * @param flagPoilsines (laukelis <i>flag_poilsines</i>)
	 */		
	public void setFlagPoilsines(Integer flagPoilsines) {
		this.flagPoilsines = flagPoilsines;
	}

	/**
	 * Požymio, kad kelionė pažintinė (laukelis <i>flag_pazintines</i>) getter'is
	 * 
	 * @return flagPazintines (laukelis <i>flag_pazintines</i>)
	 */	
	public Integer getFlagPazintines() {
		return flagPazintines;
	}
	
	/**
	 * Požymio, kad kelionė pažintinė (laukelis <i>flag_pazintines</i>) setter'is
	 * 
	 * @param flagPazintines (laukelis <i>flag_pazintines</i>)
	 */	
	public void setFlagPazintines(Integer flagPazintines) {
		this.flagPazintines = flagPazintines;
	}

	/**
	 * Požymio, kad į kelionės kainą viskas įskaiciuota (laukelis <i>flag_viskas_isk</i>) getter'is
	 * 
	 * @return flagViskasIsk (laukelis <i>flag_viskas_isk</i>)
	 */	
	public Integer getFlagViskasIsk() {
		return flagViskasIsk;
	}

	/**
	 * Požymio, kad į kelionės kainą viskas įskaiciuota (laukelis <i>flag_viskas_isk</i>) setter'is
	 * 
	 * @param flagViskasIsk (laukelis <i>flag_viskas_isk</i>)
	 */	
	public void setFlagViskasIsk(Integer flagViskasIsk) {
		this.flagViskasIsk = flagViskasIsk;
	}

	public Integer getFlagLaisvPasir() {
		return flagLaisvPasir;
	}

	public void setFlagLaisvPasir(Integer flagLaisvPasir) {
		this.flagLaisvPasir = flagLaisvPasir;
	}
}
