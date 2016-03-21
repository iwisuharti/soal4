
import java.util.ArrayList;
import java.util.Scanner;
public class Member {
    
    
    public static ArrayList <Main> member = new ArrayList<>();
    
    public static void main(String[] args) {
    Main s1 = new Main();
        s1.setNama("Iwi");
        s1.setTeam("CEMAN");
        s1.setUmur("19");
        s1.setPenampilan(90);
        s1.setSuara(80);
        s1.setAttitude(85);
        
    Main s2 = new Main();
        s2.setNama("Ninda");
        s2.setTeam("CEMAN");
        s2.setUmur("19");
        s2.setPenampilan(90);
        s2.setSuara(80);
        s2.setAttitude(85);
        
    Main s3 = new Main();
        s3.setNama("Riska");
        s3.setTeam("CEMAN");
        s3.setUmur("19");
        s3.setPenampilan(90);
        s3.setSuara(80);
        s3.setAttitude(85);
        
         Main s4 = new Main();
        s4.setNama("Yuni");
        s4.setTeam("CEMAN");
        s4.setUmur("19");
        s4.setPenampilan(90);
        s4.setSuara(80);
        s4.setAttitude(85);
        
    member.add(s1);
    member.add(s2);
    member.add(s3);
    member.add(s4);
    Member.Output();
    }
    
    public static void Output() {
        for (int i = 0; i < member.size(); i++){
            System.out.println("Nama\t: "+member.get(i).getNama());
            System.out.println("Team\t: "+member.get(i).getTeam());
            System.out.println("Umur\t: "+member.get(i).getUmur());
            System.out.println("Nilai\t: "+member.get(i).getNilai());
            System.out.println("================================================");
            
        }
        
    }
}
