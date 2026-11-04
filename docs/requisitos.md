# Requisitos e Caso de Uso

> Transcrição dos documentos entregues na disciplina **Análise de Projeto Orientado a Objetos (AS33E)**, UTFPR, 1º semestre de 2022.
> Professor: Alessandro Silveira Duarte.
> Autores: João Victor da Cruz Silvestre (líder), Jean Alves Rocha e Matheus Muniz Ferreira.

## Objetivos

**Objetivo geral:** software para gerir e efetuar cadastros de projetos de engenharia civil.

**Objetivos específicos:** cadastro de funcionários e cadastro de clientes.

## Requisitos funcionais

| ID | Requisito |
|----|-----------|
| RF-1 | O sistema deve apresentar uma janela específica para a inserção de dados cadastrais dos projetos. |
| RF-2 | O sistema deve cadastrar os dados inseridos quando for solicitado pelo usuário. |
| RF-3 | O sistema deve conter uma opção de consulta dos dados que foram cadastrados. |
| RF-4 | O sistema deve apresentar uma opção de pesquisa de CPF do cliente ou de código do projeto para se realizar a consulta. |
| RF-5 | O sistema deve buscar e apresentar os dados cadastrados referentes ao CPF do cliente. |
| RF-6 | O sistema deve apresentar as opções para alterar ou deletar os dados cadastrados. |
| RF-7 | Caso a opção escolhida seja "Alterar", o sistema deve apresentar uma janela específica para alterar os dados cadastrados do projeto selecionado na consulta. |
| RF-8 | Caso a opção escolhida seja "Deletar", o sistema deve apresentar uma mensagem informando se foi deletado ou não. |

## Descrição do caso de uso

| Campo | Descrição |
|-------|-----------|
| **Nome** | Sistema de gerenciamento para empresa de construção |
| **Tipo** | Caso de uso geral |
| **Ator principal** | Gerente/Engenheiro |
| **Resumo** | Descreve as etapas percorridas pelos funcionários em um sistema de gerenciamento para uma empresa de construção. |
| **Pré-condição** | É necessário existir um cadastro na empresa. |
| **Pós-condição** | Fechar contrato. |

### Fluxo principal

| Ações do ator | Ações do sistema |
|---------------|------------------|
| 1. Inserir dados do projeto na janela de cadastro de projetos | 2. Cadastrar projeto |
| 3. Informar o CPF do cliente ou o código do projeto para consultar | 4. Consultar projeto |
| 5. Escolher a opção "Alterar" ou "Deletar" | |
| 6. Inserir alterações | 7. Alterar projeto |
| 8. Confirmar CPF do cliente e código do projeto para deletar | 9. Deletar projeto |

### Restrições e validações

**Cadastrar projeto**
1. Para solicitar um projeto é preciso ser maior de idade.
2. É necessário o código do projeto.
3. É necessário o CPF do cliente.

**Alterar projeto**
1. O código do projeto não pode ser alterado.

**Deletar projeto**
1. Informar caso o código do projeto não seja válido.
