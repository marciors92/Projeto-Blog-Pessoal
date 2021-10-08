package org.generation.blogpessoal.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.generation.blogpessoal.model.Usuario;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start () {
		
		Usuario usuario = new Usuario(0, "João Silva", "joao@emial.com", "123456789");
		is(!usuarioRepository.findByUsuario(usuario.getUsuario())
				usuarioRepository.save(usuario);
		
		Usuario usuario = new Usuario(0, "Paulo Silva", "paulo@emial.com", "123456789");
		is(!usuariorepository.findByUsuario(usuario.getUsuario())
				usuarioRepository.save(usuario);
		
		Usuario usuario = new Usuario(0, "Luís Silva", "luis@emial.com", "123456789");
		is(!usuariorepository.findByUsuario(usuario.getUsuario())
				usuarioRepository.save(usuario);
		
		Usuario usuario = new Usuario(0, "Marco Oliveira", "joao@emial.com", "123456789");
		is(!usuariorepository.findByUsuario(usuario.getUsuario())
				usuarioRepository.save(usuario);
	}
	
	@Test
	@DisplayName("Retorna o nome")
	public void findByNomeRetornarNome() throws Exception {
		
		Usuario usuario = usuarioRepository.findByNome("João Silva");
		assertTrue(usuario.getNome().equals("João Silva"));
				
				
	}
	
	@Test
	@DisplayName("Retorna 3 usuários")
	public void findAllByNomeContainingIgnoreCaseRetornaTresUsuarios() {
		 List<Usuario> listaDeUsuarios = usuarioRepository.findAllNyNomeContainingIgnoreCase("Silva");
	}
	
	@AfterAll
	public void and() {
		usuarioRepository.deleteAll();
	}

}
