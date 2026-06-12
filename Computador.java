public class Computador {
    private String processador;
    private String memoriaRAM;
    private String armazenamento;
    private String placaVideo;
    private String sistemaOperacional;

    public Computador(String processador, String memoriaRAM, String armazenamento,
                       String placaVideo, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.placaVideo = placaVideo;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Processador: " + processador +
               "\nRAM: " + memoriaRAM +
               "\nArmazenamento: " + armazenamento +
               "\nPlaca de vídeo: " + (placaVideo != null ? placaVideo : "N/A") +
               "\nSistema operacional: " + (sistemaOperacional != null ? sistemaOperacional : "N/A");
    }
}