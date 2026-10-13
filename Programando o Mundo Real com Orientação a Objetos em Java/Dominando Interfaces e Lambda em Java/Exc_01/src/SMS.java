public class SMS implements ServicoMensagem {
    @Override
    public void enviarMensagem(String message) {
        System.out.println("Enviando Mensagem via SMS: " + message);
    }
}
