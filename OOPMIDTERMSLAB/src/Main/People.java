package Main;
public class People {
    private String First_Name;
    private String Last_Name;


//constructor
    public People(String FN, String LN){
        this.First_Name = FN;
        this.Last_Name = LN;
    }

//getters:
    public String getFirstName(){
        return this.First_Name;
    }

    public String getLastName(){
        return this.Last_Name;
    }

//setters:
    public void setFirstName(String name){
        this.First_Name = name;
    }

    public void setLastName(String name){
        this.Last_Name = name;
    }
}
