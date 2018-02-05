/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konzentration;

import java.util.ArrayList;

/**
 *
 * @author kilian
 */
public class DynBoolArray {
    ArrayList<Boolean> booleans;
    
    public DynBoolArray(){
        booleans = new ArrayList<Boolean>();
    }
    public DynBoolArray(int Anzahl){
        booleans = new ArrayList<Boolean>();
        Boolean echt = false;
        for (int index=0;index<Anzahl;index++){
            booleans.add(echt);
        }
    }
    
}
