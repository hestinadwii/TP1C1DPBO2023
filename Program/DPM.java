import java.util.ArrayList;

class DPM extends Student
{
    private String komisi;
    private String jabatan;

    /* Constructor */
    public DPM()
    {
        this.komisi = "";
        this.jabatan = "";
    }

    public DPM(String name, String gender, String nim, String textbookList, String laptop, String komisi, String jabatan)
    {
        super(name, gender, nim, textbookList, laptop);
        this.komisi = komisi;
        this.jabatan = jabatan;
    }

    /* Getter and Setter */

    //--- Get komisi ---//
    public String getKomisi() {
        return this.komisi;
    }

    //--- Set komisi ---//
    public void setKomisi(String komisi)
    {
        this.komisi = komisi;
    }
    //--- Get Jabatan ---//
    public String getJabatan() {
        return this.jabatan;
    }

    //--- Set Jabatan ---//
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void giveAppreciation()
    {
        System.out.println(this.getName() + "is giving a great appreciation!");
    }

    public void giveRecommendation()
    {
        System.out.println(this.getName() + " is giving a few reccomendations for soon-to-be-held proker!");
    }
}