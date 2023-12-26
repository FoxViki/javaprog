import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class dz7 {

 public static void main(String[] args) {
        Nouty nout1 = new Nouty();
        nout1.id_num = "1";
        nout1.name = "Asus";
        nout1.memory = "128";
        nout1.op_sys = "Windows10";
        nout1.color = "grey";

        Nouty nout2 = new Nouty();
        nout2.id_num = "2";
        nout2.name = "Lenovo";
        nout2.memory = "1024";
        nout2.op_sys = "Windows10";
        nout2.color = "black";

        Nouty nout3 = new Nouty();
        nout3.id_num = "3";
        nout3.name = "MacBook";
        nout3.memory = "512";
        nout3.op_sys = "MacOS";
        nout3.color = "black";
        
        Nouty nout4 = new Nouty();
        nout4.id_num = "4";
        nout4.name = "MacBook";
        nout4.memory = "1024";
        nout4.op_sys = "MacOS";
        nout4.color = "grey";

        Set<Nouty> laptops = new HashSet<>();
        laptops.add(nout1);
        laptops.add(nout2);
        laptops.add(nout3);
        laptops.add(nout4);

        //System.out.println(notebooks);
        generateFiltred(laptops);
        
    }

    private static void generateFiltred(Set<Nouty> laptops) {
        Map <String, String> params = new HashMap<>();
        boolean search = true;
        Scanner scanner = new Scanner(System.in);
        while (search) {
           
            System.out.println("Введие цифру, которая соответствует параметру фильтрации: ");
            System.out.println("1 - Бренд, \n2 - Объем памяти, \n3 - Операционная система, \n4 - Цвет");

            int choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Введите название бренда: ");
                    params.put("name", scanner.next());
                    break;
                case 2:
                    System.out.println("Введите объем памяти: ");
                    params.put("memory", scanner.next());
                    break;
                case 3:
                    System.out.println("Введите название операционной системы: ");
                    params.put("op_sys", scanner.next());
                    break;
                case 4:
                    System.out.println("Введите цвет корпуса: ");
                    params.put("color", scanner.next());
                    break;
                default:
                    search = false;
                    return;
                    
            }
            
            System.out.println(params);
            printRezult(laptops, params);
        }
        
    }


public static void printRezult(Set<Nouty> laptops, Map <String, String> params){
  
    for (Nouty nout : laptops) {

            if (nout.getName().equals(params.get("name")) &&
                nout.getMemory().equals(params.get("memory")) &&
                nout.getOp_sys().equals(params.get("op_sys")) &&
                nout.getColor().equals(params.get("color"))); {
              
                System.out.println(nout);
            }
            
        }
        4
    }
    
}




// public static void search (Set<Nouty> notebooks){
//         Nouty params = new Nouty();
//         params.id_num = null;
//         System.out.println("Введите марку производителя: ");
//         Scanner sc = new Scanner(System.in, "");
//         params.name = sc.next();
//         System.out.println("Введите обьем памяти: ");
//         params.memory = sc.next();
//         System.out.printf("Введите нужную операционную систему: ");
//         params.op_sys = sc.next();
//         System.out.printf("Введите интересующий цвет: ");
//         params.color = sc.next();

//         public filter(Set<Nouty> notebooks, Nouty params);{
//             for(Nouty notebooks: notebooks, params()){
//                 if (params in notebooks){
//                 return true

//             System.out.println(key)
//                         }
//         }
            
        

    
// }
// }

