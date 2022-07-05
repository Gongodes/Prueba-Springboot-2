package cl.gonzalo.app.repository;

import cl.gonzalo.app.model.Usuario;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

    Usuario findById(int id);



    List<Usuario> findAllByGenderAndAge(String gender, int Age);
}
