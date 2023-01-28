/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.config;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;
import model.vaccinationsystem.CovidVaccinationSystem;

/**
 *
 * @author gayat
 */
public class DbConnector {
    private static final String FILENAME = Paths.get("covidSystem.db4o").toAbsolutePath().toString();
    private static DbConnector dbConnector;
    
    public synchronized static DbConnector getInstance(){
        if (dbConnector == null){
            dbConnector = new DbConnector();
        }
        return dbConnector;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(CovidVaccinationSystem.class).cascadeOnUpdate(true); 

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(CovidVaccinationSystem ecosystem) {
        ObjectContainer conn = createConnection();
        conn.store(ecosystem);
        conn.commit();
        conn.close();
    }
    
    public CovidVaccinationSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<CovidVaccinationSystem> ecosystems = conn.query(CovidVaccinationSystem.class); 
        CovidVaccinationSystem ecosystem;
        System.out.println("Size is : " + ecosystems.size());
        if (ecosystems.size() == 0){
            ecosystem = SystemConfig.configure();  
        }
        else{
            ecosystem = ecosystems.get(ecosystems.size() - 1);
        }
        conn.close();
        return ecosystem;
    }
}
