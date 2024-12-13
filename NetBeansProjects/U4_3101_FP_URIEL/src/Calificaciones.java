import javax.swing.JOptionPane;

public class Calificaciones {
    public static void main(String[] args) {
        // Declaracion de variables
        String encabezado[] = {"Materia","U1","U2","U3","U4","U5","PromMat"};
        String materias[] = {"FundPro", "FundInv", "Quimica", "DesaSus", "MateDis","CalcDif",};
        byte calificaciones[][] = new byte[6][5];
        byte x,y;
        double promedio, promedioFinal, acum = 0.0;
        // Ingreso de calificaciones de las materias
        for (x = 0; x <= 5; x++){
            for(y = 0; y < 5; y++){
                calificaciones[x][y] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa calificaciones de " + 
                        materias[x] + " Unidad " + (y + 1)));
            }
        }
        for (x = 0; x < 7; x++){
            System.out.print(encabezado[x] + "\t");
        }    
        System.out.println();
        for (x = 0; x < 6; x++){
            System.out.print(materias[x] + "\t");
            double acumulado = 0;
            for (y = 0; y < 5; y++){ 
                System.out.print(calificaciones[x][y] + "\t");
                acumulado += calificaciones[x][y];
                }    
            promedio = acumulado/5;
            acum += promedio;
            System.out.println(promedio + "\t");
            }
        promedioFinal = acum/6;
        System.out.println();
        System.out.println("Promedio Final: " + promedioFinal);    
}
}
     

        

