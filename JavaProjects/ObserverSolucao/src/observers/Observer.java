/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observers;

/**
 *
 * @author jeffe
 */
public interface Observer {
    
    public void update(String mensagem);

    public String getNome();

    public String getEmail();
    
}
