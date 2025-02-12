public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(3);

        System.out.println("El área del circulo es: " + circulo.calcularArea());
        circulo.imprimirInformacion();
    }
}
