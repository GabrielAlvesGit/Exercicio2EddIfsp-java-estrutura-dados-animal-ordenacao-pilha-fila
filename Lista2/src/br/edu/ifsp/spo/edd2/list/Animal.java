package br.edu.ifsp.spo.edd2.list;

abstract class Animal implements Comparable<Animal> {
    protected String nome;
    protected double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public int compareTo(Animal outroAnimal) {
        return Double.compare(this.peso, outroAnimal.peso);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + nome + ", Peso: " + peso;
    }
}