import java.util.ArrayList;

class GrafoDirigido {
    ArrayList<String> vertices = new ArrayList<>();
    ArrayList<Arco> arcos = new ArrayList<>();

    public void agregarVertice(String v) {
        if (!vertices.contains(v)) {
            vertices.add(v);
        }
    }

    public void agregarArco(String origen, String destino, int peso) {
        agregarVertice(origen);
        agregarVertice(destino);
        arcos.add(new Arco(origen, destino, peso));
    }

    public void mostrarGrados() {
        System.out.println("Los grados de entrada y salida de los vertices del grafo son: ");
        for (String v : vertices) {
            int entrada = 0;
            int salida = 0;

            for (Arco a : arcos) {
                if (a.getOrigen().equals(v)) salida++;
                if (a.getDestino().equals(v)) entrada++;
            }

            System.out.println("Vértice " + v + ": Entrada = " + entrada + ", Salida = " + salida);
        }
    }

    public void caminosSimples(String origen, String destino) {
        ArrayList<String> camino = new ArrayList<>();
        ArrayList<String> visitados = new ArrayList<>();
        buscarCaminos(origen, destino, camino, visitados);
    }

    private void buscarCaminos(String actual, String destino, ArrayList<String> camino, ArrayList<String> visitados) {
        camino.add(actual);
        visitados.add(actual);

        if (actual.equals(destino)) {
            System.out.println("Camino: " + camino);
        } else {
            for (Arco a : arcos) {
                if (a.getOrigen().equals(actual) && !visitados.contains(a.getDestino())) {
                    ArrayList<String> nuevoCamino = new ArrayList<>(camino);
                    ArrayList<String> nuevosVisitados = new ArrayList<>(visitados);
                    buscarCaminos(a.getDestino(), destino, nuevoCamino, nuevosVisitados);
                }
            }
        }
    }

    public void imprimirGrafo() {
        System.out.println("Los vertices del grafo son:");
        for (String a : vertices) {
            System.out.println("V = " + a);
        }
        System.out.println("Los arcos existentes son:");
        for (Arco a : arcos) {
            System.out.println("A = ("+ a.getOrigen() + "," + a.getDestino() + ") con peso = " + a.getPeso());
        }
    }
}
