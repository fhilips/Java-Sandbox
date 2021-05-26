package br.com.alura.forum.controller;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class AutenticacaoControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void deveriaDevolver400CasoDadosDeAutenticacaoEstejamIncorretos() throws Exception {
		URI uri = new URI("/auth");
		String json = "{\"email\":\"invaliso@email.com\",\"senha:123445\"}";
		
		mockMvc.perform(MockMvcRequestBuilders
					.post(uri)
					.content(json)
					.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers
					.status()
					.is(400));
	}

}
