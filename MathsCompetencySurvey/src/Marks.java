import java.util.Random;
public class Marks {

    Random rand = new Random();

    // Section A: marks
    private float marks[];
    int numdata;

    // Section B: operation
    public Marks (int numdat){
        createData(numdat);
    }
    public void createData(int numdat) {
        marks = new float[numdat];   // an array
        for (int i=0; i<numdat; i++) {
            int upperbound = 100;
            int int_random = rand.nextInt(upperbound);
            marks[i] = int_random;
        }
        numdata = numdat;
    }

    public Marks(float[] marks, int numdata) {
        this.marks = marks;
        this.numdata = numdata;
    }

    public float calcAvg() {
        float sum =0;
        for (int i=0; i<numdata; i++) {
            sum += marks[i];
        }
        float avg = sum / numdata;
        return avg;
    }

    public float calcStdDev(float avg){
        float sum = 0;
        float sd;

        for(int i =0; i< numdata; i++){
            sum += Math.pow((marks[i]-avg),2);
        };

        sd = (float) Math.sqrt(sum/(numdata-1));
        return sd;
    }

    public void setMark (int mark, int index) throws Exception {
        if (mark < 0){
            throw new Exception("Marks is incorrect.");
        }
        this.marks[index]=mark;
    }
    public float getMark(int index) {
        return marks[index]; //returning value at the particular index

    }
}