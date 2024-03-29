/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nova Sibi
 */
class Validate {
        public static boolean validateEmail(String email)
        {
            boolean status=false;
            String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-Z]{2,})$";
            Pattern pattern = Pattern.compile(EMAIL_PATTERN);
            Matcher matcher = pattern.matcher(email);
            if(matcher.matches())
            {
                status=true;
            }
            else
                status=false;
            
        return status;
        }

}
