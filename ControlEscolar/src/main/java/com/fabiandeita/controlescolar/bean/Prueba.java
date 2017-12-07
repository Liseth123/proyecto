/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabiandeita.controlescolar.bean;

import com.fabiandeita.controlescolar.dao.HibernateUtil;
import com.fabiandeita.controlescolar.model.Estudiante;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author fdeitaze
 */
public class Prueba {
    private String message;
    public Prueba(){
        message = "Hello mundo";
        //addEstudiante();
    }
    
    public void addEstudiante(){
        System.out.println("PRueba ---------------------------------------");
                Session session = HibernateUtil.getSessionFactory().getCurrentSession();
                session.beginTransaction();
        
                Estudiante s = new Estudiante("Marie"); 
                session.save(s); 
                session.getTransaction().commit(); 
                //init();
         }
    
    private synchronized void init(){ 
                Session session = HibernateUtil.getSessionFactory().getCurrentSession();
                session.beginTransaction();
        	
                //Load all objects from tables
                List studentResult = session.createQuery("select s.estudianteId from " +
                        "Estudiante as s").list();        
                session.getTransaction().commit(); 
         }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
}
