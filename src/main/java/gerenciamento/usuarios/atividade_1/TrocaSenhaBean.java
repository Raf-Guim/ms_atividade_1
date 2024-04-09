package gerenciamento.usuarios.atividade_1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class TrocaSenhaBean {

  private String username;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  private String senhaAtual;

  public String getSenhaAtual() {
    return senhaAtual;
  }

  public void setSenhaAtual(String senhaAtual) {
    this.senhaAtual = senhaAtual;
  }

  private String senhaNova;

  public String getSenhaNova() {
    return senhaNova;
  }

  public void setSenhaNova(String senhaNova) {
    this.senhaNova = senhaNova;
  }
}
