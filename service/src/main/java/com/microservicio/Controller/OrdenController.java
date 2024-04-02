import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrdenController {

    @Autowired
    private OrdenService ordenService;

    @PostMapping("/orden")
    public void crearOrden(@RequestBody Orden orden) {
        ordenService.crearOrden(orden);
    }

    @GetMapping("/ordenes")
    public List<Orden> obtenerTodasLasOrdenes() {
        return ordenService.obtenerTodasLasOrdenes();
    }

    @GetMapping("/orden/{id}")
    public Orden obtenerOrdenPorId(@PathVariable Long id) {
        return ordenService.obtenerOrdenPorId(id);
    }

    @PutMapping("/orden/{id}/estado")
    public void actualizarEstadoOrden(@PathVariable Long id, @RequestParam String estado) {
        ordenService.actualizarEstadoOrden(id, estado);
    }

}

