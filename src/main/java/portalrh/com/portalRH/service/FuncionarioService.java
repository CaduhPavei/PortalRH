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
            funcionario.setSalario(alterado.getSalario());
            funcionario.setTituliEleitor(alterado.getTituliEleitor());
            funcionario.setTituliEleitor(alterado.getTituliEleitor());
            funcionario.setDataNascimento(alterado.getDataNascimento());
            funcionario.setCarteiraReservista(alterado.getCarteiraReservista());
            funcionario.setPisPasep(alterado.getPisPasep());
            funcionario.setRegistroProfissional(alterado.getRegistroProfissional());
            funcionario.setSindicato(alterado.getSindicato());
            funcionario.setSetor(alterado.getSetor());
            funcionario.setCnh(alterado.getCnh());
            funcionario.setDataAdimissao(alterado.getDataAdimissao());
            funcionario.setCargo(alterado.getCargo());
            funcionario.setRacaCor(alterado.getRacaCor());
            funcionario.setReligiao(alterado.getReligiao());
            funcionario.setDoadorSangue(alterado.getDoadorSangue());
            funcionario.setCertificacoes(alterado.getCertificacoes());
            funcionario.setNacionalidade(alterado.getNacionalidade());
            funcionario.setRedeSocial(alterado.getRedeSocial());
            funcionario.setAreaAtuacao(alterado.getAreaAtuacao());
            funcionario.setMatricula(alterado.getMatricula());
            funcionario.setExpAnteriores(alterado.getExpAnteriores());
            funcionario.setIdiomas(alterado.getIdiomas());
            funcionario.setHoraExtra(alterado.getHoraExtra());
            funcionario.setEntrada(alterado.getEntrada());
            funcionario.setSaida(alterado.getSaida());
            funcionario.setEscolaridade(alterado.getEscolaridade());
            funcionario.setEstadoCivil(alterado.getEstadoCivil());
            funcionario.setGenero(alterado.getGenero());
            funcionario.setModalidadeContratual(alterado.getModalidadeContratual());
            funcionario.setStatus(alterado.getStatus());
            funcionario.setTipoConta(alterado.getTipoConta());
            funcionario.setTipoRH(alterado.getTipoRH());
            funcionario.setTurno(alterado.getTurno());
            return repository.save(funcionario);
        }
        return null;
    }
    public void remover(Long id) { repository.deleteById(id);}
}
