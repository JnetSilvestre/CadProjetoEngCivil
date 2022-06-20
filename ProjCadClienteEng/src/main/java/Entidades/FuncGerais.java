
package Entidades;

import java.util.Objects;
public class FuncGerais implements Funcionario{

    private String nome;
    private String cpf;
    private Double horaTrabalhada;
    private final Double valorHora = 15.0;

    public FuncGerais(){
        nome = "";
        cpf = "";
        horaTrabalhada = 0.0;
    }

    public FuncGerais(String nome, String cpf, Double horaTrabalhada) {
        this.nome = nome;
        setCpf(cpf);
        this.horaTrabalhada = horaTrabalhada;
    }

    public Double getSalario(){
        return horaTrabalhada*valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        cpf = cpf.replace(" ", "");
        cpf = cpf.replace("-","");
        cpf = cpf.replace(".","");
        this.cpf = cpf;
    }

    public Double getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(Double horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    public Double getValorHora() {
        return valorHora;
    }

    @Override
    public String toString() {
        return "FuncGerais{" +
                "name='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", horaTrabalhada=" + horaTrabalhada +
                ", valorHora=" + valorHora +
                '}';
    }
//Compara os objetos funcGerais pelo cpf
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FuncGerais that = (FuncGerais) o;
        return cpf.equals(that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
