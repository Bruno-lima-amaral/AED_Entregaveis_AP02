package TAD;

import java.util.ArrayList;

public class Lista {
    private ArrayList<Integer> arrayLista;

    public Lista() {
        this.arrayLista = new ArrayList<>();
    }

    public void inserir(int valor) {
        try {
            if (this.arrayLista.size() >= 5) {
                throw new Exception("A lista já contém 5 elementos. Não é possível inserir mais.");
            }

            this.arrayLista.add(valor);
            System.out.println("Valor " + valor + " inserido com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao inserir: " + e.getMessage());
        }
    }

    public void mostrar() {
        try {
            if (this.arrayLista.isEmpty()) {
                throw new Exception("A lista está vazia. Nada para mostrar.");
            }

            System.out.println("Elementos da lista: " + this.arrayLista);

        } catch (Exception e) {
            System.out.println("Erro ao mostrar: " + e.getMessage());
        }
    }
}
