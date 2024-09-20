using System;

namespace MediatorSolucao
{
    class Program
    {
        static void Main(string[] args)
        {
            // Criação do Chatbot moderador
            Chatbot moderador = new Chatbot("CHATBOT");

            // Criação da Sala de Chat e adição do Chatbot como moderador
            SalaDeChatMediator salaDeChat = new SalaDeChatMediator(moderador, "Sala 1");

            // Criação de usuários
            Usuario usuario1 = new Humano("Alice");
            Usuario usuario2 = new Humano("Bob");
            Usuario usuario3 = new Humano("Charlie");

            // Adiciona usuários à sala de chat
            Console.WriteLine("Adicionando usuários à sala de chat...");
            usuario1.setMediator(salaDeChat);
            usuario2.setMediator(salaDeChat);
            usuario3.setMediator(salaDeChat);

            // Enviar mensagem
            Console.WriteLine("\nAlice envia uma mensagem:");
            usuario1.enviar("Oi pessoal!");

            // Bob envia uma mensagem consecutiva
            Console.WriteLine("\nBob envia duas mensagens consecutivas:");
            usuario2.enviar("Olá Alice!");
            usuario2.enviar("Como você está?");

            // Charlie envia uma mensagem
            Console.WriteLine("\nCharlie envia uma mensagem:");
            usuario3.enviar("Oi a todos!");

            // Remover um usuário da sala de chat
            Console.WriteLine("\nRemovendo Bob da sala de chat...");
            salaDeChat.removerUsuario(usuario2);

            // Tentativa de Bob enviar uma mensagem após ser removido
            Console.WriteLine("\nBob tenta enviar uma mensagem após ser removido:");
            usuario2.enviar("Ainda estou aqui?");

            // Alice envia uma mensagem após Bob ser removido
            Console.WriteLine("\nAlice envia uma mensagem após Bob ser removido:");
            usuario1.enviar("Parece que Bob saiu.");

            Console.WriteLine("\nFim do teste.");
        }
    }
}