public class Main {
    public static void main(String[] args) {
        GrafoDirigido grafo = new GrafoDirigido();
        grafo.agregarVertice("Alicante");
        grafo.agregarVertice("Barcelona");
        grafo.agregarVertice("Cartagena");
        grafo.agregarVertice("Murcia");
        grafo.agregarVertice("Reus");
        grafo.agregarArco("Alicante","Barcelona", 4);
        grafo.agregarArco("Alicante","Cartagena", 5);
        grafo.agregarArco("Barcelona","Cartagena", 3);
        grafo.agregarArco("Barcelona","Murcia", 6);
        grafo.agregarArco("Barcelona","Reus", 3);
        grafo.agregarArco("Cartagena","Alicante", 3);
        grafo.agregarArco("Murcia","Alicante", 5);
        grafo.agregarArco("Murcia","Barcelona", 2);
        grafo.agregarArco("Reus","Barcelona", 1);

        // Ejercicio 1
        grafo.imprimirGrafo();
        // Ejercicio 2
        grafo.mostrarGrados();
        // Ejercicio 3
        grafo.caminosSimples("Alicante", "Murcia");
    }
}