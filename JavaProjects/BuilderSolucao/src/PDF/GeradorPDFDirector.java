/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDF;

/**
 *
 * @author jeffe
 */
public class GeradorPDFDirector {
    private BuilderInterfaceGeradorPDF builderGeradorPDF;

    public GeradorPDFDirector(BuilderInterfaceGeradorPDF builder)
    {
        this.builderGeradorPDF = builder;
    }

    public void setBuilderGeradorPDF(BuilderInterfaceGeradorPDF builder)
    {
        this.builderGeradorPDF = builder;
    }

    public void criarGeradorPDF()
    {
        this.builderGeradorPDF.setPageConfiguration();
        this.builderGeradorPDF.setMargin();
        this.builderGeradorPDF.setHeader();
        this.builderGeradorPDF.setFooter();
    }

    public void criarGeradorPDFNotHeader()
    {
        this.builderGeradorPDF.setPageConfiguration();
        this.builderGeradorPDF.setMargin();
        this.builderGeradorPDF.setFooter();
    }

    public void criarGeradorPDFNotFooter()
    {
        this.builderGeradorPDF.setPageConfiguration();
        this.builderGeradorPDF.setMargin();
        this.builderGeradorPDF.setHeader();
    }

    public void criarGeradorPDFNotHeaderNotFooter()
    {
        this.builderGeradorPDF.setPageConfiguration();
        this.builderGeradorPDF.setMargin();

    }
}
