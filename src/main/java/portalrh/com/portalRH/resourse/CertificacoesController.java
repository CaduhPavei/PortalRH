package portalrh.com.portalRH.resourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import portalrh.com.portalRH.models.Certificacoes;
import portalrh.com.portalRH.service.CertificacoesService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/certificacoes")
public class CertificacoesController {
    @Autowired
    private CertificacoesService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Certificacoes entity) {
        Certificacoes save = service.salvar(entity);
        return ResponseEntity.created(URI.create("api/certificacoes/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<Certificacoes> certificacoes = service.buscaTodos();
        return ResponseEntity.ok(certificacoes);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Certificacoes certificacoes = service.buscaPorId(id);
        return ResponseEntity.ok(certificacoes);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Certificacoes entity) {
        Certificacoes alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
