package Uebung1.aufgabe1;

interface Role
{
    public void play();
}

class HelloRole implements Role
{
    public void play()
    {
        System.out.println("hallo");
    }
}

class ByeRole implements Role
{
    public void play()
    {
        System.out.println("tschüß");
    }
}

class GeneralRole implements Role
{
    private String message;

    public GeneralRole(String message)
    {
        this.message = message;
    }

    public void play()
    {
        System.out.println(message);
    }
}

public class Actor1
{

    private int rolecount = 255;

    private Role[] roles = new Role[rolecount];

    public void action()
    {
        for (int i = 0; i < rolecount; i++)
        {
            if (roles[i] != null)
            {
                roles[i].play();
            }
            else
            {
                break;
            }
        }
    }

    /*
     * public void setOnAction(Role1 role) { this.role = role; }
     */
    public void addRole(Role role)
    {
        for (int i = 0; i < rolecount; i++)
        {
            if (roles[i] == null)
            {
                roles[i] = role;
                break;
            }
        }

    }

    public void clearRoles()
    {
        for (int i = 0; i < rolecount; i++)
        {
            roles[i] = null;
        }
    }

    public static void main(String[] args)
    {
        Actor1 actor = new Actor1();
        actor.action();

        actor.addRole(new HelloRole());
        actor.addRole(new HelloRole());
        actor.addRole(new HelloRole());

        actor.action();
        actor.clearRoles();
        System.out.println("after clear");
        actor.action();
    }
}
