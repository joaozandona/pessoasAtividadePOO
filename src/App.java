import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        PessoaDAO pessoaDAO = new PessoaDAO();

        while (true) {
            System.out.println("Escolha uma opcao: 1 - Adicionar pessoa 2 - Listar pessoas 3 - Buscar pessoa por ID 4 - Excluir pessoa 5 - Sair");
            System.out.println("-----------------------");

            Pessoa pessoa = new Pessoa();

            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da pessoa");
                    String nome = scan.next();
                    pessoaDAO.add(nome);
                    break;
                case 2:
                    System.out.println("Lista de pessoas");
                    pessoaDAO.getAll().forEach(p -> System.out.println("ID: " + p.getId() + " Nome: " + p.getNome()));
                    break;
                case 3:
                    System.out.println("Digite o ID da pessoa");
                    int id = scan.nextInt();
                    pessoa = pessoaDAO.getById(id);
                    System.out.println(" Nome: " + pessoa.getNome());
                    break;
                case 4:
                    System.out.println("Digite o ID da pessoa");
                    id = scan.nextInt();
                    pessoaDAO.delete(id);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}