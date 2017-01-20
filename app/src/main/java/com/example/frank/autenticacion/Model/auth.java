package com.example.frank.autenticacion.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Frank on 19/01/2017.
 */

public class auth {
    @SerializedName("respuesta")
    private boolean respuesta;

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }
}
