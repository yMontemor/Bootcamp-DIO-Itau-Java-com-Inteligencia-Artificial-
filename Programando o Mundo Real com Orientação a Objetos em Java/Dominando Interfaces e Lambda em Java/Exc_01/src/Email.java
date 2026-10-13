public class Email implements ServicoMensagem {
    @Override
    public void enviarMensagem(String message) {
        System.out.println("Enviando Mensagem via e-mail: " + message);
    }
}
