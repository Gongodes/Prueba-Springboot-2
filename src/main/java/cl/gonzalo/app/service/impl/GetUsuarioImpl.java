package cl.gonzalo.app.service.impl;

import cl.gonzalo.app.model.Usuario;
import cl.gonzalo.app.repository.IUsuario;
import cl.gonzalo.app.service.IGetUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUsuarioImpl implements IGetUsuario {

    @Autowired
    private IUsuario repo;

    @Override
    public Iterable<Usuario> lista() {

        return repo.findAll();
    }

    @Override
    public Usuario usuario(int id) {
        return repo.findById(id);
    }

    @Override
    public List<Usuario> filtro(String gender, int age) {
        return repo.findAllByGenderAndAge(gender,age);
    }


}
