public class PilhaSimples implements PilhaOperacoes{
    protected String[] pilha;
    protected int topo;

    public PilhaSimples(int capacidade){
        pilha = new String[capacidade];
        topo = -1;
    }

    @Override
    public boolean push(String elemento) {
        if (estaCheia()){
            System.out.println("Pilha cheia");
            return false;
        }
        pilha[++topo] = elemento;
        return true;
    }

    @Override
    public String desempilhar() {
        if (estaVazia()){
            System.out.println("Pilha vazia");
            return null;
        }
        return pilha[topo--];
    }

    @Override
    public String topo() {
        if (estaVazia())
            return null;
        return pilha[topo];
    }

    @Override
    public boolean estaVazia() {
        return topo == -1;
    }

    @Override
    public boolean estaCheia() {
        return topo == pilha.length -1;
    }

    @Override
    public int tamanho() {
        return topo +1;
    }

    @Override
    public void limpar() {
        topo = -1;

    }
}