//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Incluir lombok
        Cliente cliente = new Cliente();
        cliente.setNome("Manuel");
        Conta conta = new ContaCorrente(cliente);
        conta.imprimirExtrato();
    }
}