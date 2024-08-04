public class EjemploFact {
    public static void main(String[] args) {
        Factura factura1 = new Factura();
        factura1.nombreEmpresa = "Lal Creaciones";
        factura1.cuitEmpresa = "27-25728445-5";
        factura1.numFactura = 2541;
        factura1.tipoFactura = "A";
        factura1.fechaFactura = "02/08/2024";
        factura1.RenglonFact = new RenglonFact(01, "televisor", 2, 12354.25, 24708.50);
        factura1.ClienteFact = new ClienteFact("Fabricio Beadez", "20-46299396-3",
         "Falucho 730", "Consumidor Final");
        factura1.totalFactura = 24708.50;
    }
}    
