package portalrh.com.portalRH.resourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import portalrh.com.portalRH.models.ExpAnteriores;
import portalrh.com.portalRH.service.ExpAnterioresService;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/expAnteriores")
public class ExpAnterioresController {
    @Autowired
    private ExpAnterioresService service;

    @PostMapping
    public ResponseEntity create(@RequestBody ExpAnteriores entity) {
        ExpAnteriores save = service.salvar(entity);
        return ResponseEntity.created(URI.create("api/expAnteriores/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<ExpAnteriores> expAnteriores = service.buscaTodos();
        return ResponseEntity.ok(expAnteriores);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        ExpAnteriores expAnteriores = service.buscaPorId(id);
        return ResponseEntity.ok(expAnteriores);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody ExpAnteriores entity) {
        ExpAnteriores alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
