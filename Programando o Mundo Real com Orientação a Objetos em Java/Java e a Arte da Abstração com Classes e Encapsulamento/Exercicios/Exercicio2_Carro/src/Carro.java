public class Carro {
    private boolean ligado;
    private int velocidadeAtual;
    private int marchaAtual;

    public Carro() {
        this.ligado = false;
        this.velocidadeAtual = 0;
        this.marchaAtual = 0;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        if (this.ligado && marchaAtual == 0 && velocidadeAtual == 0) {
            this.ligado = false;
        }
    }

    public void acelerar() {
        if (this.ligado && marchaAtual != 0 && velocidadeAtual < 120) {
            switch (marchaAtual) {
                case 1:
                    if (velocidadeAtual < 20) {
                        velocidadeAtual += 1;
                    }
                    break;
                case 2:
                    if (velocidadeAtual < 40) {
                            velocidadeAtual += 1;
                    }
                    break;
                case 3:
                    if (velocidadeAtual < 60) {
                        velocidadeAtual += 1;
                    }
                    break;
                case 4:
                    if (velocidadeAtual < 80) {
                        velocidadeAtual += 1;
                    }
                    break;
                case 5:
                    if (velocidadeAtual < 100) {
                        velocidadeAtual += 1;
                    }
                    break;
                case 6:
                    if (velocidadeAtual < 120) {
                        velocidadeAtual += 1;
                    }
                    break;
            }
        }
    }

    public void diminuirVelocidade(){
        if (this.ligado && velocidadeAtual > 0) {
            switch (marchaAtual){
                case 1:
                    if (velocidadeAtual > 0) {
                        velocidadeAtual -= 1;
                    }
                break;
                case 2:
                    if (velocidadeAtual > 21) {
                        velocidadeAtual -= 1;
                    }
                break;
                case 3:
                    if (velocidadeAtual > 41) {
                        velocidadeAtual -= 1;
                    }
                break;
                case 4:
                    if (velocidadeAtual > 61) {
                        velocidadeAtual -= 1;
                    }
                break;
                case 5:
                    if (velocidadeAtual > 81) {
                        velocidadeAtual -= 1;
                    }
                break;
                case 6:
                    if (velocidadeAtual > 101) {
                        velocidadeAtual -= 1;
                    }
                break;
            }
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (this.ligado
                && novaMarcha >= 0
                && novaMarcha <= 6
                && (novaMarcha == marchaAtual + 1 || novaMarcha == marchaAtual - 1)) {

            switch (novaMarcha) {
                case 0:
                    if (marchaAtual == 1 && velocidadeAtual == 0) {
                        this.marchaAtual = novaMarcha;
                    }
                    break;

                case 1:
                    if ((marchaAtual == 0 && velocidadeAtual == 0)
                            || (marchaAtual == 2 && velocidadeAtual == 21)) {
                        this.marchaAtual = novaMarcha;
                    }
                    break;

                case 2:
                    if ((marchaAtual == 1 && velocidadeAtual == 20)
                            || (marchaAtual == 3 && velocidadeAtual == 41)) {
                        this.marchaAtual = novaMarcha;
                    }
                    break;

                case 3:
                    if ((marchaAtual == 2 && velocidadeAtual == 40)
                            || (marchaAtual == 4 && velocidadeAtual == 61)) {
                        this.marchaAtual = novaMarcha;
                    }
                    break;

                case 4:
                    if ((marchaAtual == 3 && velocidadeAtual == 60)
                            || (marchaAtual == 5 && velocidadeAtual == 81)) {
                        this.marchaAtual = novaMarcha;
                    }
                    break;

                case 5:
                    if ((marchaAtual == 4 && velocidadeAtual == 80)
                            || (marchaAtual == 6 && velocidadeAtual == 101)) {
                        this.marchaAtual = novaMarcha;
                    }
                    break;

                case 6:
                    if (marchaAtual == 5 && velocidadeAtual == 100) {
                        this.marchaAtual = novaMarcha;
                    }
                    break;
            }
        }
    }

    public void virarEsquerda() {
        if (this.ligado && velocidadeAtual >= 1 && velocidadeAtual <= 40) {
            System.out.println("Virando à esquerda");
        }
    }

    public void virarDireita() {
        if (this.ligado && velocidadeAtual >= 1 && velocidadeAtual <= 40) {
            System.out.println("Virando à direita");
        }
    }

    public int verificarVelocidade(){
        return velocidadeAtual;
    }
}



