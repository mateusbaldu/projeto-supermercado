package Model;
import Enum.*;

public class Funcionario {
    private String cpf;
    private String nome;
    private Cargos cargo;
    private Permissoes permissao;

    public Funcionario(String cpf, String nome, Cargos cargo, Permissoes permissao) {
        setCpf(cpf);
        setNome(nome);
        setCargo(cargo);
        setPermissao(permissao);
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
        this.cpf = cpf;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }

    public Permissoes getPermissao() {
        return permissao;
    }

    public void setPermissao(Permissoes permissao) {
        this.permissao = permissao;
    }
}
