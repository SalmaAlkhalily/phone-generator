/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonegenerator;

/**
 *
 * @author Salma
 */
public class PhoneGenerator {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Splach_Screen splash=new Splach_Screen();
        splash.setVisible(true);
        Settings setting=new Settings();
        
        try{
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                if(i==100)
                {
                    splash.setVisible(false);
                    setting.setVisible(true);
                    
                }
            }
        
        }catch(Exception ex){}
    }
    
}
