package edu.temple.mercado_assignment4;


public class Picture
{
    private String name, desc;
    private int imageID;

    public Picture(String name, String desc)
    {
        this.name = name;
        this.desc = desc;
    }

    public String getName()
    {
        return name;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setImgID(int id)
    {
        this.imageID = id;
    }

    public int getImgID()
    {
        return this.imageID;
    }
}
