/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDF;

/**
 *
 * @author jeffe
 */
public class GeradorPDF {
    
    public String pageOrientation = "portrait";
    public String unit = "mm";
    public int pageSizeX = 210;
    public int pageSizeY = 297;
    public int marginTop = 30;
    public int marginRight = 20;
    public int marginBottom = 30;
    public int marginLeft = 20;
    public boolean hasHeader = false;
    public int headerHeight = 0;
    public boolean hasFooter = false;
    public int footerHeight = 0;
    public String pageColor = "#ffffff";
    public String encode = "UTF-8";

    public GeradorPDF(String pageOrientation, String unit, int pageSizeX, int pageSizeY, int marginTop, 
    int marginRight, int marginBottom, int marginLeft, boolean hasHeader, int headerHeight, 
    boolean hasFooter, int footerHeight, String pageColor, String encode)
    {
        this.pageOrientation = pageOrientation;
        this.unit = unit;
        this.pageSizeX = pageSizeX;
        this.pageSizeY = pageSizeY;
        this.marginTop = marginTop;
        this.marginRight = marginRight;
        this.marginBottom = marginBottom;
        this.marginLeft = marginLeft;
        this.hasHeader = hasHeader;
        this.headerHeight = headerHeight;
        this.hasFooter = hasFooter;
        this.footerHeight = footerHeight;
        this.pageColor = pageColor;
        this.encode = encode;
    }
    
    @Override
    public String toString()
    {
        return "\nPageOrientation = "+pageOrientation+"\n" +
           "Unit = "+unit+"\n" +
           "PageSizeX = "+pageSizeX+"\n" +
           "PageSizeY = "+pageSizeY+"\n" +
           "MarginTop = "+marginTop+"\n" +
           "MarginRight = "+marginRight+"\n" +
           "MarginBottom = "+marginBottom+"\n" +
           "MarginLeft = "+marginLeft+"\n" +
           "HasHeader = "+hasHeader+"\n" +
           "HeaderHeight = "+ headerHeight+"\n" +
           "HasFooter = "+ hasFooter+"\n" +
           "FooterHeight = "+ footerHeight+"\n" +
           "PageColor = "+ pageColor+"\n" +
           "Encode = "+ encode;
    }

    public String getPageOrientation() {
        return pageOrientation;
    }

    public void setPageOrientation(String pageOrientation) {
        this.pageOrientation = pageOrientation;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPageSizeX() {
        return pageSizeX;
    }

    public void setPageSizeX(int pageSizeX) {
        this.pageSizeX = pageSizeX;
    }

    public int getPageSizeY() {
        return pageSizeY;
    }

    public void setPageSizeY(int pageSizeY) {
        this.pageSizeY = pageSizeY;
    }

    public int getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(int marginTop) {
        this.marginTop = marginTop;
    }

    public int getMarginRight() {
        return marginRight;
    }

    public void setMarginRight(int marginRight) {
        this.marginRight = marginRight;
    }

    public int getMarginBottom() {
        return marginBottom;
    }

    public void setMarginBottom(int marginBottom) {
        this.marginBottom = marginBottom;
    }

    public int getMarginLeft() {
        return marginLeft;
    }

    public void setMarginLeft(int marginLeft) {
        this.marginLeft = marginLeft;
    }

    public boolean isHasHeader() {
        return hasHeader;
    }

    public void setHasHeader(boolean hasHeader) {
        this.hasHeader = hasHeader;
    }

    public int getHeaderHeight() {
        return headerHeight;
    }

    public void setHeaderHeight(int headerHeight) {
        this.headerHeight = headerHeight;
    }

    public boolean isHasFooter() {
        return hasFooter;
    }

    public void setHasFooter(boolean hasFooter) {
        this.hasFooter = hasFooter;
    }

    public int getFooterHeight() {
        return footerHeight;
    }

    public void setFooterHeight(int footerHeight) {
        this.footerHeight = footerHeight;
    }

    public String getPageColor() {
        return pageColor;
    }

    public void setPageColor(String pageColor) {
        this.pageColor = pageColor;
    }

    public String getEncode() {
        return encode;
    }

    public void setEncode(String encode) {
        this.encode = encode;
    }
    
}
