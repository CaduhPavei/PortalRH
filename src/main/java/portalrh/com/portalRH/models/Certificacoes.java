package portalrh.com.portalRH.models;
import jakarta.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Certificacoes extends EntityId{

    private String nomeCertificacao;
    private LocalDate dataEmissao;
    private Double cargaHoraria;

    public Certificacoes() {
    }

    public String getNomeCertificacao() {
        return nomeCertificacao;
    }

    public void setNomeCertificacao(String nomeCertificação) {
        this.nomeCertificacao = nomeCertificação;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Certificacoes{" +
                "nomeCertificacao='" + nomeCertificacao + '\'' +
                ", dataEmissao=" + dataEmissao +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
