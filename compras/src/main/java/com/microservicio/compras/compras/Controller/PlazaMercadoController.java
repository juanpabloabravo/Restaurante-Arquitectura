
import com.microservice.juan.service.PlazaMercadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlazaMercadoController {

    @Autowired
    private PlazaMercadoService plazaMercadoService;

    @GetMapping("/comprar")
    public int comprarIngrediente(@RequestParam String ingrediente) {
        return plazaMercadoService.comprarIngrediente(ingrediente);
    }
}
