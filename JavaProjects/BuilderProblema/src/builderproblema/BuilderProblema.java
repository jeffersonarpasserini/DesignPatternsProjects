/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builderproblema;

import PDF.GeradorPDF;
import PDF.GeradorPDFAlternativo;

/**
 *
 * @author jeffe
 */
public class BuilderProblema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Problema

        GeradorPDF newPDFA4 = new GeradorPDF("portrait", "mm", 210, 297, 30, 20, 30, 20, true, 15, true, 15, "#ffffff", "UTF-8");

        System.out.println(newPDFA4.toString());

        GeradorPDF newPDFA3 = new GeradorPDF("portrait", "mm", 297, 420, 30, 20, 30, 20, true, 15, true, 15, "#ffffff", "UTF-8");

        System.out.println(newPDFA3.toString());

        //Solução alternativa - removendo o construtor.
        GeradorPDFAlternativo PDFA4 = new GeradorPDFAlternativo();
        PDFA4.hasFooter = true;
        PDFA4.hasHeader = true;
        PDFA4.footerHeight = 15;
        PDFA4.headerHeight = 15;

        System.out.println(PDFA4.toString());

        GeradorPDFAlternativo PDFA3 = new GeradorPDFAlternativo();
        PDFA3.hasFooter = true;
        PDFA3.hasHeader = true;
        PDFA3.footerHeight = 15;
        PDFA3.headerHeight = 15;
        PDFA3.pageSizeX = 297;
        PDFA3.pageSizeY = 420;

        System.out.println(PDFA3.toString());
    }
    
}
