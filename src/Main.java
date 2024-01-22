public class Main {
    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Harry Potter", 12, 14, 15, 12, 44);
        Griffindor hermione = new Griffindor("Hermione Granger", 2, 20, 11, 34, 22);
        Griffindor ron = new Griffindor("Ron Weasley", 11, 23, 9, 44, 32);

        Hufflepuff zachariah = new Hufflepuff("Zachariah Smith", 24, 15, 22, 44, 22);
        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 12, 14, 15, 45, 11);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 39, 22, 42, 12, 44);

        Ravenclaw zhou = new Ravenclaw("Zhou Chang", 12, 14, 23, 15, 55, 12);
        Ravenclaw padma = new Ravenclaw("Padma Patil", 23, 44, 51, 44, 44, 55);
        Ravenclaw marcus = new Ravenclaw("Marcus Belby", 33, 12, 44, 55, 31, 7);

        Slytherin draco = new Slytherin("Draco Malfoy", 12, 14, 55, 23, 12, 56, 11);
        Slytherin graham = new Slytherin("Graham Montague", 45, 22, 21, 41, 1, 55, 66);
        Slytherin gregory = new Slytherin("Gregory Goyle", 31, 32, 18, 45, 2, 13, 78);


        harry.toString();
        draco.toString();
        cedric.toString();
        marcus.toString();
        Ravenclaw.compareRavenclawStudents(zhou, padma);
        HogwartsStudent.compareStudents(zhou, harry);





    }
}