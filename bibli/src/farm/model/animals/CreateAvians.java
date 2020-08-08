
package farm.model.animals;

import java.util.ArrayList;

/**
 *
 * @author MConstantin
 */
public class CreateAvians extends Animal implements Avian {
    
    private int canFly;
    private int hasFeeders;
    
    
    public CreateAvians(String specie, String name, String dateOfBirth, String dateOfArrival, int gender, Medication medication, Vaccine vaccine) {
        super(specie, name, dateOfBirth, dateOfArrival, gender, medication, vaccine);
    
    }
    
    @Override
    public void createOffpring(String name, String dateOfBirth, String dateOfArrival, int gender, Medication medication, Vaccine vaccine) {
        getOffsprings().add(new CreateAvians(this.getSpecie(), name, dateOfBirth, dateOfArrival, gender, medication, vaccine));
    }

    public int getCanFligh() {
        return canFly;
    }

    public void setCanFligh(int canFly) {
        this.canFly = canFly;
    }

    public int getHasFeeders() {
        return hasFeeders;
    }

    public void setHasFeeders(int hasFeeders) {
        this.hasFeeders = hasFeeders;
    }
    
    
    public ArrayList<String> toArrayList(){
        ArrayList<String> list = super.toArrayList();
        list.add(canFly(canFly));
        list.add(hasFeeders(hasFeeders));
        return list;
    }
    
    
    public ArrayList<String> nameVariables(){
        ArrayList<String> names = super.nameVariables();
        names.add("canFly");
        names.add("hasFeeders");
        return names;
    }
    
    
    
}
