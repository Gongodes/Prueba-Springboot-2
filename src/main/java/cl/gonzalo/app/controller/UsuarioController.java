package cl.gonzalo.app.controller;

import cl.gonzalo.app.model.Usuario;
import cl.gonzalo.app.service.impl.DeleteUsuarioImpl;
import cl.gonzalo.app.service.impl.GetUsuarioImpl;
import cl.gonzalo.app.service.impl.SaveUsuarioImpl;
import cl.gonzalo.app.service.impl.UpdateUserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    private SaveUsuarioImpl rp;

    @Autowired
    private GetUsuarioImpl user;


    @Autowired
    private DeleteUsuarioImpl delete;

    @Autowired
    private UpdateUserImpl update;


    @PostMapping("save")
    public String save(@RequestBody Usuario usuario) {

        rp.save(usuario);

        return "El usuario se ha guardado correctamente.";
    }


    @GetMapping("getUsers")
    public Iterable<Usuario> list() {
        return user.lista();
    }


    @GetMapping("getUsers/{id}")
    public List<Usuario> getById(@PathVariable List<Integer> id) {

        List<Usuario> lista = new ArrayList<>();

        for (int i = 0; i < id.size(); i++) {

            lista.add(user.usuario(id.get(i)));
        }
        return lista;
    }


    @GetMapping("getByGenderAndAge")
    public List<Usuario> getByGenderAndAge(@RequestParam Map<String, String> queryParams) {

        String gender = queryParams.get("gender");
        int age = Integer.parseInt(queryParams.get("age"));

        return user.filtro(gender, age);
    }


    @DeleteMapping("deleteUser/{id}")
    public String delete(@PathVariable("id") Integer id) {
        try {
            delete.delete(id);
        } catch (Exception e) {

            return "El id " + id + " no se encuentra presente en la lista";
        }
        return "El usuario " + id + " ha sido eliminado exitosamente.";
    }

    @PutMapping("updateUser/{id}")
    public String update(@PathVariable("id") Integer id,  @RequestBody Usuario usuario) {

        if(user.usuario(id) == null){

            return "El usuario " + id + " no existe.";

        }else {


            update.update(usuario,id);
        }


        return "El usuario " + id + " ha sido actualizado exitosamente.";
    }
}