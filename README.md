# TP1C1DPBO2023
    Saya Hestina Dwi Hartiwi NIM 2108077 mengerjakan soal TP 1 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.

### LANGUAGE
Bahasa yang digunakan adalah bahasa Java pride.

### DESIGN
![UML TP1 (1)](https://user-images.githubusercontent.com/100210178/226189203-8a17fb53-73c9-47e5-9ee7-c9274c8fa351.png)

### ASSUMPTION
#### Human
->Atribut : nama, gender

->Method : eat(), drink(), sleep()

===> buat class baru yaitu Human karena terdapat atribut yang sama pada
Student dan Lecturer, sehingga bisa dijadikan satu di kelas yang sama daripada
terdapat atribut yang redundant. 

===> Laptop tidak masuk ke kelas Human karena asumsi tidak semua Human punya laptop.

#### Student
->Atribut : nim, textbookList, laptop

->Method : study(), attend(), doAssignment()

===> anak dari Human karena merupakan objek yang sama

#### Lecturer
->Atribut : NIP, markerList, laptop, assistant

->Method : teach(), giveAssignment(), giveScore()

===> anak dari Human karena merupakan objek yang sama

===> Lecturer composite ke Assistant (Lecturer "has a" Assistant) karena mahasiswa yang diajar dosen tersebut berbeda angkatan dengan assistant dimana Assistant ini merupakan inheritance dari Mahasiswa. 
ex: Bu Rosa has Bang Satria as her Assistant in OOP course. Dari POV matkul OOP, Bang Satria dengan Mahasiswa yang ambil matkul OOP beda angkatan. Sehingga, Dosen has a "class Assistant" rather than "class Mahasiswa".

#### BEM
->Atribut : divisi, jabatan, prokerList

->Method : doProgram(), planning(), workingOnInnovation()

===> anak dari Mahasiswa karena merupakan objek yang sama

#### DPM
->Atribut : komisi, jabatan

->Method : giveAppreciation(), giveRecommendation()

===> anak dari Mahasiswa karena merupakan objek yang sama

#### Assistant
->Atribut : matkul

->Method : teach(), giveHomework()

===> anak dari Mahasiswa karena merupakan objek yang sama

### DOCUMENTATION
![Screenshot (78)](https://user-images.githubusercontent.com/100210178/226189292-7d4ff407-847d-45ad-bfc0-6f79550e41a1.png)
![Screenshot (79)](https://user-images.githubusercontent.com/100210178/226189295-aadbcb94-bb1f-4dd5-80a4-57fb59adab2a.png)
