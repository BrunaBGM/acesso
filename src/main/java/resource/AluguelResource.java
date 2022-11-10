package resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import bo.AluguelBO;
import dto.AluguelDTO;

@Path("/aluguel")
public class AluguelResource {

	AluguelBO aluguelBO = new AluguelBO();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response AlugarVeiculo(AluguelDTO aluguelDTO ) {

		return Response.status(200).entity(aluguelBO.Salvar(aluguelDTO)).build();
	}
	

}