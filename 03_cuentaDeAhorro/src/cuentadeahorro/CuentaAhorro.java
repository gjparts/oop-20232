package cuentadeahorro;

/**
 * clase CuentaAhorro
 * @author  Gerardo Portillo
 * @since   2023-06-09
 */
public class CuentaAhorro {
    //atributos
    public String nombreCliente;
    public String numeroCuenta;
    private float saldo;
    //constructor
    /**
     * Construye un nuevo objeto de cuenta de ahorro (CuentaAhorro)
     * @param nombreCliente el nombre del cuentahabiente
     * @param numeroCuenta  el numero de la cuenta de ahorro
     */
    public CuentaAhorro(String nombreCliente, String numeroCuenta){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.00f;
    }
    /**
     * Devuelve el saldo de la cuenta de ahorro
     * @return un valor float que representa el saldo de la cuenta de ahorros
     */
    public float getSaldo(){
        return this.saldo;
    }
    /**
     * Incrementa el saldo de la cuenta de ahorros mediante un deposito
     * @param monto valor float mayor o igual que cero.
     */
    public void depositar(float monto){
        if( monto >= 0 )
            this.saldo += monto;
        else
            throw new IllegalArgumentException("No se permite depositar montos negativos");
    }
    /**
     * Disminuye el saldo de la cuenta de ahorros
     * @param monto valor float mayor o igual que cero
     */
    public void retirar(float monto){
        /*
        if( monto < 0 || monto > this.saldo )
            throw new IllegalArgumentException("Monto a retirar no aceptado.");
        else
            this.saldo -= monto;
            */
        if( monto < 0 )
            throw new IllegalArgumentException("No se permite retirar montos negativos.");
        else{
            if( monto > this.saldo )
                throw new IllegalArgumentException("Fondos insuficientes.");
            else
                this.saldo -= monto;
        }
    }
}
