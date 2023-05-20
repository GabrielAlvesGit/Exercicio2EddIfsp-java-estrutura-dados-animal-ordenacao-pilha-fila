package br.edu.ifsp.spo.edd2.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Mamifero("Leão", 50.5));
        animais.add(new Mamifero("Gato", 30.2));
        animais.add(new Ave("Pardal", 2.3));
        animais.add(new Ave("Coruja", 1.7));
        animais.add(new Peixe("Salmão", 0.5));
        animais.add(new Peixe("Tubarão", 0.8));

        // Ordenação por peso (padrão)
        Collections.sort(animais);
        System.out.println("Ordenação por peso (padrão):");
        for (Animal animal : animais) {
            System.out.println(animal);
        }
        System.out.println();

        // Busca binária por peso
        Comparator<Animal> comparador = Comparator.comparingDouble(Animal::getPeso);
        Animal buscaBinaria = new Mamifero("", 30.2);
        int indiceBinaria = Collections.binarySearch(animais, buscaBinaria, comparador);
        if (indiceBinaria >= 0) {
            System.out.println("Resultado da busca binária por peso:");
            System.out.println(animais.get(indiceBinaria));
        } else {
            System.out.println("Animal não encontrado na busca binária por peso.");
        }
        System.out.println();

        // Busca sequencial por peso
        Animal buscaSequencial = new Mamifero("", 30.2);
        List<Animal> resultadosSequencial = buscaSequencial(animais, buscaSequencial);
        if (!resultadosSequencial.isEmpty()) {
            System.out.println("Resultado da busca sequencial por peso:");
            for (Animal animal : resultadosSequencial) {
                System.out.println(animal);
            }
        } else {
            System.out.println("Animal não encontrado na busca sequencial por peso.");
        }
        System.out.println();

        // Ordenação reversa por peso usando Comparator
        Comparator<Animal> comparadorReverso = comparador.reversed();
        Collections.sort(animais, comparadorReverso);
        System.out.println("Ordenação reversa por peso usando Comparator:");
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }

    private static List<Animal> buscaSequencial(List<Animal> animais, Animal busca) {
        List<Animal> resultados = new ArrayList<>();
        for (Animal animal : animais) {
            if (Double.compare(animal.getPeso(), busca.getPeso()) == 0) {
                resultados.add(animal);
            }
        }
        return resultados;
    }
}
