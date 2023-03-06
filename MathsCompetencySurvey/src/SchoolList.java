public class SchoolList {
    //a school can be deleted or added
    //the data section
    private School[] schools = new School[10]; // normal array for schools
    private int currnum = 0;

    //the operations
    public void addSchool(School sc){
        schools[currnum] = sc; //why sc not sc.getname()??????? -- dapat sc as a whole
        currnum++;
    }
}