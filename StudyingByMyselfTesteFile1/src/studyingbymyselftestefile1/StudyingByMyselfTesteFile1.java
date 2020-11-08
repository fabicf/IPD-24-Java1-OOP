package studyingbymyselftestefile1;

public class StudyingByMyselfTesteFile1 {

    public static void main(String[] args) {
        // Basic Classes, Methods, loops, etc.
        /*
        User usuario = new User();
        usuario.firstName = "Fabi";
        usuario.lastName = "Faria";
        System.out.println(usuario.getFullName()); */
        
        
        //pyramides - nested for loops
        /*
        for (int i = 9; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
                
            }
            System.out.println();
        } */
        
        //pyramides - nested while loops
        int i = 9;
        while (i >= 0){
            int k = i;
            while (k >=0){
                System.out.print(k+ " ");
                k--;
            }
            System.out.println();
            i--;
        }

    }
}
