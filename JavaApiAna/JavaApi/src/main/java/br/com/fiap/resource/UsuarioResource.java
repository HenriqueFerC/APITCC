package br.com.fiap.resource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.exceptions.BadInfoException;
import br.com.fiap.exceptions.IdNotFoundException;
import br.com.fiap.model.UsuarioAdocao;
import br.com.fiap.service.UsuarioService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriBuilderException;
import jakarta.ws.rs.core.UriInfo;

@Path("/usuario")
public class UsuarioResource {
	
	private UsuarioService usuarioService;


	
	public UsuarioResource() throws ClassNotFoundException, SQLException {
		usuarioService = new UsuarioService();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(UsuarioAdocao usuario, @Context UriInfo uri) throws IllegalArgumentException, UriBuilderException, SQLException, BadInfoException {
		usuarioService.cadastrar(usuario);
		
		UriBuilder uriBuilder = uri.getAbsolutePathBuilder();
		
		uriBuilder.path(String.valueOf(usuario.getId()));
		
		return Response.created(uriBuilder.build()).build();
	}
}
