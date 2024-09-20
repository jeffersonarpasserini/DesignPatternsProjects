namespace MediatorSolucao;

public class SalaDeChatMediator : SalaDeChatMediatorInterface
{
    //Mantém uma lista de usuários que precisam receber
    //as mensagens da sala.
    private List<Usuario> usuarios;
    //Mantém a referência ao ChatBot Moderador
    private Chatbot chatBot;
    //Nome da sala de chat
    private string nome;

    public SalaDeChatMediator(Chatbot chatBot, string nome)
    {
        //Inicializa a lista de usuários como vazia.
        this.usuarios = new List<Usuario>();
        //Adiciona a referência ao ChatBot moderador.
        this.chatBot = chatBot;
        //Define o nome da sala de chat
        this.nome = nome; 
        //Informa ao ChatBot que ele deve moderar esta sala de chat.
        this.chatBot.setMediator(this);
    }
    
    public void enviarMensagem(string mensagem, Usuario usuario)
    { 
        /*Solicita ao ChatBot a validação da mensagem.
         Trata-se da verificação
        de duas mensagens consecutivas sendo enviada 
        por um mesmo Usuario.*/
        if (this.chatBot.validarMensagem(usuario)) {
            //Para cada usuário na sala de chat.
            foreach (var u in this.usuarios)
            {
                //A mensagem não deve ser recebida
                //pelo usuário que a enviou
                if (!u.Equals(usuario))
                {
                    //Faz os usuários da lista receberem
                    //a mensagem.
                    u.receber(mensagem); 
                }
            }
            //Indica o fim dos envios
            Console.WriteLine("--------------------------------------"); 
        }
    }

    public void adicionarUsuario(Usuario usuario)
    {
        this.usuarios.Add(usuario);
    }

    public void removerUsuario(Usuario usuario)
    {
        // Verifica se o usuário está presente na lista
        if (this.usuarios.Contains(usuario))
        {
            // Remove o usuário da lista
            this.usuarios.Remove(usuario);
            // Define o mediador do usuário como null, indicando
            // que ele foi removido da sala
            usuario.setMediator(null);
        
            Console.WriteLine($"{usuario.getNome()} foi removido " +
                              $"da sala de chat {this.getNome()}.");
        }
    }
    
    public string getNome()
    {
        return this.nome;
    }
}