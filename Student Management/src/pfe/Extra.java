/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Electronic Store
 */
public class Extra {
       public void sendEmail(String to,String Prof){
        if(NetworkConnectionVerify()){
            String from = "";
            String host = "localhost";
            Properties p = new Properties();
            p.put("mail.smtp.auth","true");
            p.put("mail.smtp.starttls.enable","true");
            p.put("mail.smtp.host","smtp.gmail.com");
            p.put("mail.smtp.port","587");
            Session s = Session.getDefaultInstance(p,new javax.mail.Authenticator(){
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication("testprojet2003@gmail.com","Yassine+3");
                }
            });
            try{
                MimeMessage m = new MimeMessage(s);
                m.setFrom(from);
                m.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
                m.setSubject("seance");
                m.setText("Votre prof"+Prof+"a lancer un seance");
                Transport.send(m);
               // System.out.println("Success. Email sent");
            }catch(Exception ex){
                System.out.println(ex);
               
            }
            
        }
        
    }
    
    public boolean NetworkConnectionVerify(){
        try {
         URL url = new URL("http://www.google.com");
         URLConnection connection = url.openConnection();
         connection.connect();
         return true;
        // System.out.println("Internet is connected");
      } catch (Exception e) {
         // System.out.println(e);
         return false;
      } 
       
    }
    
}
