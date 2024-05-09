/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PDF;

/**
 *
 * @author jeffe
 */
public interface BuilderInterfaceGeradorPDF {
    public GeradorPDF getGeradorPDF();
    public void setPageConfiguration();
    public void setMargin();
    public void setHeader();
    public void setFooter();
}
