package ernadas_keliones;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@Entity
public class KlientaiKeliones {
    private static final long serialVersionUID = -6790693372846798580L;	
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)	

	private Integer id;
    
	private Integer klientai_id;
	private Integer keliones_id;
	
    @JsonIgnoreProperties("klientaiKeliones")
    @ManyToOne
    @JoinColumn(insertable=false, updatable=false)
    private Klientai klientai;

    // @JsonIgnoreProperties("patiekalu_produktai")
    @ManyToOne
    @JoinColumn(insertable=false, updatable=false)
    private Keliones keliones;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getKlientai_id() {
		return klientai_id;
	}

	public void setKlientai_id(Integer klientai_id) {
		this.klientai_id = klientai_id;
	}

	public Integer getKeliones_id() {
		return keliones_id;
	}

	public void setKeliones_id(Integer keliones_id) {
		this.keliones_id = keliones_id;
	}

	public Klientai getKlientai() {
		return klientai;
	}

	public void setKlientai(Klientai klientai) {
		this.klientai = klientai;
	}

	public Keliones getKeliones() {
		return keliones;
	}

	public void setKeliones(Keliones keliones) {
		this.keliones = keliones;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	} 	
    
    
}
