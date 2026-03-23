public class Main {
    public static void main(String[] args) {
        // 1. Criar a lista com uma capacidade específica
        MyArrayList lista = new MyArrayList(5);

        // 2. Testar operações de inserção (exemplo)
        lista.addFirst(10);
        lista.addLast(20);
        lista.insertAt(1, 15);

        // 3. Testar buscas e atualizações (exemplo)
        lista.set(0, 5);
        lista.find(20);

        // 4. Testar remoções 
        lista.removeFirst();
        lista.removeLast();

        // 5. Mostrar o estado final
        lista.display();

    }
}
