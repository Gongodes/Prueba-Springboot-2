package cl.gonzalo.app.service;

import cl.gonzalo.app.model.Usuario;

public interface IGetUsuario {

    public Iterable<Usuario> lista();
    public Usuario usuario(int id);

    public Iterable<Usuario> filtro(String gender, int age);
}
