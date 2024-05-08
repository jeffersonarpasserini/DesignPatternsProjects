using BuilderSolucao.PDF;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BuilderSolucao.PDF
{
    public class BuilderA4 {
        private GeradorPDF geradorPDF;

        public BuilderA4() {
            this.geradorPDF = new GeradorPDF();
            this.geradorPDF.pageOrientation = "portrait";
            this.geradorPDF.unit = "mm";
            this.geradorPDF.pageSizeX = 210;
            this.geradorPDF.pageSizeY = 297;
            this.geradorPDF.marginTop = 30;
            this.geradorPDF.marginRight = 20;
            this.geradorPDF.marginBottom = 30;
            this.geradorPDF.marginLeft = 20;
            this.geradorPDF.hasHeader = true;
            this.geradorPDF.headerHeight = 15;
            this.geradorPDF.hasFooter = true;
            this.geradorPDF.footerHeight = 15;
            this.geradorPDF.pageColor = "#ffffff";
            this.geradorPDF.encode = "UTF-8";
        }

        public GeradorPDF getPDF()
        {
            return this.geradorPDF;
        }
    }
}
