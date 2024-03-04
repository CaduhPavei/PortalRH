package portalrh.com.portalRH.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portalrh.com.portalRH.models.DadosBancarios;
import portalrh.com.portalRH.repository.DadosBancariosRepository;
import java.util.List;
import java.util.Optional;

@Service
public class DadosBancariosService {

    @Autowired
    private DadosBancariosRepository repository;

    public DadosBancarios salvar (DadosBancarios entity){
        return repository.save(entity);
    }

    public List<DadosBancarios> buscaTodos(){
        return repository.findAll();
    }

    public DadosBancarios buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public DadosBancarios alterar(Long id, DadosBancarios alterado){
        Optional<DadosBancarios> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            DadosBancarios dadosBancarios = encontrado.get();

            dadosBancarios.setAgencia(alterado.getAgencia());
            dadosBancarios.setBanco(alterado.getBanco());
            dadosBancarios.setConta(alterado.getConta());
            dadosBancarios.setTipoconta(alterado.getTipoconta());

            return repository.save(dadosBancarios);
        }
        return null;
    }
    public void remover(Long id) { repository.deleteById(id);}
}
