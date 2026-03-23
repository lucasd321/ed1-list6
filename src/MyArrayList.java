public class MyArrayList {
    private int[] item;
    private int count;

    public MyArrayList(int s) {
        this.item = new int[s];
        this.count = 0;
    }

    // --- Inserção ---
    public void addLast(int newItem)
    {

    }
    public void addFirst(int newInt)
    {

    }
    public void insertAt(int i, int newInt)
    {

    }

    // --- Remoção ---
    public void removeLast()
    {

    }
    public void removeFirst()
    {

    }
    public void remove(int item)
    {

    }
    public void removeAt(int i)
    {

    }

    // --- Busca e Acesso ---
    public int find(int item) {
        return -1; // Retorno padrão para "não encontrado"
    }

    public int get(int i) {
        return 0;
    }

    public void set(int i, int newInt) { // Adicionado o parâmetro newInt
    }

    // método display()
    public void display() {
        System.out.println("Conteúdo da lista (Simulação)");
    }
}
