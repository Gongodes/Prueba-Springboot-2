package cl.gonzalo.app.service.impl;

import cl.gonzalo.app.repository.IUsuario;
import cl.gonzalo.app.service.IDeleteUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteUsuarioImpl implements IDeleteUsuario {

    @Autowired
    private IUsuario repo;

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }
}
