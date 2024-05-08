//Solução alternativa - removendo o construtor.
using BuilderSolucao.PDF;

BuilderA4 builderA4 = new BuilderA4();
GeradorPDF pdfA4 = builderA4.getPDF();
Console.WriteLine(pdfA4.ToString());

BuilderA3 builderA3 = new BuilderA3();
GeradorPDF pdfA3 = builderA3.getPDF();
Console.WriteLine(pdfA3.ToString());
