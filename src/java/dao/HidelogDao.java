/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import controller.Hidelog;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Rafael
 */
public class HidelogDao {
    
    public void HidelogAdd(Hidelog hidelog) {
        
            Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(hidelog);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Hidelog criado com sucesso");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            session.close();
        }
     
    }
    
    public void HidelogUpdate(Hidelog hidelog) {
        
            Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(hidelog);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Hidelog alterado com sucesso");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            session.close();
        }
     
    }
    
    public void HidelogDelete(Hidelog hidelog) {
        
        Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        
        try {
            session.beginTransaction();
            session.delete(hidelog);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Hidelog excluido com sucesso");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            session.close();
        }
     
    }
    
    @SuppressWarnings("unchecked")
    public List listar(){
        
        Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
 
	try{
            Criteria cri = session.createCriteria(Hidelog.class);
		return cri.list();
	}finally{
		session.close();
 	}
    
    }
    
}


