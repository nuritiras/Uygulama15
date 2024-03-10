package tr.com.nuritiras.uygulama15;

import java.io.Serializable;

public class Bilgiler implements Serializable {
    private String adiSoyadi;

    public Bilgiler(String adiSoyadi, String ePosta, String telefonNo) {
        this.adiSoyadi = adiSoyadi;
        this.ePosta = ePosta;
        this.telefonNo = telefonNo;
    }

    private String ePosta;

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public String getePosta() {
        return ePosta;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    private String telefonNo;
}
