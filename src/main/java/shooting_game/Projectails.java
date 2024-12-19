package shooting_game;

import com.raylib.Raylib;

import static com.raylib.Raylib.DrawCircle;

public class Projectails {
    float x;
    float y;
    Raylib.Color color;
    float radius;
    Velocity velocity;

    public static Projectails projectails[] = new Projectails[0];
    public static int projectailsLen =0;

        public static void addProjectaile(Projectails pro){

            Projectails newArr[] = new Projectails[projectailsLen +1];
            for (int i = 0; i < projectailsLen; i++) {
                newArr[i] = projectails[i];
            }

            projectails = newArr;
            projectails[projectailsLen] = pro;
            projectailsLen+=1;
        }

    public static void deleteProjectaile(int index){
        int jump =0;
        Projectails newArr[] = new Projectails[projectailsLen -1];
        for (int i = 0; i < projectailsLen-1; i++) {
            if(i == index)
            {
                jump=1;
            }
            newArr[i] = projectails[i + jump];
        }

        projectails = newArr;
        projectailsLen-=1;
    }


    public Projectails(float x,float y,float radius,Raylib.Color color, Velocity velocity)
    {
        this.x = x;
        this.y =y;
        this.radius = radius;
        this.color = color;
        this.velocity = new Velocity(velocity);
    }
    public Projectails(Projectails pro)
    {
        this.x = pro.x;
        this.y = pro.y;
        this.color = pro.color;
        this.radius = pro.radius;
        this.velocity = pro.velocity;
    }

    public void draw()
    {
        DrawCircle((int)this.x, (int)this.y, this.radius, this.color);
    }
    public void update()
    {
        draw();
        this.x += velocity.x;
        this.y += velocity.y;
    }
}
