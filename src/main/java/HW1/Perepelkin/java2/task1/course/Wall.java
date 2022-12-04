package HW1.Perepelkin.java2.task1.course;


import HW1.Perepelkin.java2.task1.competitors.Competitor;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
