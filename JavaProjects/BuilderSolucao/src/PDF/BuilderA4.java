/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDF;

/**
 *
 * @author jeffe
 */
public class BuilderA4 implements BuilderInterfaceGeradorPDF {
    private GeradorPDF geradorPDF;

    public BuilderA4() {
        this.geradorPDF = new GeradorPDF();
    }

    @Override
    public GeradorPDF getGeradorPDF()
    {
        return this.geradorPDF;
    }

    @Override
    public void setFooter()
    {
        this.geradorPDF.hasFooter = true;
        this.geradorPDF.footerHeight = 15;
    }

    @Override
    public void setHeader()
    {
        this.geradorPDF.hasHeader = true;
        this.geradorPDF.headerHeight = 15;
    }

    @Override
    public void setMargin()
    {
        this.geradorPDF.marginLeft = 20;
        this.geradorPDF.marginRight = 20;
        this.geradorPDF.marginBottom = 30;
        this.geradorPDF.marginTop = 30;
    }

    @Override
    public void setPageConfiguration()
    {
        this.geradorPDF.pageOrientation = "portrait";
        this.geradorPDF.unit = "mm";
        this.geradorPDF.pageSizeX = 297;
        this.geradorPDF.pageSizeY = 420;
        this.geradorPDF.pageColor = "#ffffff";
        this.geradorPDF.encode = "UTF-8";
    }
}
