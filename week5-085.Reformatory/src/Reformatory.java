public class Reformatory {
    private int total = 0;
   

    public int weight(Person person) {
        this.total++;
        //this.totalWeightsMeasured();
        // return the weight of the person
        return person.getWeight();
    }
    public void feed(Person person){
        int gain = this.weight(person) + 1;
        person.setWeight(gain);
    }
    public int totalWeightsMeasured(){
        
        return this.total;
    }

}
