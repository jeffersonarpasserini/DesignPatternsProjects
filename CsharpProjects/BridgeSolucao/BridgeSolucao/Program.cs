using BridgeSolucao.Canal;
using BridgeSolucao.Mensagem;

CanalDeEnvio canalEmail = new Email();

Mensagem msgAdmin = new MensagemAdmin(canalEmail);
msgAdmin.setAssunto("Primeira Mensagem");
msgAdmin.setMensagem("Olá Usuário!");
msgAdmin.enviarMensagem();

Mensagem msgUsuario = new MensagemUsuario(canalEmail);
msgUsuario.setAssunto("Primeira Mensagem");
msgUsuario.setMensagem("Olá Usuário!");
msgUsuario.enviarMensagem();

CanalDeEnvio canalSms = new Sms();

Mensagem msgAdmin2 = new MensagemAdmin(canalSms);
msgAdmin.setAssunto("Primeira Mensagem");
msgAdmin.setMensagem("Olá Usuário!");
msgAdmin.enviarMensagem();

Mensagem msgUsuario2 = new MensagemUsuario(canalSms);
msgUsuario.setAssunto("Primeira Mensagem");
msgUsuario.setMensagem("Olá Usuário!");
msgUsuario.enviarMensagem();