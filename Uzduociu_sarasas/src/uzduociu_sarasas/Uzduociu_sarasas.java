/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzduociu_sarasas;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulius
 */
public class Uzduociu_sarasas {
    
        Connection prisijungimas =null;
        public static Connection Prisijungti()
        {
            try{
                String vieta ="jdbc:derby://localhost:1527/vartotojai";
                String vardas ="Paulius";
                String slaptas="Paulius";
                Connection prisijungimas = DriverManager.getConnection(vieta, vardas, slaptas);
           return prisijungimas;
           
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
           return null;
            }
              
    }

}
