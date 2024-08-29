/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prchatapp;

import java.util.ArrayList;

/**
 *
 * @author iuhs
 */
public class observable {
    
    ArrayList<observer> arr= new ArrayList<observer>();
    
    public void addnewobserver(observer newobserver){
        arr.add(newobserver);
    }
    public void sendall(String name,String txt){
        for (observer object : arr) {
            object.update(name,txt);
        }
    }
    
}
