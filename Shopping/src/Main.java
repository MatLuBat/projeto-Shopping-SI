import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int select = 0;
        Scanner scanner = new Scanner(System.in);
        String nome;
        int quantidadeFuncionarios;
        int salarioBaseFuncionario;
        int dia;
        int mes;
        int ano;
        String nomeDaRua;
        String cidade;
        String estado;
        String pais;
        String cep;
        String numero;
        String complemento;
        int preco;
        while (select != 3){
            System.out.println("(1) criar uma loja\n (2) criar um produto\n(3) sair\n");
            select = scanner.nextInt();
            if (select == 1){
                System.out.println("Digite o nome da loja:");
                nome = scanner.next();
                System.out.println("Digite a quantidade de funcionários:");
                quantidadeFuncionarios = scanner.nextInt();
                System.out.println("Digite o salário base dos funcionários:");
                salarioBaseFuncionario = scanner.nextInt();
                System.out.println("Digite o dia de inauguração da loja:");
                dia = scanner.nextInt();
                System.out.println("Digite o mês de inauguração da loja:");
                mes = scanner.nextInt();
                System.out.println("Digite o ano de inauguração da loja:");
                ano = scanner.nextInt();
                System.out.println("Agora vamos para o endereço.");
                System.out.println("Digite o nome da rua:");
                nomeDaRua = scanner.next();
                System.out.println("Digite o nome da cidade:");
                cidade = scanner.next();
                System.out.println("Digite o nome do estado:");
                estado = scanner.next();
                System.out.println("Digite o nome do país:");
                pais = scanner.next();
                System.out.println("Digite o CEP da loja:");
                cep = scanner.next();
                System.out.println("Digite o número:");
                numero = scanner.next();
                System.out.println("Digite o complemento:");
                complemento = scanner.next();
                System.out.println("Loja cadastrada com sucesso!");
                Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                Data data = new Data(dia, mes, ano);
                Loja loja01 = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
            } else if (select == 2) {
                System.out.println("Digite o nome do produto:");
                nome = scanner.next();
                System.out.println("Digite o valor do produto:");
                preco = scanner.nextInt();
                System.out.println("Digite o dia do vencimento do produto:");
                dia = scanner.nextInt();
                System.out.println("Digite mês de vencimento do produto:");
                mes = scanner.nextInt();
                System.out.println("Digite o ano de vencimento do produto:");
                ano = scanner.nextInt();
                Data data = new Data(dia, mes, ano);
                Produto produto = new Produto(nome, preco, data);

            } else if (select == 3) {
                System.out.println("Opção de sair escolhida.");

            }else {
                System.out.println("Insira uma opção válida!");

            }
        }
    }
}
