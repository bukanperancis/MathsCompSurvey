import java.util.ArrayList;
public class DSchoolList {

    //data section
    ArrayList<School> schools = new ArrayList<>(); //array that store objects. <object>

    public void addSchool (School sc){
        schools.add(sc); //adding element into the dynamic array
    }

    public void display(){
        for (int i=0; i<schools.size(); i++){
            //System.out.print(schools.get(i));
            System.out.println("School: "+schools.get(i).getName()); //access name through get(i)
        }
    }

    public static void main (String[] args){

        DSchoolList dl = new DSchoolList();
        School sc = new School();
        sc.setName("St Patrick");
        dl.addSchool(sc);

        School sc2 = new School();
        sc2.setName("St John");
        dl.addSchool(sc2);

        dl.display();
    }
}
