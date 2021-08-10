public class App {
    public static void main(String[] args) throws Exception {

    int peso = 5;
    int adicionP;
    int DISCO_DURO_BASE = 250;

    if (peso < 1){
        System.out.println(0);
    }else if (peso > 1 && peso <=2){
        System.out.println(20);
    }else if (peso > 2 && peso <= 3){
        System.out.println(35);
    }else if (peso > 3 && peso <= 4){
        System.out.println(45);  
    }else{
        System.out.println(73);
    }

     char consumoW = 'D';
     int adicionCW;
     
     switch (consumoW) {
        case 'A': adicionCW = 80;             
             break;
        case 'B': adicionCW = 70;             
             break;
        case 'C': adicionCW = 60;             
             break;
        case 'D': adicionCW = 50;             
             break;
        case 'E': adicionCW = 40;             
             break;
        case 'F': adicionCW = 30;             
             break;
        default: adicionCW = 0;
             break;
     }
     System.out.println(adicionCW);

    /*int discoDuro = 70;
    int DISCO_DURO_BASE = 250;

    if (discoDuro < 250){
        System.out.println(0);
    }else if (discoDuro > 250 && discoDuro <=500){
        System.out.println(25);
    }else if (discoDuro > 500 && discoDuro <= 1000){
        System.out.println(65); 
    }else{
        System.out.println(89);
    }*/
    }
}
