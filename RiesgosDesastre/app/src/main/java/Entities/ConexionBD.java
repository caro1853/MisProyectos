package Entities;

import android.content.Context;

import data.AccesoBaseDatos;

/**
 * Created by carolina on 14/05/2017.
 */

public class ConexionBD {

    private static AccesoBaseDatos accesoDatos;

    public static AccesoBaseDatos getAccesoDatos(Context contexto) {
        if (accesoDatos == null)
            accesoDatos = new AccesoBaseDatos(contexto, "", null, 1);

        return accesoDatos;
    }

}
