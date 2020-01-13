/*
 * Copyright 2020 Alejandro Alberca Gallardo - alejandro.alberca.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

import java.io.Serializable;
import java.util.Locale;

/**
 *
 * @author Alejandro Alberca Gallardo - alejandro.alberca.alum@iescamp.es
 */
public final class Mandocleta implements  Serializable{
    private static final long serialVersionUID = 1L;
    //Constantes
    public static final double DEF_VELOCIDAD = 0.0;
    public static final double MAX_VELOCIDAD = 1.5;
    
    private double velocidad;

    public Mandocleta(double velocidad) {
        if (validar(velocidad)){
        this.velocidad = velocidad;
        } else {
        this.velocidad = DEF_VELOCIDAD;
        }
        velocidad = DEF_VELOCIDAD;
    }    

    public Mandocleta() {
    }

    public double getVelocidad() {
        return velocidad;
    }

    public final void setVelocidad(double velocidad) {
        if (validar(velocidad)){
        this.velocidad = velocidad;        
        }
    }
    @Override    
    public final String toString(){
    return String.format(Locale.ENGLISH, "%s -%.2f m/s",getClass().getSimpleName
        (),velocidad);
    }
    
    @Override
    public final boolean equals(Object o){
    boolean testOK;
    if (o == null){
    testOK = false;
    }else if (!(o instanceof Mandocleta)) {
    testOK =false;
    } else {
    testOK =this.velocidad == ((Mandocleta) o) .getVelocidad();
    }
    return testOK;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.velocidad) ^ (Double.doubleToLongBits(this.velocidad) >>> 32));
        return hash;
    }
    
    private  boolean validar (double velocidad){
    return Math.abs(velocidad) <= MAX_VELOCIDAD;
    }
}