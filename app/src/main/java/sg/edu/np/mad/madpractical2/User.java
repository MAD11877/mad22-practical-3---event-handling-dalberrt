package sg.edu.np.mad.madpractical2;

public class User {
    public String Name;
    public String Description;
    public int Id;
    public boolean Followed;

    //Default Constructor
    public User(){}

    public User(String name, String desc, int id, boolean followed)
    {
        Name = name;
        Description = desc;
        Id = id;
        Followed = followed;
    }


}
