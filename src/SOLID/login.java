package SOLID;

import java.util.HashMap;
import java.util.Map;

public class login {


    HashMap<String,String> map  = new HashMap<>();

    public  Map<String,String>  register(String email, String password){
        Map<String,String> registerResponse = new HashMap<>();
        if (!checkAlreadyExistsOrNot(email)){
            saveDb(email,password);
            registerResponse.put("Instruction",sendEmail());
            registerResponse.put("Message","User Register Successfully");
        }else {
            registerResponse.put("Status","User Already Exists , you  can go to try login !");
            return registerResponse;
        }
        return registerResponse;
    }

    public  boolean checkAlreadyExistsOrNot(String email){
        for (String i : map.keySet()){
            if (i.equals(email)){
                return true;
            }
        }
        return false;
    }

    public  String  saveDb( String  email, String password){
        map.put(email,password);
        return "Save Successful";
    }

    public String sendEmail(){
        return  "Please check your email to verify your Email!";
    }


}
