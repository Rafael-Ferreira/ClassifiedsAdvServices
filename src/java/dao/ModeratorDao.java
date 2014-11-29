/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import controller.Moderator;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Rafael
 */
public class ModeratorDao {
    
    public void ModeratorAdd(Moderator moderator) {
        
            Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(moderator);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Moderador criado com sucesso");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            session.close();
        }
     
    }
    
    public void ModeratorUpdate(Moderator moderator) {
        
            Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(moderator);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Moderador alterado com sucesso");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            session.close();
        }
     
    }
    
    public void ModeratorDelete(Moderator moderator) {
        
        Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        
        try {
            session.beginTransaction();
            session.delete(moderator);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Moderador excluido com sucesso");
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
            Criteria cri = session.createCriteria(Moderator.class);
		return cri.list();
	}finally{
		session.close();
 	}
    
    }
    
}

