/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buildsolucaointermediaria;

import PDF.BuilderA3;
import PDF.BuilderA4;
import PDF.GeradorPDF;

/**
 *
 * @author jeffe
 */
public class BuildSolucaoIntermediaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuilderA4 builderA4 = new BuilderA4();
        GeradorPDF pdfA4 = builderA4.getGeradorPDF();
        System.out.println(pdfA4.toString());

        BuilderA3 builderA3 = new BuilderA3();
        GeradorPDF pdfA3 = builderA3.getGeradorPDF();
        System.out.println(pdfA3.toString());
    }
    
}
