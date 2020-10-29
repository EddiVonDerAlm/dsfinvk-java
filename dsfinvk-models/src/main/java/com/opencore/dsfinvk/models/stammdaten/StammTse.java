package com.opencore.dsfinvk.models.stammdaten;

import javax.validation.constraints.NotNull;

import com.opencore.dsfinvk.models.BaseModel;
import com.opencore.gdpdu.index.annotations.Column;
import com.opencore.gdpdu.index.models.DataType;

// TODO: Fertig stellen, hier gibt es Probleme wg. der Enums und vor allem der "dynamischen" TSE_ZERTIFIKAT* Spalten
public class StammTse extends BaseModel {

  public static final String FILENAME = "tse.csv";

  @NotNull
  @Column(value = "TSE_ID", type = DataType.Numeric)
  private Long tseId;

  @NotNull
  @Column(value = "TSE_SERIAL", type = DataType.AlphaNumeric)
  private String tseSerial;

  @NotNull
  @Column(value = "TSE_SIG_ALGO", type = DataType.AlphaNumeric)
  private TseSigAlgo tseSigAlgo;

  @NotNull
  @Column(value = "TSE_ZEITFORMAT", type = DataType.AlphaNumeric)
  private String tseZeitformat;

  @NotNull
  @Column(value = "TSE_PD_ENCODING", type = DataType.AlphaNumeric)
  private TsePdEncoding tsePdEncoding;

  @NotNull
  @Column(value = "TSE_PUBLIC_KEY", type = DataType.AlphaNumeric)
  private String tsePublicKey;

  @NotNull
  @Column(value = "TSE_ZERTIFIKAT_I", type = DataType.AlphaNumeric)
  private String tseZertifikatI;

  @NotNull
  @Column(value = "TSE_ZERTIFIKAT_II", type = DataType.AlphaNumeric)
  private String tseZertifikatII;

public Long getTseId() {
    return tseId;
}

public void setTseId(Long tseId) {
    this.tseId = tseId;
}

public String getTseSerial() {
    return tseSerial;
}

public void setTseSerial(String tseSerial) {
    this.tseSerial = tseSerial;
}

public TseSigAlgo getTseSigAlgo() {
    return tseSigAlgo;
}

public void setTseSigAlgo(TseSigAlgo tseSigAlgo) {
    this.tseSigAlgo = tseSigAlgo;
}

public String getTseZeitformat() {
    return tseZeitformat;
}

public void setTseZeitformat(String tseZeitformat) {
    this.tseZeitformat = tseZeitformat;
}

public TsePdEncoding getTsePdEncoding() {
    return tsePdEncoding;
}

public void setTsePdEncoding(TsePdEncoding tsePdEncoding) {
    this.tsePdEncoding = tsePdEncoding;
}

public String getTsePublicKey() {
    return tsePublicKey;
}

public void setTsePublicKey(String tsePublicKey) {
    this.tsePublicKey = tsePublicKey;
}

public String getTseZertifikatI() {
    return tseZertifikatI;
}

public void setTseZertifikatI(String tseZertifikatI) {
    this.tseZertifikatI = tseZertifikatI;
}

public String getTseZertifikatII() {
    return tseZertifikatII;
}

public void setTseZertifikatII(String tseZertifikatII) {
    this.tseZertifikatII = tseZertifikatII;
}

}
