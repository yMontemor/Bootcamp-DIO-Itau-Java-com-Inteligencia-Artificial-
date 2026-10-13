public class Main {
    public static void main(String[] args) {
        String mensagem = "Aproveite nossa promoção de 50%!";

        ServicoMensagem sms = new SMS();
        ServicoMensagem email = new Email();
        ServicoMensagem redes = new RedesSociais();
        ServicoMensagem whatsapp = new WhatsApp();

        sms.enviarMensagem(mensagem);
        email.enviarMensagem(mensagem);
        redes.enviarMensagem(mensagem);
        whatsapp.enviarMensagem(mensagem);
    }
}
