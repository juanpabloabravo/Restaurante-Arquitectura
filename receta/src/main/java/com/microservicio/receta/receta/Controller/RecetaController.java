

import com.microservicio.recetas.models.Receta;
import com.microservicio.recetas.services.RecetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recetas")
public class RecetaController {

    @Autowired
    private RecetaService recetaService;

    @GetMapping
    public List<Receta> getAllRecetas() {
        return recetaService.getAllRecetas();
    }

    @GetMapping("/{id}")
    public Receta getRecetaById(@PathVariable Long id) {
        return recetaService.getRecetaById(id);
    }

    @PostMapping
    public Receta createReceta(@RequestBody Receta receta) {
        return recetaService.createReceta(receta);
    }

    @PutMapping("/{id}")
    public Receta updateReceta(@PathVariable Long id, @RequestBody Receta receta) {
        return recetaService.updateReceta(id, receta);
    }

    @DeleteMapping("/{id}")
    public void deleteReceta(@PathVariable Long id) {
        recetaService.deleteReceta(id);
    }
}
