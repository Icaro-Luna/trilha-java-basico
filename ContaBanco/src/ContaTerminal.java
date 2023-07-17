import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de cliente");

        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número do usuário: ");
        Integer usuario = scanner.nextInt();

        System.out.println("Por fim, digite o saldo do usuário: ");
        Double saldo = scanner.nextDouble();

        Cliente cadastrado = new Cliente(nome, agencia, usuario, saldo);
        cadastrado.exibirInformacoes();
    }
}

class Cliente {
    private String nome;
    private String agencia;
    private Integer usuario;
    private Double saldo;

    public Cliente(String nome, String agencia, Integer usuario, Double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta: " + usuario + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
