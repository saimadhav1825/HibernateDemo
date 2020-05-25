package com.SaiJava.HibernateDemo;

import javax.imageio.spi.ServiceRegistry;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.SessionFactory;



public class App 
{
    public static void main( String[] args ) 
    {
       
    	Alienaname a1=new Alienaname();
    	a1.setFname("sai");
    	a1.setMname("madhav");
    	a1.setLname("chenna");
    	Alien a=new Alien();
        a.setAid(1);
        a.setAname(a1);
        a.setAtech("c language"); 
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Alien.class);
        org.hibernate.service.ServiceRegistry sg=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
        SessionFactory sf=cfg.buildSessionFactory(sg);
        		Session session=sf.openSession();
        org.hibernate.Transaction tx=session.beginTransaction();
        
        session.save(a);
        tx.commit();
        //**            -->to fetch data from database
                          // a=(Alien)session.get(Alien.class, 101);
                          //System.out.print(a);
                             
    }
    
        
       
}
