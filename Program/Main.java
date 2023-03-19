/* 
    Saya Hestina Dwi Hartiwi NIM 2108077 mengerjakan soal TP 1 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

/* import library */
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Student> arrStudent = new ArrayList<Student>();
        ArrayList<BEM> arrBEM = new ArrayList<BEM>();
        ArrayList<DPM> arrDPM = new ArrayList<DPM>();
        ArrayList<Assistant> arrAssistant = new ArrayList<Assistant>();
        ArrayList<Lecturer> arrLecturer = new ArrayList<Lecturer>();

        /* Data Mahasiswa Reguler */
        Student mhs = new Student("Afri", "M", "96046", "Modul Data Mining", "ASUS");
        arrStudent.add(mhs);
        
        mhs = new Student("Anin", "F", "24582", "Modul Kalkulus", "Lenovo");
        arrStudent.add(mhs);
        
        /* Data Mahasiswa yang ikut BEM */
        BEM staff = new BEM("Rapi", "M", "89246", "Modul Pemrograman", "Lenovo", "Non Divisi", "Presiden BEM", "UPGRADING");
        arrBEM.add(staff);

        /* Data mahasiswa yang ikut DPM */
        DPM member = new DPM("Alga", "M", "23874", "Modul Pemrograman", "Macbook", "Komisi Pengawasan", "Ketua Komisi");
        arrDPM.add(member);

        /* Data mahasiswa yang jadi asisten */
        Assistant asisten = new Assistant("Najmi", "F", "32498", "Modul Pemrograman", "ASUS", "Programming");
        arrAssistant.add(asisten);
        
        asisten = new Assistant("Bulan", "M", "12863", "Modul Pemrograman", "Samsung", "Programming");
        arrAssistant.add(asisten);

        /* Data dosen */
        Lecturer dosen = new Lecturer("Mrs. Rose", "F", "981538149", "Spidol Snowman", "Macbook", asisten);
        arrLecturer.add(dosen);

        /* Output */
        System.out.println("---------------------------------------------");
        System.out.println("   [Kupu-Kupu a.k.a Regular Student Data]     ");
        for (int i = 0; i < arrStudent.size(); i++)
        {
            System.out.println((i + 1) + ". " + arrStudent.get(i).getName());
            System.out.println("NIM                 : " + arrStudent.get(i).getNim());
            System.out.println("Beloved Textbook    : " + arrStudent.get(i).getTextbookList());
            System.out.println("Laptop              : " + arrStudent.get(i).getLaptop());
        }
        System.out.println("--------------------------------------------");

        System.out.println("\n" + "---------------------------------------------");
        System.out.println("          [Kura-Kura a.k.a BEM Staff]     ");
        for (int i = 0; i < arrBEM.size(); i++)
        {
            System.out.println((i + 1) + ". " + arrBEM.get(i).getName());
            System.out.println("Gender              : " + arrBEM.get(i).getGender());
            System.out.println("NIM                 : " + arrBEM.get(i).getNim());
            System.out.println("Beloved Textbook    : " + arrBEM.get(i).getTextbookList());
            System.out.println("Laptop              : " + arrBEM.get(i).getLaptop());
            System.out.println("Department          : " + arrBEM.get(i).getDivisi());
            System.out.println("Position            : " + arrBEM.get(i).getJabatan());
            System.out.println("Workplan            : " + arrBEM.get(i).getProkerList());
        }
        System.out.println("--------------------------------------------");

        System.out.println("\n" + "---------------------------------------------");
        System.out.println("                [DPM Member]         ");
        for (int i = 0; i < arrDPM.size(); i++)
        {
            System.out.println((i + 1) + ". " + arrDPM.get(i).getName());
            System.out.println("Gender              : " + arrDPM.get(i).getGender());
            System.out.println("NIM                 : " + arrDPM.get(i).getNim());
            System.out.println("Beloved Textbook    : " + arrDPM.get(i).getTextbookList());
            System.out.println("Laptop              : " + arrDPM.get(i).getLaptop());
            System.out.println("Commmission         : " + arrDPM.get(i).getKomisi());
            System.out.println("Position            : " + arrDPM.get(i).getJabatan());
        }
        System.out.println("---------------------------------------------");

        System.out.println("\n" + "---------------------------------------------");
        System.out.println("              [Lecturer Data]");
        for (int i = 0; i < arrLecturer.size(); i++)
        {
            System.out.println((i + 1) + ". " + arrLecturer.get(i).getName());
            System.out.println("Gender              : " + arrLecturer.get(i).getGender());
            System.out.println("NIP                 : " + arrLecturer.get(i).getNip());
            System.out.println("Marker              : " + arrLecturer.get(i).getMarkerList());
            System.out.println("Laptop              : " + arrLecturer.get(i).getLaptop());

            System.out.println("\n" + "        [The Lecturer's Assistants]        ");
            for (int j = 0; j < arrAssistant.size(); j++)
            {
                System.out.println("---------------------------------------------");
                System.out.println("| " + (j + 1) + ") " + arrAssistant.get(j).getName());
                System.out.println("| Gender              : " + arrAssistant.get(j).getGender());
                System.out.println("| NIM                 : " + arrAssistant.get(j).getNim());
                System.out.println("| Beloved Textbook    : " + arrAssistant.get(j).getTextbookList());
                System.out.println("| Laptop              : " + arrAssistant.get(j).getLaptop());
                System.out.println("| Course              : " + arrAssistant.get(j).getMatkul());
                
            }
            System.out.println("---------------------------------------------");
        }
    }
}