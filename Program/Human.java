class Human {
    private String name;
    private String gender;

    /* Constructor */
    public Human() 
    {
        this.name = "";
        this.gender = "";
    }

    public Human(String name, String gender)
    {
        this.name = name;
        this.gender = gender;
    }

    /* Getter and Setter */

    //--- Get Name ---//
    public String getName() {
        return this.name;
    }

    //--- Set Name ---//
    public void setName(String name)
    {
        this.name = name;
    }

    //--- Get Gender ---//
    public String getGender() {
        return this.gender;
    }

    //--- Set Gender ---//
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void eat()
    {
        System.out.println(this.name + " is eating!");
    }

    public void drink()
    {
        System.out.println(this.name + "is drinking!");
    }

    public void sleep ()
    {
        System.out.println(this.name + " is sleeping!");
    }
}