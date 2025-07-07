package com.ceatformacion.registrousuarios.Service.@Service

import org.springframework.stereotype.Service;
import com.example.modelo.Usuario;
import com.example.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioService usuarioService;

    // Método CRUD
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }
    public Optional<Usuario> findById(int id){
        return usuarioService.findById(id);
    }
    public Usuario save(Usuario usuario){
        return usuarioService.save(usuario);
    }
    public void deleteById(int id){
        usuarioService.deleteById(id);
    }
}


