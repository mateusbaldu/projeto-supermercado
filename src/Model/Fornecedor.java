package Model;

public class Fornecedor {
    private String cpf;
    private String razao_social;
    private String endereco;
    private String contato;

    public Fornecedor(String cpf, String razao_social, String endereco, String contato) {
        setCpf(cpf);
        setRazao_social(razao_social);
        setEndereco(endereco);
        setContato(contato);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
