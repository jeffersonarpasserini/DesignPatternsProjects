// See https://aka.ms/new-console-template for more information
using BuilderProblema.PDF;

//Problema

GeradorPDF newPDFA4 = new GeradorPDF("portrait", "mm", 210, 297, 30, 20, 30, 20, true, 15, true, 15, "#ffffff", "UTF-8");

Console.WriteLine(newPDFA4.ToString());

GeradorPDF newPDFA3 = new GeradorPDF("portrait", "mm", 297, 420, 30, 20, 30, 20, true, 15, true, 15, "#ffffff", "UTF-8");

Console.WriteLine(newPDFA3.ToString());

//Solução alternativa - removendo o construtor.
GeradorPDFAlternativo PDFA4 = new GeradorPDFAlternativo();
PDFA4.hasFooter = true;
PDFA4.hasHeader = true;
PDFA4.footerHeight = 15;
PDFA4.headerHeight = 15;

Console.WriteLine(PDFA4.ToString());

GeradorPDFAlternativo PDFA3 = new GeradorPDFAlternativo();
PDFA3.hasFooter = true;
PDFA3.hasHeader = true;
PDFA3.footerHeight = 15;
PDFA3.headerHeight = 15;
PDFA3.pageSizeX = 297;
PDFA3.pageSizeY = 420;

Console.WriteLine(PDFA3.ToString());
