package br.com.fiap.GerenciamentoTrafego.repository;

import br.com.fiap.GerenciamentoTrafego.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT u FROM tbl_usuarios s WHERE u.email = :email")
    Optional<Usuario> buscarPorStatus(@Param("email") String email);
}
