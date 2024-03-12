public class ExemploThreads {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Ola ola1 = new Ola();
        Ola ola2 = new Ola();

        Tchau tchau1 = new Tchau();
        Tchau tchau2 = new Tchau();
        Tchau tchau3 = new Tchau();
        Tchau tchau4 = new Tchau();

        ola1.start();
        ola2.start();

        tchau1.start();
        tchau2.start();
        tchau3.start();
        tchau4.start();

    }
}


