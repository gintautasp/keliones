package ernadas_keliones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Pavyzdinė mokomoji web aplikacija - kelionių informacinė sistema
 * Leidžia įvesti kelionių pavadinimus, aprašymus, kainą, trukmę,
 * pažymėti pagal tipą ar poilsinė, ar pažintinė kelionė,
 * ar viskas įskaiciuota
 * ir kokie miestai yra aplankomi kelionės metu
 * 
 * @author Gintautas
 *
 */
@SpringBootApplication
public class KelionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(KelionesApplication.class, args);
	}

}
