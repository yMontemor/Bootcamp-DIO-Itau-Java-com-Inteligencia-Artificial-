public class RedesSociais implements ServicoMensagem {
    @Override
    public void enviarMensagem(String message) {
        System.out.println("Enviando Mensagem via Redes Sociais: " + message);
    }
}
