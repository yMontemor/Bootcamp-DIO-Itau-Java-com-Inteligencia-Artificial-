public class Manager extends Employee {
    private String login;
    private String password;
    private double comission;

    public void setLogin(String login){
        this.login = login;
    }

    public String getLogin(){
        return login;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setComission(double comission){
        this.comission = comission;
    }

    public double getComission(){
        return comission;
    }

}