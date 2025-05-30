public class Colaborador {
    private String cpf;
    private String nome;
    private String email;
    private String cidade;
    private String empresa;
    private String emailGestor;

 public Colaborador(String cpf, String nome, String email, String cidade, String empresa, String emailGestor) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
        this.empresa = empresa;
        this.emailGestor = emailGestor;
}

    }

    @Override
    public String toString() {
        return cpf + ";" + nome + ";" + email + ";" + cidade + ";" + empresa + ";" + emailGestor;
    }

    public static Colaborador fromString(String linha) {
        String[] dados = linha.split(";");
        return new Colaborador(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5]);
    }
}
