/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author JuandeJesus
 */
public class Proceso {

    private int Estados, no_car,pos_X=1, no_car2;
    private String abecedario, cadena;
    private String[][] matriz;
    
    public String[] caracteres;
    private String[] cadena_car;
    public String [] estados_car;

    public Proceso(String abc, int est) {
        this.abecedario = abc;
        this.Estados = est;
        no_car = abecedario.length();
        no_car2 = abecedario.length();
        String matriz2 [][]={{"E/A","a","b","c","E_A"},
                               {"S0","S1","E","E"},
                               {"S1","S1","S3","S1"},
                               {"S2","E","S3","S2"},
                               {"S3","E","S3","E","A"}};
        this.matriz=matriz2;
        llenar_caracteres();
        llenar_est();
      
        

    }

    public void llenar_caracteres() {
        this.caracteres = new String[no_car + 1];
        for (int x = 0; x < no_car; x++) {
            this.caracteres[x] = abecedario.substring(x, x + 1);

        }

    }
    public void llenar_est(){
     this.estados_car= new String[Estados + 1];
        for (int x = 0; x < Estados; x++) {
            this.estados_car[x]="S"+x;
        }
    
    
    }
    
    public boolean ver_existencia(String b)
    {int x=0;
    String a;
    
        do {
            if(x>=cadena_car.length){return false;}
           a=this.caracteres[x];
        x++;
        }while(!a.equals(b));
        if(a.equals(b)){return true;}
        
    return false;
    
    }
    
    
public boolean Evaluar(int pos)
{   
   
   if(ver_existencia(this.cadena_car[pos])){
        int y=0;
        
    do{
    y++;
    
    }while(!this.caracteres[y-1].equals(this.cadena_car[pos]));
    
    if(!this.matriz[pos_X][y].equals("E"))
    {
     int x=0;
    do{
    if(x>this.estados_car.length){return false;}
    x++;
    }while(!this.matriz[pos_X][y].equals(this.estados_car[x-1]));
    
    this.pos_X=x;
    return true;
    
    }
    
    else{return false;}
   }
   return false;
}
 public void Evaluar2(int a)
 {
 if(a<this.cadena_car.length){
    if(Evaluar(a))
     {
     
     a++;
     Evaluar2(a);
         
     }
    else{System.out.println("Cadena no valida");}}
 else
 {
     System.out.println(pos_X);
 if(this.matriz[pos_X][no_car+1]=="A"){
     System.out.println("cadena valida");}
 else{System.out.println("Cadena no valida") ;}
 
 
 }

 
 }


public void cadena_caracteres(String cad)
{
    this.cadena_car=new String [cad.length()];
    
    for(int x=0;x<cad.length();x++)
    {
    this.cadena_car[x]=cad.substring(x, x+1);
       
    }
    
}

    

    public void llenar_matriz() {
        for (int x = 1; x <= Estados; x++) {
            int x1 = x - 1;
            this.matriz[x][0] = "S" + x1;
        }
        for (int y = 1; y <= no_car; y++) {
            this.matriz[0][y] = this.caracteres[y - 1];
        }
    this.matriz[0][0] = "Est/Σ";
        Scanner grimaldo = new Scanner(System.in);
        for (int x1 = 1; x1 <= Estados; x1++) {
            for (int y1 = 1; y1 <= no_car; y1++) {
                System.out.println("Proporcione el valor de la posicion " + x1 + "," + y1);
                this.matriz[x1][y1] = grimaldo.next().toUpperCase();
            }
        }       
        try{System.out.println("Cuantos estados de aceptacion requiere?");
        int e = grimaldo.nextInt();
        this.matriz[0][no_car + 1] = "E_A";
        for (int ea = 0; ea < e; ea++) {
            System.out.println("Cual es el estado de aceptacion numero " + (ea + 1));
            int ea1 = grimaldo.nextInt();
            this.matriz[ea1 + 1][no_car + 1] = "A";
        }}catch(Exception e){
            System.out.println("Por favor proporcione datos numericos");
        }

    }
    
    

    public void Imprimir() {
        for (int x = 0; x <this. matriz.length; x++) {
            System.out.println();
            for (int y = 0; y < this.matriz[x].length; y++) {

                System.out.print(this.matriz[x][y] + "      ");

            }
            System.out.println("");
        }
    }
    
  
}
