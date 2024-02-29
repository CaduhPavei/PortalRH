package portalrh.com.portalRH.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portalrh.com.portalRH.models.Funcionario;
import portalrh.com.portalRH.repository.FuncionarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public Funcionario salvar (Funcionario entity){
        return repository.save(entity);
    }

    public List<Funcionario> buscaTodos(){
        return repository.findAll();
    }
    public Funcionario buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    public Funcionario alterar(Long id, Funcionario alterado){
        Optional<Funcionario> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Funcionario funcionario = encontrado.get();

            funcionario.setNome(alterado.getNome());
            funcionario.setCpf(alterado.getCpf());
            funcionario.setRg(alterado.getRg());
            funcionario.setEndereco(alterado.getEndereco());
            funcionario.setCtbs(alterado.getCtbs());
        }
    }
}
