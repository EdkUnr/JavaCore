
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

    public static void compareSlytherinStudents(Slytherin students, Slytherin student) {
        Slytherin student1 = students;
        Slytherin student2 = student;

        int score1 = student1.getAmbition() + student1.getCunning() + student1.getDetermination() + student1.getThirstForPower() + student1.getResourcefulness();
        int score2 = student2.getAmbition() + student2.getCunning() + student2.getDetermination() + student2.getThirstForPower() + student2.getResourcefulness();

        if (score1 > score2) {
            System.out.println(student1.getName() + " студент Слизерина лучше, чем " + student2.getName());
        } else if (score1 < score2) {
            System.out.println(student2.getName() + " студент Слизерина лучше, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " оба хорошие студенты Слизерина.");
        }
    }

    public String toString() {
        String parameters = "Имя студента: " + this.getName() + ".\n"
                + "Хитрость: " + this.getCunning() + " очков.\n"
                + "Решительность: " + this.getDetermination() + " очков.\n"
                + "Амбициозность: " + this.getAmbition() + " очков.\n"
                + "Находчивость: " + this.getResourcefulness() + " очков.\n"
                + "Жажда власти: " + this.getThirstForPower() + " очков.\n"
                + "Сила магии: " + this.getThePowerOfMagic() + " очков.\n"
                + "Расстояние трансгрессии: " + this.getDistanceOfTransgression() + " очков.\n";
        System.out.println(parameters);
        return parameters;
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