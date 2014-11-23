package controller;
// Generated 23/11/2014 10:45:47 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Moderator generated by hbm2java
 */
public class Moderator  implements java.io.Serializable {


     private Integer modCod;
     private User user;
     private String nome;
     private Set hidelogs = new HashSet(0);

    public Moderator() {
    }

    public Moderator(User user, String nome, Set hidelogs) {
       this.user = user;
       this.nome = nome;
       this.hidelogs = hidelogs;
    }
   
    public Integer getModCod() {
        return this.modCod;
    }
    
    public void setModCod(Integer modCod) {
        this.modCod = modCod;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set getHidelogs() {
        return this.hidelogs;
    }
    
    public void setHidelogs(Set hidelogs) {
        this.hidelogs = hidelogs;
    }




}

