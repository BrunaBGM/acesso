package resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import bo.UsuarioBO;
import dto.UsuarioDTO;

@Path("/login")
public class UsuarioResource {

	UsuarioBO usuarioBO = new UsuarioBO();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response loginUsuario(UsuarioDTO usuario) {

		return Response.status(200).entity(usuarioBO.Autenticar(usuario.getLogin(), usuario.getSenha())).build();
	}

}