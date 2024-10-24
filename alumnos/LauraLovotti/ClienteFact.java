public class ClienteFact{
    private String nombreCliente;
    private String cuitCliente;
    private String condIvaCliente;
    private String domicCliente;

    public ClienteFact (String nombreCliente, String cuitCliente, String condIvaCliente, String domicCliente) {
        this.nombreCliente = nombreCliente;
        this.cuitCliente = cuitCliente;
        this.condIvaCliente = condIvaCliente;
        this.domicCliente = domicCliente;
    }

    public void setNombreCliente(nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public void setCuitCliente(cuitCliente){
        this.cuitCliente = cuitCliente;
    }

    public void setCondIvaCliente(condIvaCliente){
        this.condIvaCliente = condIvaCliente;
    }

    public void setDomicCliente(domicCliente){
        this.domicCliente = domicCliente;
    }

    public String getNombreCliente(){
        return this.nombreCliente;
    }

    public String getCuitCliente(){
        return this.cuitCliente;
    }

    public String getCondIvaCliente(){
        return this.condIvaCliente;
    }

    public String getDomicCliente(){
        return this.nombreCliente;
    }
} 
 