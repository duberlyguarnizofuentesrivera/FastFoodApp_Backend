/**
 * 
 */
package JEstebanC.FastFoodApp.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JEstebanC.FastFoodApp.model.Client;

/**
 * @author Juan Esteban Castaño Holguin
 * castanoesteban9@gmail.com
 * 2022-01-26
 */
@Repository
public interface IClientRepository extends JpaRepository<Client, Long>{
	 Collection<Client> findByName(String name);
	 Client findByEmail(String email);

}
