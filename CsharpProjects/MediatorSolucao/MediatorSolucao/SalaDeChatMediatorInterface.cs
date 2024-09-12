namespace MediatorSolucao;

public interface SalaDeChatMediatorInterface
{
    /*Toda sala de chat precisa de um ChatBot Moderador (ChatBot será definida a seguir)
Para uma boa experiência do usuário vamos adicionar também um nome a sala de chat*/
        
    /*Recebe a mensagem e o Usuario que a enviou (Usuario será definida a seguir)
Depois a repassa a todos os demais usuários da sala de chat*/
    public void enviarMensagem(string mensagem, Usuario usuario);
        
    //Adiciona um usuário a sala se chat (ao Mediator)
    public void adicionarUsuario(Usuario usuario);
    
    //Remove um usuário da sala se chat (do Mediator)
    public void removerUsuario(Usuario usuario);

}