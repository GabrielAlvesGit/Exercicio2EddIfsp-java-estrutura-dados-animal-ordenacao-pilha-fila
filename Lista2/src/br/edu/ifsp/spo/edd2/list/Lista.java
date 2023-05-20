package br.edu.ifsp.spo.edd2.list;

public class Lista {
    public static void main(String[] args) {
        // Implemente uma interface Pilha que provenha métodos de pilha a lista
        Pilha<String> pilha = new PilhaLista<>();
        pilha.push("Elemento 1");
        pilha.push("Elemento 2");
        pilha.push("Elemento 3");

        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Elemento no topo da pilha: " + pilha.peek());

        System.out.println("Desempilhando elementos:");
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }

        System.out.println("Tamanho da pilha após desempilhar: " + pilha.size());

        
        //Implemente uma interface Fila que provenha métodos de fila para a lista
        Fila<String> fila = new FilaLista<>();
        fila.enqueue("Elemento 1");
        fila.enqueue("Elemento 2");
        fila.enqueue("Elemento 3");

        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println("Elemento na frente da fila: " + fila.peek());

        System.out.println("Desenfileirando elementos:");
        while (!fila.isEmpty()) {
            System.out.println(fila.dequeue());
        }

        System.out.println("Tamanho da fila após desenfileirar: " + fila.size());
    }
}
