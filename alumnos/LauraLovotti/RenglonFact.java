public class RenglonFact{
    private int codArt;
    private String descArt;
    private double cantArt;
    private double precioInd;
    
    public RenglonFact(int codArt, String descArt, double cantArt, double precioInd){
        this.codArt = codArt;
        this.descArt = descArt;
        this.cantArt = cantArt;
        this.precioInd = precioInd;
    }
 
    public void setCodArt(int codArt){
        this.codArt = codArt;
    }

    public void setDescArt(descArt) {
        this.descArt = descArt;
    }

    public void setCantArt(cantArt) {
        this.cantArt = cantArt;
    }

    public void setPrecioInd(precioInd){
        this.precioInd = precioInd;
    }

    public int getCodArt(){
        return this.codArt;
    }

    public String getDescArt(){
        return this.descArt;
    }

    public int getCantArt(){
        return this.cantArt;
    }

    public double getPrecioInd(){
        return this.precioInd;
    }

    public double totalRenglon(){
        return this.cantArt * this.precioInd; 
    }
} 
   