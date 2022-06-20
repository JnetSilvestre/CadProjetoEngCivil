
package Entidades;

import java.util.Objects;

public class DetalhesProjeto {
    private Float comprimento;
    private Float largura;
    private Float inclinacao;
    private String tipoSolo;
    private Float areaTotal;
    private Endereco endereco;

    public DetalhesProjeto(){
        comprimento = 0.0f;
        largura = 0.0f;
        inclinacao = 0.0f;
        tipoSolo = "";
        areaTotal = 0.0f;
        endereco = new Endereco();
    }

    public DetalhesProjeto(Float comprimento, Float largura, Float inclinacao, String tipoSolo, Endereco endereco) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.inclinacao = inclinacao;
        this.tipoSolo = tipoSolo;
        this.areaTotal = largura*comprimento;
        this.endereco = endereco;
    }

    public Float getComprimento() {
        return comprimento;
    }

    public void setComprimento(Float comprimento) {
        this.comprimento = comprimento;
    }

    public Float getLargura() {
        return largura;
    }

    public void setLargura(Float largura) {
        this.largura = largura;
    }

    public Float getInclinacao() {
        return inclinacao;
    }

    public void setInclinacao(Float inclinacao) {
        this.inclinacao = inclinacao;
    }

    public String getTipoSolo() {
        return tipoSolo;
    }

    public void setTipoSolo(String tipoSolo) {
        this.tipoSolo = tipoSolo;
    }

    public Float getAreaTotal() {
        areaTotal = largura * comprimento;
        return areaTotal;
    }

    public void setAreaTotal(Float areaTotal) {
        this.areaTotal = areaTotal;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "DetalhesProjeto{" +
                "comprimento=" + comprimento +
                ", largura=" + largura +
                ", inclinacao=" + inclinacao +
                ", tipoSolo='" + tipoSolo + '\'' +
                ", areaTotal=" + areaTotal +
                ", endereco=" + endereco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetalhesProjeto that = (DetalhesProjeto) o;
        return Objects.equals(comprimento, that.comprimento) && Objects.equals(largura, that.largura) && Objects.equals(inclinacao, that.inclinacao) && Objects.equals(tipoSolo, that.tipoSolo) && Objects.equals(areaTotal, that.areaTotal) && Objects.equals(endereco, that.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comprimento, largura, inclinacao, tipoSolo, areaTotal, endereco);
    }
}
