/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDF;

/**
 *
 * @author jeffe
 */
public class BuilderA3 {
    private GeradorPDF geradorPDF;

    public BuilderA3() {
        this.geradorPDF = new GeradorPDF();
        this.geradorPDF.pageOrientation = "portrait";
        this.geradorPDF.unit = "mm"; 
        this.geradorPDF.pageSizeX = 297;
        this.geradorPDF.pageSizeY = 420;
        this.geradorPDF.pageColor = "#ffffff";
        this.geradorPDF.encode = "UTF-8";
        this.geradorPDF.hasFooter = true;
        this.geradorPDF.footerHeight = 15;
        this.geradorPDF.hasHeader = true;
        this.geradorPDF.headerHeight = 15;
        this.geradorPDF.marginLeft = 20;
        this.geradorPDF.marginRight = 20;
        this.geradorPDF.marginBottom = 30;
        this.geradorPDF.marginTop = 30;
    }


    public GeradorPDF getGeradorPDF()
    {
        return this.geradorPDF;
    }

}
