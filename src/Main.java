public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindors = {
                new Griffindor("Harry Potter", 12, 14, 15, 12, 44),
                new Griffindor("Hermione Granger", 2, 20, 11, 34, 22),
                new Griffindor("Ron Weasley", 11, 23, 9, 44, 32)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zachariah Smith", 24, 15, 22, 44, 22),
                new Hufflepuff("Cedric Diggory", 12, 14, 15, 45, 11),
                new Hufflepuff("Justin Finch-Fletchley", 39, 22, 42, 12, 44)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zhou Chang", 12, 14, 23, 15, 55, 12),
                new Ravenclaw("Padma Patil", 23, 44, 51, 44, 44, 55),
                new Ravenclaw("Marcus Belby", 33, 12, 44, 55, 31, 7)
        };

        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", 12, 14, 55, 23, 12, 56, 11),
                new Slytherin("Graham Montague", 45, 22, 21, 41, 1, 55, 66),
                new Slytherin("Gregory Goyle", 31, 32, 18, 45, 2, 13, 78),
        };
        griffindors[2].toString();
        slytherins[1].toString();

        HogwartsStudent.compareStudents(griffindors[2], slytherins[1]);


    }
}