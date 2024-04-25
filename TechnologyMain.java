package WS3;
import java.util.ArrayList;
import java.util.List;
public class TechnologyMain {
    public static void main(String[] args){

        TechnologyManager technologyManager = new TechnologyManager();

        List<Technology> technologies = technologyManager.getAll();

        for(Technology technology : technologies){
            System.out.println(technology.getName() + " " + technology.getProgrammingLanguageName());
        }

        System.out.println("----------------------------------");

        // DELETE TEST

        technologyManager.delete(1);

        for(Technology technology : technologies){
            System.out.println(technology.getName() + " " + technology.getProgrammingLanguageName());
        }

        // UPDATE TEST
        Technology updatedTech = new Technology();
        updatedTech.setId(2);
        updatedTech.setName("React");
        updatedTech.setProgrammingLanguageName("JS");
        technologyManager.update(updatedTech);

        System.out.println("----------------------------------");
        for(Technology technology : technologies){
            System.out.println(technology.getName() + " " + technology.getProgrammingLanguageName());
        }


        // ADD TEST

        Technology addTech = new Technology();
        addTech.setId(4);
        addTech.setName("Angular");
        addTech.setProgrammingLanguageName("JavaScript");
        technologyManager.add(addTech);

        System.out.println("----------------------------------");
        for(Technology technology : technologies){
            System.out.println(technology.getName() + " " + technology.getProgrammingLanguageName());
        }


    }
}
