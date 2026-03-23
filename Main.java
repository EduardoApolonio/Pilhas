public class Main {
    public static void main(String[] args) {

        System.out.println("Pilha simples");
        PilhaOperacoes pilha1 = new PilhaSimples(4);
        teste(pilha1);

        System.out.println("Pilha dinamica");
        PilhaOperacoes pilha2 = new PilhaDinamica();
        teste(pilha2);

    }
    public static void teste(PilhaOperacoes pilha){
        System.out.println("Empilhando");
        pilha.push("Eduardo");
        pilha.push("sla1");
        pilha.push("sla2");
        pilha.push("sla3");

        System.out.println("Topo " + pilha.topo());
        System.out.println("Tamanho" + pilha.tamanho());

        System.out.println("Desempilhando");
        System.out.println("Removido" + pilha.desempilhar());
        System.out.println("Removido" + pilha.desempilhar());

        System.out.println("Topo atual" + pilha.topo());
        System.out.println("Tamanho" + pilha.tamanho());

        System.out.println("Limpando pilha");
        pilha.limpar();
    }
}