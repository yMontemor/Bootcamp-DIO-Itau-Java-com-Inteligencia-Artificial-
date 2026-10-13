public class WhatsApp implements ServicoMensagem {
    @Override
    public void enviarMensagem(String message) {
        System.out.println("Enviando Mensagem via Whatsapp: " + message);
    }
}
