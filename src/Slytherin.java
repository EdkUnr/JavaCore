
public class Slytherin extends HogwartsStudent{
    private String name;
    private int cunning, determination, ambition, resourcefulness, thirstForPower, thePowerOfMagic, distanceOfTransgression;

    public Slytherin(String name, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower, int thePowerOfMagic, int distanceOfTransgression) {
        super(name, thePowerOfMagic, distanceOfTransgression);
        this.name = name;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
        this.thePowerOfMagic = thePowerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String toString() {
        System.out.println("Имя студента: " + this.getName() + ".\n"
                + "Хитрость: " + this.getCunning() + " очков.\n"
                + "Решительность: " + this.getDetermination() + " очков.\n"
                + "Амбициозность: " + this.getAmbition() + " очков.\n"
                + "Находчивость: " + this.getResourcefulness() + " очков.\n"
                + "Жажда власти: " + this.getThirstForPower() + " очков.\n"
                + "Сила магии: " + this.getThePowerOfMagic() + " очков.\n"
                + "Расстояние трансгрессии: " + this.getDistanceOfTransgression() + " очков.\n");
        return null;
    }


    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
}