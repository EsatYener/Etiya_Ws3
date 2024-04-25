package WS3;

public class Technology {
    private int id;
    private String name;
    private String programmingLanguageName;



    public Technology(){
    }

    public Technology(int id, String Name, String programmingLanguageName){
        this.id = id;
        name = Name;
        this.programmingLanguageName = programmingLanguageName;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getProgrammingLanguageName(){
        return this.programmingLanguageName;
    }

    public void setProgrammingLanguageName(String programmingLanguageName){
        this.programmingLanguageName = programmingLanguageName;
    }




}

