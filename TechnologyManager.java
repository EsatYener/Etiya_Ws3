package WS3;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class TechnologyManager {
    private final List<Technology> technologies;

    public TechnologyManager(){
        technologies = new ArrayList<Technology>();
        technologies.add(new Technology(1,"Spring","Java"));
        technologies.add(new Technology(2,"Angular","JavaScript"));
        technologies.add(new Technology(3,"ASP.net","C#"));
    }

    public List<Technology>  getAll(){
        return technologies;
    }

    public Technology getById(int id){
        for(Technology technology: technologies){
            if(technology.getId() == id){
                return technology;
            }
        }
        return null;

    }

    public void add(Technology technology){
        technologies.add(technology);
    }
    public void update(Technology technology){
        for(Technology updateTechnology:technologies){
            if(updateTechnology.getId() == technology.getId()){
                updateTechnology.setName(technology.getName());
                updateTechnology.setProgrammingLanguageName(technology.getProgrammingLanguageName());
            }
        }

    }
    public void delete(int id){
        Iterator<Technology> iterator = technologies.iterator();
        while (iterator.hasNext()){
            Technology technology = iterator.next();
            if(technology.getId()==id){
                iterator.remove();
            }
        }
    }

}
