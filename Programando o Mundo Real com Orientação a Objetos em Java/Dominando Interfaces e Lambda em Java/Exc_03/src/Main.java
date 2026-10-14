public class Main {
    public static void main(String[] args){

        FiguraGeometrica quadrado = new Quadrado(5);
        FiguraGeometrica retangulo = new Retangulo(10, 4);
        FiguraGeometrica circulo = new Circulo(3);

        System.out.println("A área do Quadrado é: " + quadrado.calcularArea());
        System.out.println("A área do Retângulo é: " + retangulo.calcularArea());
        System.out.printf("A área do Circulo é: %.2f%n ", circulo.calcularArea());
    }
}
