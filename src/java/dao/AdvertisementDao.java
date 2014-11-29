/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import controller.Advertisement;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Rafael
 */
public class AdvertisementDao {
    
    public void AdvertisementAdd(Advertisement advertisement) {
        
            Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(advertisement);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Advertisement criado com sucesso");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            session.close();
        }
     
    }
    
    public void AdvertisementUpdate(Advertisement advertisement) {
        
            Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(advertisement);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Advertisement alterado com sucesso");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            session.close();
        }
     
    }
    
    public void AdvertisementDelete(Advertisement advertisement) {
        
        Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        
        try {
            session.beginTransaction();
            session.delete(advertisement);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Advertisement excluido com sucesso");
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
            Criteria cri = session.createCriteria(Advertisement.class);
		return cri.list();
	}finally{
		session.close();
 	}
    
    }
    
}


