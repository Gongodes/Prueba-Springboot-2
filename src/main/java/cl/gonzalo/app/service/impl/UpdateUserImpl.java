package cl.gonzalo.app.service.impl;

import cl.gonzalo.app.model.Usuario;
import cl.gonzalo.app.repository.IUsuario;
import cl.gonzalo.app.service.IUpdateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserImpl implements IUpdateUser {

    @Autowired
    private IUsuario repo;


    @Override
    public void update(Usuario usuario, Integer id) {
        Usuario user = new Usuario();
        user.setId(id);
        user.setAge(usuario.getAge());
        user.setEmail(usuario.getEmail());
        user.setGender(usuario.getGender());
        user.setName(usuario.getName());
        user.setLastName(usuario.getLastName());

        repo.save(user);
    }

}
