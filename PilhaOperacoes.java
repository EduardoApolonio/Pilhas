public interface PilhaOperacoes {

    boolean push(String elemento);

    String desempilhar();

    String topo();

    boolean estaVazia();

    boolean estaCheia();

    int tamanho();

    void limpar();


}