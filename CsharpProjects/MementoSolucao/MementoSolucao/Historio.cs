namespace MementoSolucao;

public class Historico
{
    public List<MementoInterface> historico { get; set; } = new List<MementoInterface>(); 
    private OriginadorInterface ultimoOriginador;
    
    public void criarCheckPoint(OriginadorInterface originador)
    {
        this.ultimoOriginador = originador; // Armazena o último Originador
        this.historico.Add(originador.salvar()); //salva o estado do memento
    }

    public void desfazer()
    {
        if (this.historico.Count <= 0)
        {
            return;
        }

        // Restaura o último estado salvo
        var memento = this.historico[this.historico.Count - 1];
        memento.restaurar();

        // Remove o último memento após desfazer
        this.historico.RemoveAt(this.historico.Count - 1);
    }

    public void imprimir()
    {
        if (ultimoOriginador != null)
        {
            ultimoOriginador.imprimir(); // Imprime o estado atual do Originador salvo
        }
        else
        {
            Console.WriteLine("Nenhum estado salvo para imprimir.");
        }
    }
}