/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import controller.Category;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Rafael
 */
public class CategoryDao {
    
    public void CategoryAdd(Category category) {
        
            Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(category);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Category criado com sucesso");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            session.close();
        }
     
    }
    
    public void CategoryUpdate(Category category) {
        
            Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(category);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Category alterado com sucesso");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            session.close();
        }
     
    }
    
    public void CategoryDelete(Category category) {
        
        Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        
        try {
            session.beginTransaction();
            session.delete(category);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Category excluido com sucesso");
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
            Criteria cri = session.createCriteria(Category.class);
		return cri.list();
	}finally{
		session.close();
 	}
    
    }
    
}

