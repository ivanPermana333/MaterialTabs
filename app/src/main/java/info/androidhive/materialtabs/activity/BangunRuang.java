package info.androidhive.materialtabs.activity;

public class BangunRuang {
    private String nama;
    private String Rumus;
    private String Volume;
    private String Keliling;


    public BangunRuang(String nama, String npm, String nohp) {
        this.nama = nama;
        this.Rumus = npm;
        this.Volume = nohp;
        this.Keliling = Keliling;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return Rumus;
    }

    public void setNpm(String npm) {
        this.Rumus = npm;
    }

    public String getNohp() {
        return Volume;
    }

    public void setNohp(String nohp) {
        this.Volume = nohp;
    }
    public String getKeliling() {
        return Keliling;
    }

    public void setKeliling(String nohp) {
        this.Keliling = nohp;
    }
}


