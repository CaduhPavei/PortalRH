package portalrh.com.portalRH.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portalrh.com.portalRH.models.Cargo;
import portalrh.com.portalRH.repository.CargoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class CargoService {

    @Autowired
    private CargoRepository repository;

    public Cargo salvar (Cargo entity){
        return repository.save(entity);
    }

    public List<Cargo> buscaTodos(){
        return repository.findAll();
    }

    public Cargo buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Cargo alterar(Long id, Cargo alterado){
        Optional<Cargo> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Cargo cargo = encontrado.get();

            cargo.setDescricao(alterado.getDescricao());
            cargo.setComissionado(alterado.getComissionado());
            cargo.setNivel(alterado.getNivel());

            return repository.save(cargo);
        }
        return null;
    }
    public void remover(Long id) { repository.deleteById(id);}
}
