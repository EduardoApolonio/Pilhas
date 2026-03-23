public class PilhaDinamica implements PilhaOperacoes {
    protected No topo;
    protected int tamanho;

    public PilhaDinamica() {
        topo = null;
        tamanho = 0;
    }

    @Override
    public boolean push(String elemento) {
        No novo = new No(elemento);
        novo.prox = topo;
        topo = novo;
        tamanho++;
        return true;
    }

    @Override
    public String desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia");
            return null;
        }
        String valor = topo.valor;
        topo=topo.prox;
        tamanho--;
        return valor;
    }


    @Override
    public String topo() {
    if (estaVazia()) return null;
        return topo.valor;
    }

    @Override
    public boolean estaVazia() {
        return topo == null;
    }

    @Override
    public boolean estaCheia() {
        return false; //Não é pra encher
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public void limpar() {
        topo = null;
        tamanho = 0;
    }
}