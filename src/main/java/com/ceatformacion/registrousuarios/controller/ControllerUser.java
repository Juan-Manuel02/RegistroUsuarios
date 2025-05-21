package com.ceatformacion.registrousuarios.controller;
import com.ceatformacion.registrousuarios.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;

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

}
