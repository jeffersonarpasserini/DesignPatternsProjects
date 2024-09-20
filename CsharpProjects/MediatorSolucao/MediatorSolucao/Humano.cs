namespace MediatorSolucao;

public class Humano : Usuario
{
    public Humano(string nome) : base(nome) { }

    public override void enviar(string mensagem)
    {
        // Verifica se o usuário ainda está associado a um mediador (sala de chat)
       if (this.mediator == null)
        {
            Console.WriteLine($"{this.getNome()} não está mais na sala de chat e " +
                              $"não pode enviar mensagens.");
            return;
        }
       
        // Imprime em tela o nome da sala de chat em que se encontra
        Console.WriteLine($"------------- {this.nome} -------------");
        // Imprime que enviou a mensagem e o texto da mensagem
        Console.WriteLine($"{this.getNome()} enviou: {mensagem}");
        // Solicita ao Mediator (Sala de chat) que envie a mensagem aos demais usuários.
        this.mediator.enviarMensagem(mensagem, this);
    }


    public override void receber(string mensagem)
    { 
        //Imprime em tela que recebeu uma mensagem na sala de chat.
        Console.WriteLine($"{this.getNome()} recebeu: {mensagem}");
    }
}