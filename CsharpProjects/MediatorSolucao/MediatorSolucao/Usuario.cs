namespace MediatorSolucao;

public abstract class Usuario
{
    /*Um usuário precisa conhecer o mediador que permitirá
    que se comunique com outros usuários. É inicializado 
    como null*/
    protected SalaDeChatMediatorInterface mediator = null;

    //Nome do usuário
    protected string nome { get; set; }

    protected Usuario(string nome)
    {
        this.nome = nome;
    }

    protected void setMediator(SalaDeChatMediatorInterface mediator)
    {
        /*Um usuário pode estar em apenas um mediator (sala de chat) por vez
        então, se seu mediator for diferente de null*/
        if (!(this.mediator is null)) {
            /*O usuário pede para que o mediator o remova de sua lista de usuários
            (O usuário pede para ser removido da sala de chat que estava)*/
            this.mediator.removerUsuario(this);
        }
        //Define seu Mediator (sala de chat)
        this.mediator = mediator;
        //Pede para que o mediador o adicione a sua
        //lista de usuários (entrar na sala)
        this.mediator.adicionarUsuario(this);
    }
    
    //Retorna o nome do usuário.
    public string getNome()
    {
        return this.nome;
    }
    
    /*Método abstrato, será implementado por cada um dos usuários concretos
    conforme suas necessidades particulares.*/
    public abstract void enviar(string mensagem);
    
    /*Método abstrato, será implementado por cada um dos usuários concretos
    conforme suas necessidades particulares.*/
    public abstract void receber(string mensagem);
}