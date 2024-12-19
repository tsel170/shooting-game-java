package shooting_game;

public class Velocity {
    float x;
    float y;

    public Velocity(float x,float y)
    {
        this.x = x;
        this.y=y;
    }
    public Velocity(Velocity vel)
    {
        this.x = vel.x;
        this.y = vel.y;
    }
}
