import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas; // listar todos os clientes

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
