
package com.my.ums;

/**
 *
 * @author User
 */
public class Student extends Member{
    
void SignUp(String username){
    
    
     RegistrationFrame  f=new  RegistrationFrame(username);
     f.setVisible(true);
    
}

void SignIn(String username){
    
    InformationFrame f=new  InformationFrame(username);
    f.setVisible(true);
    
}
    
}
