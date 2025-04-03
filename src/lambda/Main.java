package lambda;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite nome-sexo,outronome-outrosexo");
        Scanner s = new Scanner(System.in);

        List<User> lista = new ArrayList<>();

        String resposta = s.next();
        String[] array = resposta.split(",");

        Arrays.stream(array).forEach(string -> {
            String[] pessoaSexo = string.split("-");
                User user = new User(pessoaSexo[0],pessoaSexo[1]);
                lista.add(user);
        });

        Stream<User> listaFeminina = lista.stream().filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("Feminino"));
        Stream<User> listaMasculina = lista.stream().filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("Masculino"));


        System.out.println("Lista Feminina: ");
        listaFeminina.forEach(pessoa -> System.out.println(pessoa.getNome()));
        System.out.println("Lista Masculina: ");
        listaMasculina.forEach(pessoa -> System.out.println(pessoa.getNome()));

    }
}
