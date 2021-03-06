package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.TipoProductoService;

import Model.TipoProducto;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class TipoProductoController {
	
	@Autowired
	private TipoProductoService TipoProductoservice;
	
	@PostMapping("save-tipoproducto")
	public boolean saveTipoProducto(@RequestBody TipoProducto tipoProducto) {
		 return TipoProductoservice.saveTipoProducto(tipoProducto);
		
	}
	
	@GetMapping("tipoProductos-list")
	public List<TipoProducto> allTipoProductos() {
		 return TipoProductoservice.getTipoProductos();
	}
	
	
	@DeleteMapping("delete-tipoProducto/{id}")
	public boolean deleteTipoProducto(@PathVariable("id") int id,TipoProducto tipoProducto) {
		tipoProducto.setId(id);
		return TipoProductoservice.deleteTipoProducto(tipoProducto);
	}

	@GetMapping("tipoProducto/{id}")
	public List<TipoProducto> allTipoProductoByID(@PathVariable("id") int id,TipoProducto tipoProducto) {
		tipoProducto.setId(id);
		 return TipoProductoservice.getTipoProductoByID(tipoProducto);
		
	}
	
	@PostMapping("update-tipoProducto/{id}")
	public boolean updateTipoProducto(@RequestBody TipoProducto TipoProducto,@PathVariable("id") int id) {
		TipoProducto.setId(id);
		return TipoProductoservice.updateTipoProducto(TipoProducto);
	}
}
