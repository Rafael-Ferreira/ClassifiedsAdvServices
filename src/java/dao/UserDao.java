/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import controller.User;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Rafael
 */
public class UserDao {
    
    public void UserAdd(User user) {
        
            Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Usuário criado com sucesso");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            session.close();
        }
     
    }
    
    public void UserUpdate(User user) {
        
            Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            session.close();
        }
     
    }
    
    public void UserDelete(User user) {
        
        Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        
        try {
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso");
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
            Criteria cri = session.createCriteria(User.class);
		return cri.list();
	}finally{
		session.close();
 	}
    
    }

    @SuppressWarnings("unchecked")
    public boolean UsuarioEncontrado(User user) {
        Session session = HibernateUtilDao.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            @SuppressWarnings("unchecked")
            User u;
            Query query;
            query = session.createQuery("from Usuario where login = :usuario");
            query.setParameter("usuario", user.getLogin());
            u = (User) query.uniqueResult();
           if (u != null) {
               if (!u.getPassword().equals(user.getPassword())) {
                   JOptionPane.showMessageDialog(null, "Senha Inválida");
                   return false;
               }   else {        
                   return true;
               }
           } else {
               JOptionPane.showMessageDialog(null, "Usuario não encontrado");
               return false;
           }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
        
    }
    
}
