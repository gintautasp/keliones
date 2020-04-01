package ernadas_keliones;

import org.springframework.data.repository.CrudRepository;



/**
 * Duomenų bazės lentelės <i>keliones</i> JPA repositorija
 * 
 * {@link Keliones}
 * @see <a href="https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html">JPA repositorija</a>
 * @author Gintautas
 *
 */
public interface KelionesRepository extends CrudRepository<Keliones,Integer> {
	
}
