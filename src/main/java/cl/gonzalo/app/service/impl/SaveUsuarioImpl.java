package cl.gonzalo.app.service.impl;

import cl.gonzalo.app.model.Usuario;
import cl.gonzalo.app.repository.IUsuario;
import cl.gonzalo.app.service.ISaveUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveUsuarioImpl implements ISaveUsuario {
    @Autowired
    private IUsuario rp;

    @Override
    public void save(Usuario usuario) {

        rp.save(usuario);

    }
}
