import java.util.ArrayList;

class Assistant extends Student
{
    private String matkul;

    /* Constructor */
    public Assistant()
    {
        this.matkul = "";
    }

    public Assistant(String name, String gender, String nim, String textbookList, String laptop, String matkul)
    {
        super(name, gender, nim, textbookList, laptop);
        this.matkul = matkul;
    }

    /* Getter and Setter */

    //--- Get matkul ---//
    public String getMatkul() {
        return this.matkul;
    }

    //--- Set matkul ---//
    public void setMatkul(String matkul)
    {
        this.matkul = matkul;
    }

    public void teach()
    {
        System.out.println(this.getName() + "is teaching!");
    }

    public void giveHomework()
    {
        System.out.println(this.getName() + " is giving a homework!");
    }
}