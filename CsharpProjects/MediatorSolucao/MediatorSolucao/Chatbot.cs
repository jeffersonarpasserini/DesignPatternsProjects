namespace MediatorSolucao;

public class Chatbot : Usuario
{
    //Guarda referência ao último Usuario que enviou uma mensagem.
    private Usuario ultimoUsuario;
    
    /*Sobrescreve o construtor de Usuario por dois motivos:
        - O nome do ChatBot sempre será CHATBOT;
        - Inicializa o $ultimoUsuario como sendo ele mesmo
            no momento que o ChatBot é criado nenhuma mensagem 
            foi enviada na sala.*/
    public Chatbot(string nome) : base(nome)
    {
        this.ultimoUsuario = this;
    }

    //Envia uma mensagem da mesma forma que Humano,
    //apenas a formatação é diferente.
    public override void enviar(string mensagem)
    {
        // Verifica se o Chatbot ainda está associado a um mediador (sala de chat)
        if (this.mediator == null)
        {
            Console.WriteLine($"{this.getNome()} não está mais moderando uma sala de " +
                              $"chat e não pode enviar mensagens.");
            return;
        }
        
        //Imprime em tela o nome da sala de chat em que se encontra
        Console.WriteLine($"------------- {this.nome} -------------");
        //Imprime que enviou a mensagem e o texto da mensagem
        Console.WriteLine($"{this.getNome()} enviou: {mensagem}");
        //Solicita ao Mediator (Sala de chat) que envie a mensagem
        //aos demais usuários.
        this.mediator.enviarMensagem(mensagem, this);
    }

    //Recebe uma mensagem da mesma forma que Humano.
    public override void receber(string mensagem)
    {
        //Imprime em tela que recebeu uma mensagem na sala de chat.
        Console.WriteLine($"{this.getNome()} recebeu: {mensagem}");
    }
    
    //Verifica se o usuário que enviou a mensagem atual
    //é o mesmo que enviou a anterior.
    public Boolean validarMensagem(Usuario usuario)
    {
        //Se o usuário atual for igual ao anterior.
        if (this.ultimoUsuario.Equals(usuario)) {
            //Imprime que a mensagem foi negada e retorna false;
            this.enviar($"Uma mensagem de " +
                        $"{usuario.getNome()}  foi negada!");
            return false;
        }
        
        //Senão, atualiza o último Usuario que enviou
        //uma mensagem e retorna true
        this.ultimoUsuario = usuario;
        return true;
    }
}