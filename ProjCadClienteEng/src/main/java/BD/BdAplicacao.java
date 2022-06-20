
package BD;

import Entidades.Cliente;
import Entidades.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class BdAplicacao {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void AddCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public List<Cliente> getClientes(){
        return clientes;
    }

    public void addFuncionario(Funcionario func){
        funcionarios.add(func);
    }

    public List<Funcionario> getFuncionarios(){
        return funcionarios;
    }

}
