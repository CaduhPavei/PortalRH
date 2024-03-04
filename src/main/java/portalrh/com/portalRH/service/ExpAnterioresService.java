package portalrh.com.portalRH.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portalrh.com.portalRH.models.ExpAnteriores;
import portalrh.com.portalRH.repository.ExpAnterioresRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ExpAnterioresService {

    @Autowired
    private ExpAnterioresRepository repository;

    public ExpAnteriores salvar (ExpAnteriores entity) { return repository.save(entity); }

    public List<ExpAnteriores> buscaTodos() { return repository.findAll(); }

    public ExpAnteriores buscaPorId(Long id) {return repository.findById(id).orElse(null); }

    public ExpAnteriores alterar(Long id, ExpAnteriores alterado){
        Optional<ExpAnteriores> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            ExpAnteriores expAnteriores = encontrado.get();

            expAnteriores.setDescrissaoExp(alterado.getDescrissaoExp());
            expAnteriores.setCargo(alterado.getCargo());
            expAnteriores.setPeriodoFinal(alterado.getPeriodoFinal());
            expAnteriores.setPeriodoInicial(alterado.getPeriodoInicial());

            return repository.save(expAnteriores);
        }
        return null;
    }
    public void remover(Long id) { repository.deleteById(id);}

}
