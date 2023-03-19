import java.util.ArrayList;

class Student extends Human
{
    private String nim;
    private String textbookList;
    private String laptop;

    /* Constructor */
    public Student()
    {
        this.nim = "";
        this.textbookList = "";
        this.laptop = "";
    }

    public Student(String name, String gender, String nim, String textbookList, String laptop)
    {
        super(name, gender);
        this.nim = nim;
        this.textbookList = textbookList;
        this.laptop = laptop;
    }

    /* Getter and Setter */

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getTextbookList()
    {
        return this.textbookList;
    }

    public void setTextbookList(String textbookList)
    {
        this.textbookList = textbookList;
    }

    public String getLaptop() {
        return this.laptop;
    }

    public void setLaptop(String laptop)
    {
        this.laptop = laptop;
    }

    public void study()
    {
        System.out.println(this.getName() + " is studying!");
    }

    public void attend()
    {
        System.out.println(this.getName() + "is attending to class!");
    }

    public void doAssignment ()
    {
        System.out.println(this.getName() + " is working on assignment!");
    }
}