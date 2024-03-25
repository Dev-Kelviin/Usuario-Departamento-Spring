package com.devkelviin.usuariodepartamento.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devkelviin.usuariodepartamento.entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
