package portalrh.com.portalRH.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portalrh.com.portalRH.models.Dependentes;
import portalrh.com.portalRH.repository.DependentesRepository;
import java.util.List;
import java.util.Optional;

@Service
public class DependentesService {

    @Autowired
    private DependentesRepository repository;

    public Dependentes salvar (Dependentes entity){
        return repository.save(entity);
    }

    public List<Dependentes> buscaTodos(){
        return repository.findAll();
    }

    public Dependentes buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Dependentes alterar(Long id, Dependentes alterado){
        Optional<Dependentes> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Dependentes dependente = encontrado.get();

            dependente.setNomeDependente(alterado.getNomeDependente());
            dependente.setEscolaridade(alterado.getEscolaridade());
            dependente.setDataNascimento(alterado.getDataNascimento());

            return repository.save(dependente);
        }
        return null;
    }
    public void remover(Long id) { repository.deleteById(id);}
}
