/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konzentration;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 * Diese Klasse ist nah an der für das Zentralabitur benötigten dynamischen Reihung.
 * Allerdings werden hier Referenzen übergeben und nicht Werte. Im gesamten 
 * dynamischen Array beginnt die Zählung mit 1 anstelle von 0. Dies liegt an den
 * anderen im Zentralabitur möglichen Programmiersprachen. 
 * Zusätzlich gibt es die Operation indexOf die die Position zurückgibt.
 * @author kilian
 * 
 */
public class DynArray {
        private ArrayList<JButton> buttons;
    
    /**
     * Ein neues DynArray wird erzeugt.
     * Es gibt nur diesen einen Konstruktor, wirklich.
     */
    public DynArray(){
        buttons = new ArrayList<JButton>();
    }

    /**
     * Überprüft, ob das DynArray leer ist.
     * Wenn die Reihung kein Element enthält, 
     * wird der Wert wahr zurückgegeben, sonst der Wert falsch. 
     * @return Wahrheitswert, der angibt, ob das DynArray leer ist.
     */    
    
    public boolean isEmpty(){
        return buttons.isEmpty();
    }
    
    /**
     * Der Inhalt des Elements an der Position index wird zurückgegeben.
     * @param index Position im Array beginnend mit 1!
     * @return Der Button an der gewünschten Stelle.
     */
    
    
    public JButton getItem(int index){
        return buttons.get(index-1);
    }
    
    /**
     * Die Anzahl der Elemente der dynamischen Reihung wird zurückgegeben.
     * @return Anzahl Elemente im DynArray
     */
    
    public int getLength(){
        return buttons.size();
    }
    
    /**
     * Das Element wird am Ende der dynamischen Reihung eingefügt.
     * @param inhalt Das zu übergebende Element.
     */
    
    public void append(JButton inhalt){
        buttons.add(inhalt);
    }

    /**
     * Das Element wird an der Position index in die dynamische Reihung eingefügt.
     * Falls an dieser Position schon ein Element in der Reihung vorhanden ist,  
     *  wirde das sich vorher an dieser Position befindende Element und 
     * alle weiteren nach hinten verschoben.
     * Ist der Wert von index um eins größer als die Anzahl der Elemente der Reihung,
     * wird das Element wie bei append am Ende der dynamischen Reihung eingefügt.
     * Für alle weiteren Werte von index hat die Operation keine Wirkung.
     * @param index Die Position, Achtung es wird mit eins begonnen!
     * @param inhalt Das Element
     */
    
    public void insertAt(int index, JButton inhalt){
        if (index<=buttons.size()+1 && index > 0){
            buttons.add(index-1,inhalt);
        }
    }
    
    /**
     * Das Element an der Position index wird durch inhalt ersetzt.
     * Falls die angegebene Position nicht existiert, hat die Operation keine Wirkung.
     * @param index Position, Achtung beginnend mit 1
     * @param inhalt Das Element
     */
    
    public void setItem(int index, JButton inhalt){
        if(index<=buttons.size() && index>0){
            buttons.remove(index-1);
            buttons.add(index-1, inhalt);
        }
    }

    /**
     * Das Element an der Position index wird entfernt. 
     * Alle folgenden Elemente werden um eine Position nach vorne geschoben. 
     * Falls die angegebene Position nicht existiert, hat die Operation keine Wirkung.
   
     * @param index Position, Achtung beginnend mit 1.
     */
    public void delete (int index){
        if(index<=buttons.size() && index>0){
            buttons.remove(index-1);
        }
    }
    
    /**
     * Gibt die Position des Elements im Array zurück.
     * Ist das Element nicht imArray: -1
     * @param inhalt Element nach dem gesucht werden soll!
     * @return Position an der das Element steht oder -1. Es wird bei 1 angefangen zu zählen.
     */
    
    public int indexOf(Object inhalt){
        return buttons.indexOf(inhalt)+1;
    }
    
}
