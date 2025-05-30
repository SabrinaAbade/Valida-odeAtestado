import java.util.*;
import java.io.*;

public class Main {
    private static List<Colaborador> colaboradores = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        colaboradores = Persistencia.carregar();
        boolean executando = true;

        while (executando) {
            exibirMenu();
            int opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> criarRegistro();
                case 2 -> listarRegistros();
                case 3 -> buscarRegistro();
                case 4 -> editarRegistro();
                case 5 -> excluirRegistro();
                case 6 -> {
                    executando = false;
                    System.out.println("Programa encerrado.");
                    Persistencia.salvar(colaboradores);
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Criar novo registro");
        System.out.println("2. Listar todos os registros");
        System.out.println("3. Buscar registro por CPF");
        System.out.println("4. Editar registro");
        System.out.println("5. Excluir registro");
        System.out.println("6. Sair");
    }

    private static void criarRegistro() {
        try {
            String cpf = lerTexto("CPF (11 dígitos): ");
            if (!cpf.matches("\\d{11}")) throw new ValidacaoException("CPF inválido!");

            String nome = lerTexto("Nome: ");
            if (nome.isBlank()) throw new ValidacaoException("Nome obrigatório.");

            String email = lerTexto("Email: ");
            if (!email.contains("@")) throw new ValidacaoException("Email inválido!");

            String cidade = lerTexto("Cidade: ");
            String empresa = lerTexto("Empresa: ");
            String emailGestor = lerTexto("Email do Gestor: ");

            colaboradores.add(new Colaborador(cpf, nome, email, cidade, empresa, emailGestor));
            System.out.println("Colaborador cadastrado com sucesso!");
        } catch (ValidacaoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void listarRegistros() {
        if (colaboradores.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado.");
        } else {
            System.out.println("Lista de Colaboradores");
            colaboradores.forEach(System.out::println);
        }
    }

    private static void buscarRegistro() {
        String cpf = lerTexto("Digite o CPF: ");
        boolean encontrado = false;

        for (Colaborador c : colaboradores) {
            if (c.getCpf().equals(cpf)) {
                System.out.println(c);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Colaborador não encontrado.");
        }
    }

    private static void editarRegistro() {
        String cpf = lerTexto("Digite o CPF do colaborador a editar: ");

        for (Colaborador c : colaboradores) {
            if (c.getCpf().equals(cpf)) {
                String novoNome = lerTexto("Novo nome: ");
                c.setNome(novoNome);
                System.out.println("Nome atualizado com sucesso!");
                return;
            }
        }

        System.out.println("Colaborador não encontrado.");
    }

    private static void excluirRegistro() {
        String cpf = lerTexto("Digite o CPF do colaborador a excluir: ");
        boolean removido = colaboradores.removeIf(c -> c.getCpf().equals(cpf));
        if (removido) {
            System.out.println("Colaborador removido.");
        } else {
            System.out.println("CPF não encontrado.");
        }
    }

}