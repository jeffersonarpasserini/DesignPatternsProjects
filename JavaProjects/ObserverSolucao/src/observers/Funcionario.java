/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observers;

import java.util.Objects;
import subjects.Email;

/**
 *
 * @author jeffe
 */
public class Funcionario implements Observer {

    private String nome;
    private String email;

    public Funcionario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }
    
    @Override
    public void update(String mensagem) {
        Email.enviarEmail(this, mensagem);
    }
    @Override
    public String getNome() {
        return this.nome;
    }
    @Override
    public String getEmail() {
        return this.email;
    } 
}
