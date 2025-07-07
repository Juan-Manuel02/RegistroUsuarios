package com.ceatformacion.registrousuarios.controller;
import com.ceatformacion.registrousuarios.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.Iterator;

@Controller
public class ControllerUser {

    @GetMapping("/registro") // URL que usa para ver el formulario.
    public String AltaUsuario(Model model){
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("pagina", "Alta Usuario");
        return "formulario"; // envía al formulario.html
    }

    // Agreamos una colección para ir guardando los usuarios que se han dado de alta
    ArrayList <Usuario> ListaUsuarios = new ArrayList<>();

    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute Usuario usuario, Model model){
        ListaUsuarios.add(usuario);
        System.out.println(usuario);
        return "crud";
    }

    @GetMapping("/crud")
    public String verUsuarios(Model model){
        // Pasamos la lista de usuarios a la vista
        model.addAttribute("usuarios", ListaUsuarios);
        return "crud"; // Nombre de la vista para mostrar los usuarios
    }

    @GetMapping("/editar/{idUsuario}")
    public String modificarUsuario(@ModelAttribute Usuario usuario, Model model, @PathVariable int idUsuario){
       // instancia de la clase Usuario donde se guardarán el objeto usuario encontrado en el iterator, para pasarlo a la vista -> modificar.html
        Usuario usuarioE = null;
        // iterator para recorrer el ArrayList y ubicar el id que se pasa por parametro
        Iterator<Usuario> iterator = ListaUsuarios.iterator();

        while(iterator.hasNext()){
            Usuario usuarioAux = iterator.next();
            if(usuarioAux.getIdUsuario() == idUsuario){
                usuarioE = usuarioAux;
                break;
            }
        }
        if (listaUsuarioa != null){
            model.addAttribute("usuario", usuarioE);
            return "modificar";
        }else { // si no encuentra o si la lista está vacía.
            return "redirect:/crud";
        }
        model.addAttribute("usuario", usuarioE);
        model.addAttribute("pagina", "Editar Usuario");
        return "redirect:/crud";
    }
}
