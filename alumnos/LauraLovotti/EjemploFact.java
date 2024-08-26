public class EjemploFact {
    public static void main(String[] args) {
        Factura factura1 = new Factura();
        factura1.nombreEmpresa = "Lal Creaciones";
        factura1.cuitEmpresa = "27-25728445-5";
        factura1.numFactura = 2541;
        factura1.tipoFactura = 'A';
        factura1.fechaFactura = "02/08/2024";
        
        RenglonFact renglon = new RenglonFact();
        renglon.codArt = 1;
        renglon.descArt = "televisor"; 
        renglon.cantArt = 2;
        renglon.precioInd = 12.8;
        renglon.totalRenglon = 25.6;
        factura1.renglones[0] = renglon;

        RenglonFact renglon2 = new RenglonFact();
        renglon.codArt = 2;
        renglon.descArt = "licuadora";
        renglon.cantArt = 1;
        renglon.precioInd = 1.8;
        renglon.totalRenglon = 1.8;
        factura1.renglones[1] = renglon2;


        ClienteFact cliente = new ClienteFact();
        cliente.nombreCliente = "Fabricio";
        cliente.condIvaCliente = "Consumidor Final";
        cliente.cuitCliente = "20-46299386-3";
        cliente.domicCliente = "Falucho 730";
        factura1.cliente = cliente;
        // factura1.RenglonFact = new RenglonFact(01, "televisor", 2, 12354.25, 24708.50);
        //factura1.ClienteFact = new ClienteFact("Fabricio Beadez", "20-46299396-3", "Falucho 730", "Consumidor Final");
        factura1.totalFactura = 51.2;
    }
}    
