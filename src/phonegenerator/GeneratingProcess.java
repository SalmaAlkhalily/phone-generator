/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonegenerator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author asus
 */
public class GeneratingProcess {
     public File processing(String code, String start, int numofvals, int length,String countryname) throws IOException {
        // TODO code application logic here

        long phone = 0;
        StringBuilder sb = new StringBuilder();
        int phonelen = 0;
        String last = "";
        int counter = 0;
        String res = "";
        long lastval = 0;
        File fol=new File(System.getProperty("user.home")+File.separatorChar+"My Documents"+"\\"+"Phone Generator"+"\\"+"countries\\");
        fol.mkdir();
                                 System.out.println( fol.getPath());

        File old = new File(fol.getPath()+"\\"+countryname+"old.txt");
        if (!old.exists()) {
            old.createNewFile();
        }
        File neew = new File(fol.getPath()+"\\"+countryname+"new.txt");
        if (!neew.exists()) {
            neew.createNewFile();
        }
        if (old.length() == 0) {
            int i = 0;
            while (i < length) {
                last = last + "0";
                i++;
            }
            last = code + start + last;
            System.out.println(last + "  pp  ");
            sb.append(last);
            sb.append("\n");
        } else {
            FileReader red = new FileReader(old);
            BufferedReader bufred = new BufferedReader(red);
            String line = "";
            while ((line = bufred.readLine()) != null) {
                last = line;
            }
        }
        String index = code + start;
        System.out.println(index + "  indext");
        index = last.substring(0, index.length());
        System.out.println(index + "  in  " + index.length() + "  la  " + last);
        last = last.substring((index.length()), last.length());
        lastval = Long.valueOf(last);
        System.out.println(last + "  ll  ");
        phone = lastval;
        FileWriter fw = new FileWriter(neew);
        try (PrintWriter writer = new PrintWriter(fw)) {
            while (counter < numofvals) {
                phone++;
                if ((String.valueOf(phone)).length() != length) {
                    int tt = (String.valueOf(phone)).length();
                    String comp = "";
                    for (int i = 0; i < length - tt; i++) {
                        comp += "0";
                        
                    }
                    res = code + start + comp + phone;
                    
                } else {
                    res = code + start + phone;
                }
                
                sb.append(res );
                sb.append("\n");
                counter++;
                phonelen = 0;
                System.out.println(res);
            }
            writer.write(sb.toString());
            BufferedWriter ou = new BufferedWriter(new FileWriter(old));
            ou.write(res);
//        System.out.println(res+"jjj");
            ou.close();
        }
        fw.close();
        
      return neew;
     }
}
