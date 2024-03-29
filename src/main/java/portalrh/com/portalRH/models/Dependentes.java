package portalrh.com.portalRH.models;
import jakarta.persistence.Entity;
import portalrh.com.portalRH.enums.Escolaridade;
import java.time.LocalDate;

@Entity
public class Dependentes extends EntityId{

    private String nomeDependente;
    private LocalDate dataNascimento;
    private Escolaridade escolaridade;

    public Dependentes() {
    }

    public String getNomeDependente() {
        return nomeDependente;
    }

    public void setNomeDependente(String nomeDependente) {
        this.nomeDependente = nomeDependente;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    @Override
    public String toString() {
        return "Dependentes{" +
                "nomeDependente='" + nomeDependente + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", escolaridade=" + escolaridade +
                '}';
    }
}
