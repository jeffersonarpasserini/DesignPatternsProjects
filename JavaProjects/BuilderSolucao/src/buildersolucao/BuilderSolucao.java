/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buildersolucao;

import PDF.BuilderA3;
import PDF.BuilderA4;
import PDF.GeradorPDF;
import PDF.GeradorPDFDirector;

/**
 *
 * @author jeffe
 */
public class BuilderSolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
        BuilderA4 builderA4 = new BuilderA4();
        GeradorPDFDirector director = new GeradorPDFDirector(builderA4);
        director.criarGeradorPDF();
        GeradorPDF pdfA4 = builderA4.getGeradorPDF();
        System.out.println(pdfA4.toString());

        BuilderA3 builderA3 = new BuilderA3();
        GeradorPDFDirector director2 = new GeradorPDFDirector(builderA3);
        director2.criarGeradorPDFNotHeaderNotFooter();
        GeradorPDF pdfA3 = builderA3.getGeradorPDF();
        System.out.println(pdfA3.toString());
    }
    
}
