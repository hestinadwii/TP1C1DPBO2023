import java.util.ArrayList;

class BEM extends Student
{
    private String divisi;
    private String jabatan;
    private String prokerList;

    /* Constructor */
    public BEM()
    {
        this.divisi = "";
        this.jabatan = "";
        this.prokerList = "";
    }

    public BEM(String name, String gender, String nim, String textbookList, String laptop, String divisi, String jabatan, String prokerList)
    {
        super(name, gender, nim, textbookList, laptop);
        this.divisi = divisi;
        this.jabatan = jabatan;
        this.prokerList = prokerList;
    }

    /* Getter and Setter */

    //--- Get Divisi ---//
    public String getDivisi() {
        return this.divisi;
    }

    //--- Set Divisi ---//
    public void setDivisi(String divisi)
    {
        this.divisi = divisi;
    }
    //--- Get Jabatan ---//
    public String getJabatan() {
        return this.jabatan;
    }

    //--- Set Jabatan ---//
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getProkerList()
    {
        return this.prokerList;
    }

    public void setProkerList(String prokerList)
    {
        this.prokerList = prokerList;
    }

    public void doProgram()
    {
        System.out.println(this.getName() + " is part of !");
    }

    public void planning()
    {
        System.out.println(this.getName() + "is planning a program!");
    }

    public void workingOnInnovation()
    {
        System.out.println(this.getName() + " is working on an innovation!");
    }
}