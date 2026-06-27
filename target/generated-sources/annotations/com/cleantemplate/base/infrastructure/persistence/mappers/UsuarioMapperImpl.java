package com.cleantemplate.base.infrastructure.persistence.mappers;

import com.cleantemplate.base.application.dto.AtualizarUsuarioDTO;
import com.cleantemplate.base.application.dto.CriarUsuarioDTO;
import com.cleantemplate.base.domain.entities.RoleEnum;
import com.cleantemplate.base.domain.entities.Usuario;
import com.cleantemplate.base.infrastructure.persistence.entities.UsuarioEntity;
import com.cleantemplate.base.presentation.response.UsuarioResponse;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-27T15:31:56-0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.46.100.v20260624-0231, environment: Java 21.0.11 (Eclipse Adoptium)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioEntity toEntity(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioEntity usuarioEntity = new UsuarioEntity();

        usuarioEntity.setId( usuario.getId() );
        usuarioEntity.setNome( usuario.getNome() );
        usuarioEntity.setSenha( usuario.getSenha() );
        usuarioEntity.setEmail( usuario.getEmail() );
        usuarioEntity.setRole( usuario.getRole() );
        usuarioEntity.setDataCriacao( usuario.getDataCriacao() );

        return usuarioEntity;
    }

    @Override
    public Usuario toDomain(UsuarioEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setId( entity.getId() );
        usuario.setNome( entity.getNome() );
        usuario.setSenha( entity.getSenha() );
        usuario.setEmail( entity.getEmail() );
        usuario.setRole( entity.getRole() );
        usuario.setDataCriacao( entity.getDataCriacao() );

        return usuario;
    }

    @Override
    public Usuario toDomain(CriarUsuarioDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setNome( dto.nome() );
        usuario.setSenha( dto.senha() );
        usuario.setEmail( dto.email() );

        return usuario;
    }

    @Override
    public void updateUsuarioFromDto(AtualizarUsuarioDTO dto, Usuario usuario) {
        if ( dto == null ) {
            return;
        }

        usuario.setNome( dto.nome() );
        usuario.setEmail( dto.email() );
    }

    @Override
    public UsuarioResponse toResponse(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        Long id = null;
        String nome = null;
        String email = null;
        RoleEnum role = null;
        LocalDateTime dataCriacao = null;

        id = usuario.getId();
        nome = usuario.getNome();
        email = usuario.getEmail();
        role = usuario.getRole();
        dataCriacao = usuario.getDataCriacao();

        UsuarioResponse usuarioResponse = new UsuarioResponse( id, nome, email, role, dataCriacao );

        return usuarioResponse;
    }
}
