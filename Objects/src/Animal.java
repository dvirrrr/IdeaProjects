
public class Animal
{
    protected String name;
    protected String gender;
    protected int energy;
    public Animal(String name, String gender, int energy)
    {
        this.gender = gender;
        this.name = name;
        this.energy = energy;
    }
    public int getEnergy()
    {
        return this.energy;
    }
    public String getName()
    {
        return this.name;
    }
    public String getGender()
    {
        return this.gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setEnergy(int energy)
    {
        this.energy = energy;
    }
    public String toString()
    {
        return "Energy: "+this.energy+", Gender: "+this.gender+", Name: "+this.name+". ";
    }
}
