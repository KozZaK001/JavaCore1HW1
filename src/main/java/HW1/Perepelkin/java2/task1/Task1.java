package HW1.Perepelkin.java2.task1;

import HW1.Perepelkin.java2.task1.competitors.Cat;
import HW1.Perepelkin.java2.task1.competitors.Dog;
import HW1.Perepelkin.java2.task1.competitors.Human;
import HW1.Perepelkin.java2.task1.competitors.Team;
import HW1.Perepelkin.java2.task1.course.Course;
import HW1.Perepelkin.java2.task1.course.Cross;
import HW1.Perepelkin.java2.task1.course.Wall;
import HW1.Perepelkin.java2.task1.course.Water;


public class Task1 {
    public static void main(String[] args) {

        Course course1 = new Course(new Cross(500), new Wall(3),
                new Cross(1000), new Water(6));

        Team team1 = new Team("Команда 1", new Human("Борис"), new Cat("Беляш"),
                new Dog("Шарик"), new Dog("Бим"));

        Team team2 = new Team("Команда 2", new Human("Маша"), new Cat("Киса"),
                new Dog("Бобик"), new Dog("Рэкс"));


        course1.doIt(team1);
        course1.doIt(team2);

        System.out.println("\n+++Результаты+++\n");
        team1.showResults();
        System.out.println();
        team2.showResults();
    }
}
