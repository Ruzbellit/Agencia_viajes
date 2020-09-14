/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgenciaDeViajes;

/**
 *
 * @author villa
 */
class TransporteCiudad {

    private String ciudad;
    private double precioBus, precioChiva, precioBicicleta;

    /**
     * inicializa los atributos con los parametros ingresados
     * @param ciudad
     * @param precioBus
     * @param precioChiva
     * @param precioBicicleta 
     */
    TransporteCiudad(String ciudad, double precioBus, double precioChiva, double precioBicicleta) {
        this.ciudad = ciudad;
        this.precioBus = precioBus;
        this.precioChiva = precioChiva;
        this.precioBicicleta = precioBicicleta;
    }

    /**
     *
     * @return ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * 
     * @param tipoTransporte
     * @return precio del tipo de transporte
     */
    public double getPrecio(String tipoTransporte) {
        switch (tipoTransporte) {
            case "BUS":
                return precioBus;
            case "CHIVA":
                return precioChiva;
            case "BICICLETA":
                return precioBicicleta;
            default:
                return 0;
        }
    }

    /**
     * lista los precios de los tipos de transporte
     * @return lista de precios
     */
    public String getInformacionPrecios() {
        return "Bus: " + precioBus
                + "\nChiva: " + precioChiva
                + "\nBicicleta: " + precioBicicleta;
    }

}
