package americanas.com.br.letscode;

public class IphoneType {
    private String sistemaOperacional;
    private String memoriaRam;
    private String memoriaRom;
    private String tela;
    private String chip;
    private String camera;

    public IphoneType(String sistemaOperacional, String memoriaRam, String memoriaRom, String tela, String chip, String camera) {
        this.sistemaOperacional = sistemaOperacional;
        this.memoriaRam = memoriaRam;
        this.memoriaRom = memoriaRom;
        this.tela = tela;
        this.chip = chip;
        this.camera = camera;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getMemoriaRom() {
        return memoriaRom;
    }

    public void setMemoriaRom(String memoriaRom) {
        this.memoriaRom = memoriaRom;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }
}
