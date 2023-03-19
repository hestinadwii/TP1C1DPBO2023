import java.util.ArrayList;

class Lecturer extends Human
{
    private String nip;
    private String markerList;
    private String laptop;
    private ArrayList<Assistant> assistant;

    /* Constructor */
    public Lecturer()
    {
        this.nip = "";
        this.markerList = new String();
        this.laptop = "";
        this.assistant = new ArrayList<Assistant>();
    }

    public Lecturer(String name, String gender, String nip, String markerList, String laptop, Assistant assistant)
    {
        super(name, gender);
        this.nip = nip;
        this.markerList = markerList;
        this.laptop = laptop;
        this.assistant = new ArrayList<Assistant>();
    }

    /* Getter and Setter */

    public String getNip() {
        return this.nip;
    }

    public void setNip(String Nip) {
        this.nip = nip;
    }

    public String getMarkerList()
    {
        return this.markerList;
    }

    public void setMarkerList(String markerList)
    {
        this.markerList = markerList;
    }

    public String getLaptop() {
        return this.laptop;
    }

    public void setLaptop(String laptop)
    {
        this.laptop = laptop;
    }

    public ArrayList<Assistant> getAssistant()
    {
        return this.assistant;
    }

    public void addAssistant(Assistant assistant)
    {
        this.assistant.add(assistant);
    }

    public void teach()
    {
        System.out.println(this.getName() + " is teaching in class!");
    }

    public void giveAssignment()
    {
        System.out.println(this.getName() + "is giving an assignment!");
    }

    public void giveScore ()
    {
        System.out.println(this.getName() + " is giving score!");
    }
}