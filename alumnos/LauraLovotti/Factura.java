public class Factura {
    String nombreEmpresa;
    String cuitEmpresa;
    int numFactura;
    char tipoFactura;
    String fechaFactura;
    RenglonFact[] renglones = new RenglonFact[10];
    ClienteFact cliente;
    double totalFactura;
}