package me.dio.models;

public class Endereco {
  private String rua;
  private String complemento;
  private String bairro;

  public Endereco(String rua, String complemento, String bairro) {
    this.rua = rua;
    this.complemento = complemento;
    this.bairro = bairro;
  }
  public Endereco() {
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }


  @Override
  public String toString() {
    return "Endereco{" +
        "rua='" + rua + '\'' +
        ", complemento='" + complemento + '\'' +
        ", bairro='" + bairro + '\'' +
        '}';
  }
}
