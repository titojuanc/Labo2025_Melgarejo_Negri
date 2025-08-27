package Estructura_ONG;

import java.time.LocalDate;

public abstract class IntegranteConSueldo extends Integrante{
    private int sueldo;
    private Banco banco;
    private LocalDate altaEnEmpresa;
    private int diaDePago;

    public IntegranteConSueldo(String nombre, String apellido, LocalDate f_nac, String direccion, int codigoPostal,
                               boolean aporteMensualidad, int sueldo, Banco banco, int diaDePago, LocalDate altaEnEmpresa) {
        super(nombre, apellido, f_nac, direccion, codigoPostal, aporteMensualidad);
        this.sueldo = sueldo;
        this.banco = banco;
        this.diaDePago = diaDePago;
        this.altaEnEmpresa = altaEnEmpresa;
    }
}
