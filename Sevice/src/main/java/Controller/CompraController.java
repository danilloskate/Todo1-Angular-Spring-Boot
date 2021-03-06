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

import Model.Compra;
import Service.CompraService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class CompraController {
	
	@Autowired
	private CompraService Compraservice;
	
	@PostMapping("save-compra")
	public boolean saveCompra(@RequestBody Compra compra) {
		 return Compraservice.saveCompra(compra);
		
	}
	
	@GetMapping("compras-list")
	public List<Compra> allCompras() {
		 return Compraservice.getCompras();
	}
	
	
	@DeleteMapping("delete-compra/{id}")
	public boolean deleteCompra(@PathVariable("id") int id,Compra compra) {
		compra.setId(id);
		return Compraservice.deleteCompra(compra);
	}

	@GetMapping("compra/{id}")
	public List<Compra> allCompraByID(@PathVariable("id") int id,Compra compra) {
		compra.setId(id);
		 return Compraservice.getCompraByID(compra);
		
	}
	
	@PostMapping("update-Compra/{id}")
	public boolean updateCompra(@RequestBody Compra compra,@PathVariable("id") int id) {
		compra.setId(id);
		return Compraservice.updateCompra(compra);
	}
}
