package com.park.demo_park_api.web.controller;

import com.park.demo_park_api.entity.Usuario;
import com.park.demo_park_api.service.UsuarioService;
import com.park.demo_park_api.web.dto.UsuarioCreateDTO;
import com.park.demo_park_api.web.dto.UsuarioResponseDTO;
import com.park.demo_park_api.web.dto.UsuarioSenhaDTO;
import com.park.demo_park_api.web.dto.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> create(@RequestBody UsuarioCreateDTO createDTO) {
        Usuario user = usuarioService.salvar(UsuarioMapper.toUsuario(createDTO));

        return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioMapper.toDto(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> getById(@PathVariable Long id) {
        Usuario user = usuarioService.buscarPorId(id);

        return ResponseEntity.ok(UsuarioMapper.toDto(user));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> updatePassword(@PathVariable Long id, @RequestBody UsuarioSenhaDTO dto) {
        Usuario user = usuarioService.editarSenha(id, dto.getSenhaAtual(), dto.getNovaSenha(), dto.getConfirmaSenha());
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> getAll() {
        List<Usuario> users = usuarioService.buscarUsuarios();
        return ResponseEntity.ok(UsuarioMapper.toListDto(users));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> deleteUserId(@PathVariable Long id) {
        Usuario user = usuarioService.deleteUserId(id);

        return ResponseEntity.ok(user);
    }
}
