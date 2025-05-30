import java.io.*;
import java.util.*;

public class Persistencia {

    public static void salvar(List<Colaborador> lista) {
        try (PrintWriter writer = new PrintWriter("dados.txt")) {
            for (Colaborador c : lista) {
                writer.println(c.toString());
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    public static List<Colaborador> carregar() {
        List<Colaborador> lista = new ArrayList<>();
        File arquivo = new File("dados.txt");

        if (!arquivo.exists()) return lista;

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                lista.add(Colaborador.fromString(linha));
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }

        return lista;
    }
}

