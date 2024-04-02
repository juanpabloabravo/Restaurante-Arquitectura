
import com.microservicio.recetas.models.Receta;
import com.microservicio.recetas.repositories.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecetaService {

    @Autowired
    private RecetaRepository recetaRepository;

    public List<Receta> getAllRecetas() {
        return recetaRepository.findAll();
    }

    public Receta getRecetaById(Long id) {
        Optional<Receta> optionalReceta = recetaRepository.findById(id);
        return optionalReceta.orElse(null);
    }

    public Receta createReceta(Receta receta) {
        return recetaRepository.save(receta);
    }

    public Receta updateReceta(Long id, Receta receta) {
        receta.setId(id);
        return recetaRepository.save(receta);
    }

    public void deleteReceta(Long id) {
        recetaRepository.deleteById(id);
    }
}
