package portalrh.com.portalRH.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portalrh.com.portalRH.models.ExpAnteriores;
import portalrh.com.portalRH.models.Filiacao;
import portalrh.com.portalRH.repository.FiliacaoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FiliacaoService {

    @Autowired
    private FiliacaoRepository repository;

    public Filiacao salvar (Filiacao entity) { return repository.save(entity); }

    public List<Filiacao> buscaTodos() { return repository.findAll(); }

    public Filiacao buscaPorId(Long id) {return repository.findById(id).orElse(null); }

    public Filiacao alterar(Long id, Filiacao alterado){
        Optional<Filiacao> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Filiacao filiacao = encontrado.get();

            filiacao.setNomeMae(alterado.getNomeMae());
            filiacao.setNomePai(alterado.getNomePai());
            filiacao.setTelMae(alterado.getTelMae());
            filiacao.setTelPai(alterado.getTelPai());

            return repository.save(filiacao);
        }
        return null;
    }
    public void remover(Long id) { repository.deleteById(id);}
}
