package com.gf;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;


    @Transactional
    public class Usuario2Service {
    	
       @Autowired
       private  UsuarioDao pDao;

        public UsuarioDao getPDao() { return pDao; }

        public void setPDao(UsuarioDao peopleDao) { this.pDao = peopleDao;   }

        public void createPerson(Usuario name){
            pDao.create(name);
        }

        public List<Usuario> getPeople(){
            return pDao.getAll();
        }

    
    }

