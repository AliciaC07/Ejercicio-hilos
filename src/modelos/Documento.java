package modelos;

public class Documento {
  private String tipo;
  private Integer i;
  private Integer pagina;

  public Documento(String tipo, Integer i, Integer pagina) {
    this.tipo = tipo;
    this.i = i;
    this.pagina = pagina;
  }

  public String getTipo() {
    return tipo;
  }

  public Documento setTipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

  public Integer getI() {
    return i;
  }

  public Documento setI(Integer i) {
    this.i = i;
    return this;
  }

  public Integer getPagina() {
    return pagina;
  }

  public Documento setPagina(Integer pagina) {
    this.pagina = pagina;
    return this;
  }

  @Override
  public String toString() {
    return "Documento{" +
      "tipo='" + tipo + '\'' +
      '}';
  }
}
