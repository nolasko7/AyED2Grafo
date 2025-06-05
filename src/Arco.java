class Arco {
    private String origen;
    private String destino;
    private int peso;

    public Arco(String origen, String destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigen() {
        return origen;
    }
}
