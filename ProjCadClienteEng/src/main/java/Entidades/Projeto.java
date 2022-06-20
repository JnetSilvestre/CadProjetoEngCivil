
package Entidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Projeto {

    private String codigoId;
    private String nome;
    private Double gastoFuncionarios;
    
    private DetalhesProjeto detalhesProjeto;

    private List<Funcionario> funcionarios = new ArrayList<>();

    public Projeto(){
        codigoId = "";
        nome = "";
        gastoFuncionarios = 0.0;
    }

    public Projeto(String codigoId, String nome, Double gastoFuncionarios, DetalhesProjeto detalhesProjeto) {
        this.codigoId = codigoId;
        this.nome = nome;
        this.gastoFuncionarios = gastoFuncionarios;
        this.detalhesProjeto = detalhesProjeto;
    }

    public String getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(String codigoId) {
        this.codigoId = codigoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getGastoFuncionarios() {
        gastoFuncionarios = 0.0;
        if(Objects.nonNull(funcionarios.get(0))){
            for (Funcionario funcionario: funcionarios
                 ) {
                gastoFuncionarios+=funcionario.getSalario();
            }
        }

        return gastoFuncionarios;
    }

    public DetalhesProjeto getDetalhesProjeto() {
        return detalhesProjeto;
    }

    public void setDetalhesProjeto(DetalhesProjeto detalhesProjeto) {
        this.detalhesProjeto = detalhesProjeto;
    }

    public void addFuncionario(Funcionario func) {
        funcionarios.add(func);
    }

    public boolean removeFuncionario(Funcionario fc){
        boolean aux = funcionarios.remove(fc);
        return aux;
    }
    
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "codigoId=" + codigoId +
                ", nome='" + nome + '\'' +
                ", gastoFuncionarios=" + getGastoFuncionarios() +
                ", detalhesProjeto=" + detalhesProjeto +
                ", funcionarios=" + funcionarios +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projeto projeto = (Projeto) o;
        return codigoId.equals(projeto.codigoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoId);
    }
}
