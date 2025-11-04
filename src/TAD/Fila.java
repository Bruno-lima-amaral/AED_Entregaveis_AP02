package TAD;

import java.util.ArrayList;

public class Fila {
    private ArrayList<Integer> arrayFila;

    public Fila() {
        this.arrayFila = new ArrayList<>();
    }

    public void enfileirar(int valor) {
        try {
            if (this.arrayFila.size() >= 5) {
                throw new Exception("A fila já contém 5 elementos. Não é possível inserir mais.");
            }

            this.arrayFila.add(valor);
            System.out.println("Valor " + valor + " inserido com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao inserir: " + e.getMessage());
        }
    }

    public void desenfileirar() {
        try {
            if (this.arrayFila.isEmpty()) {
                throw new Exception("A lista está vazia. Nada para desenfileirar.");
            }
            System.out.println("O primeiro valor da pilha: " + this.arrayFila.getFirst() + " foi removido com sucesso.");
            this.arrayFila.removeFirst();


        } catch (Exception e) {
            System.out.println("Erro ao mostrar: " + e.getMessage());
        }
    }

    public void mostrar() {
        try {
            if (this.arrayFila.isEmpty()) {
                throw new Exception("A lista está vazia. Nada para mostrar.");
            }

            for (int i = 0; i < this.arrayFila.size(); i++) {
                System.out.println("Índice: " + i + ", Valor: " + this.arrayFila.get(i));
            }

        } catch (Exception e) {
            System.out.println("Erro ao mostrar: " + e.getMessage());
        }

    }
}
