package portalrh.com.portalRH.models;

import java.time.LocalDate;

public class Certificacoes {

    private String nomeCertificação;
    private LocalDate dataEmissao;
    private Double cargaHoraria;

    public Certificacoes() {
    }

    public String getNomeCertificação() {
        return nomeCertificação;
    }

    public void setNomeCertificação(String nomeCertificação) {
        this.nomeCertificação = nomeCertificação;
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
                "nomeCertificação='" + nomeCertificação + '\'' +
                ", dataEmissao=" + dataEmissao +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
