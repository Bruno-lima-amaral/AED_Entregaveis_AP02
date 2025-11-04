package TAD;

import java.util.ArrayList;

public class Pilha {
    private ArrayList<Integer> arrayPilha;

    public Pilha() {
        this.arrayPilha = new ArrayList<>();
    }

    public void empilhar(int valor) {
        try {
            this.arrayPilha.add(valor);
            System.out.println("Valor " + valor + " empilhado com sucesso.");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void desempilhar() {
        try {
            if (this.arrayPilha.isEmpty()) {
                throw new Exception("A pilha está vazia. é necessário adicionar um valor, antes de remover.");
            }
            System.out.println("O último valor da pilha: " + this.arrayPilha.getLast() + " foi removido com sucesso.");
            this.arrayPilha.removeLast();


        } catch (Exception e) {
            System.out.println("Erro ao mostrar: " + e.getMessage());
        }
    }

    public void mostrar() {
        try {
            if (this.arrayPilha.isEmpty()) {
                throw new Exception("A pilha está vazia. Nada para mostrar.");
            }
            System.out.println("Elementos da pilha: " + this.arrayPilha);

        } catch (Exception e) {
            System.out.println("Erro ao mostrar: " + e.getMessage());
        }
    }
}
