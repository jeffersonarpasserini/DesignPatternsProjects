namespace CompositeSolucao;

public class GerenciadorArquivo
{
    private Component raiz;

    public GerenciadorArquivo(Component raiz)
    {
        this.raiz = raiz;
    }

    public void exibirTodos()
    {
        this.raiz.exibir();
    }
}