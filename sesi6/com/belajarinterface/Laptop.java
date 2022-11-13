/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi6.com.belajarinterface;

/**
 *
 * @author user
 */
public interface Laptop {
    
    int MAX_VOL = 100;
    int MIN_VOL = 0;
    
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
