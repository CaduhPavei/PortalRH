package portalrh.com.portalRH.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portalrh.com.portalRH.models.Certificacoes;
import portalrh.com.portalRH.repository.CertificacoesRepository;
import java.util.List;
import java.util.Optional;

@Service
public class CertificacoesService {

    @Autowired
    private CertificacoesRepository repository;

    public Certificacoes salvar (Certificacoes entity){
        return repository.save(entity);
    }

    public List<Certificacoes> buscaTodos(){
        return repository.findAll();
    }

    public Certificacoes buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Certificacoes alterar(Long id, Certificacoes alterado){
        Optional<Certificacoes> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Certificacoes certificacoes = encontrado.get();

            certificacoes.setCargaHoraria(alterado.getCargaHoraria());
            certificacoes.setDataEmissao(alterado.getDataEmissao());
            certificacoes.setNomeCertificacao(alterado.getNomeCertificacao());

            return repository.save(certificacoes);
        }
        return null;
    }
    public void remover(Long id) { repository.deleteById(id);}
}
