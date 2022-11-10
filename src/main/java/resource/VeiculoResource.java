package resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import bo.VeiculoBO;


@Path("/veiculo")
public class VeiculoResource {

	VeiculoBO veiculoBO = new VeiculoBO();

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response ListarVeiculo() {

		return Response.status(200).entity(veiculoBO.ListarVeiculo()).build();
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response ObterVeiculo(int veiculoId) {

		return Response.status(200).entity(veiculoBO.ObterVeiculo(veiculoId)).build();
	}
	

}