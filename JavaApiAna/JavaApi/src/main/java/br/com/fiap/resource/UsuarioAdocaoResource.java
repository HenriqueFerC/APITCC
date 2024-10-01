package br.com.fiap.resource;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.exceptions.BadInfoException;
import br.com.fiap.exceptions.IdNotFoundException;
import br.com.fiap.model.Usuario;
import br.com.fiap.model.UsuarioAdocao;
import br.com.fiap.service.UsuarioAdocaoService;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.core.Response.Status;

@Path("/usuarioadocao")
public class UsuarioAdocaoResource {
	
	private UsuarioAdocaoService usuarioService;
	
	public UsuarioAdocaoResource() throws ClassNotFoundException, SQLException {
		usuarioService = new UsuarioAdocaoService();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(UsuarioAdocao usuario, @Context UriInfo uri) throws SQLException {
		try {
			usuarioService.cadastrar(usuario);
			
			UriBuilder uriBuilder = uri.getAbsolutePathBuilder();
			
			uriBuilder.path(String.valueOf(usuario.getId()));
			
			return Response.created(uriBuilder.build()).build();
		} catch (BadInfoException e) {
			e.printStackTrace();
			return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}

}
