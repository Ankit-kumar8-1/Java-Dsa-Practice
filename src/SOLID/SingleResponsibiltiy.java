package SOLID;


import java.util.Map;

public class SingleResponsibiltiy {

    public static void main(String[] args) {
        login login  = new login();
        Map<String,String>  callApi = login.register("ankit@gmail.com","1234556");

        System.out.print(callApi);
    }
}
