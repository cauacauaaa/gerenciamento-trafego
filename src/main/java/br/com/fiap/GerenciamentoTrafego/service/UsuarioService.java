package br.com.fiap.GerenciamentoTrafego.service;

import br.com.fiap.GerenciamentoTrafego.dto.UsuarioCadastroDTO;
import br.com.fiap.GerenciamentoTrafego.dto.UsuarioExibicaoDTO;
import br.com.fiap.GerenciamentoTrafego.model.Usuario;
import br.com.fiap.GerenciamentoTrafego.repository.UsuarioRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(UsuarioCadastroDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        BeanUtils.copyProperties(usuarioDTO, usuario);
        return usuarioRepository.save(usuario);
    }
    public UsuarioExibicaoDTO buscarPorId(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if(usuario.isPresent()) {
            return new UsuarioExibicaoDTO(usuario.get());
        }
        else{
            return null;
        }
    }

}
