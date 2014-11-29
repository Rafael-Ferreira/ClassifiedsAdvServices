/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import controller.Image;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Rafael
 */
public class ImageDao {
    
    public void ImageAdd(Image image) {
        
            Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(image);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Image criado com sucesso");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            session.close();
        }
     
    }
    
    public void ImageUpdate(Image image) {
        
            Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(image);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Image alterado com sucesso");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            session.close();
        }
     
    }
    
    public void ImageDelete(Image image) {
        
        Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        
        try {
            session.beginTransaction();
            session.delete(image);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Image excluido com sucesso");
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
            Criteria cri = session.createCriteria(Image.class);
		return cri.list();
	}finally{
		session.close();
 	}
    
    }
    
}



