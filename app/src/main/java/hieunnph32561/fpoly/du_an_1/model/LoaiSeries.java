package hieunnph32561.fpoly.du_an_1.model;

public class LoaiSeries {
    private int maLoaiSeri;
    private String tenLoaiSeri;

    public LoaiSeries(int maLoaiSeri, String tenLoaiSeri) {
        this.maLoaiSeri = maLoaiSeri;
        this.tenLoaiSeri = tenLoaiSeri;
    }

    public int getMaLoaiSeri() {
        return maLoaiSeri;
    }

    public String getTenLoaiSeri() {
        return tenLoaiSeri;
    }
}

