package OperatingSystem;

import java.util.*;
public class SRTF {
    public static ArrayList<Process> table  = new ArrayList<>();
    public static ArrayList<Process> ganttC = new ArrayList<>();
    public static ArrayList<Process> curr = new ArrayList<>();
    public static ArrayList<Process> newTable = new ArrayList<>();
    public static ArrayList<Integer> bust = new ArrayList<>();
    
    public static class Process{
        int at, bt, ct, tat, wt, rt;
        public Process(int at, int bt){
            this.at = at;
            this.bt = bt;
            table.add(this);
            newTable.add(this);
            bust.add(bt);
        }
    }
    
    public static void print(){
        System.out.println("Pno \t AT \t BT \t CT \t TAT \t WT \t RT");
        for(int i=0; i<newTable.size(); i++){
            System.out.println((i+1)+" \t "+newTable.get(i).at+" \t " +newTable.get(i).bt+" \t "
            +newTable.get(i).ct+" \t "
            +newTable.get(i).tat+" \t "
            +newTable.get(i).wt+" \t "
            +newTable.get(i).rt);
        }

        for (int i = 0; i < ganttC.size(); i++) {
            if(ganttC.get(i) == null) System.out.print("null"+" ");
            else System.out.print(ganttC.get(i).at+" ");
        }
    }
    
    public static int findMin(ArrayList<Process> curr){
        int minIdx=0;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<curr.size(); i++){
            if(min > curr.get(i).bt){
                min = curr.get(i).bt;
                minIdx = i;
            }
        }
        return minIdx;
    }
    
    public static void main(String args[]) { 
        // Process p1 = new Process(4,4); // this example is with gaps 
        // Process p2 = new Process(7,3);
        // Process p3 = new Process(6,2);
        // Process p4 = new Process(2,8);
        // Process p5 = new Process(5,1);
        // Process p6 = new Process(3,6);

        // Process p1 = new Process(0 ,8); // this is without gaps
        // Process p2 = new Process(1 ,4);
        // Process p3 = new Process(2 ,2);
        // Process p4 = new Process(3 ,1);
        // Process p5 = new Process(4 ,3);
        // Process p6 = new Process(5 ,2);

        int time = 0;
        while(table.size() != 0){
            // time tak jitni process ayi vo dali curr me
            for(int i=0; i<table.size(); i++){
                Process now = table.get(i);
                if(now.at <= time){
                    curr.add(now);
                    table.remove(now);
                }
            }
        
            //curr mese min dali gantchart me
            if(curr.size() == 0){           // add this condition later on for resolving gaps 
                time++;
                ganttC.add(null);
                continue;
            }
            int idx = findMin(curr);
            ganttC.add(curr.get(idx));
            curr.get(idx).bt--;
            time++;
            if(curr.get(idx).bt == 0){
                curr.remove(curr.get(idx));
            }
        }
        
        //sari process aa gayi sort karke addting to ganttC
        while(curr.size() != 0){
            int i = findMin(curr);
            time++; 
            curr.get(i).bt--;
            ganttC.add(curr.get(i));
            if(curr.get(i).bt == 0) curr.remove(i);
        }
        
        for(int i=0; i<newTable.size(); i++){
          for(int j=ganttC.size()-1; j>=0; j--){
            if(ganttC.get(j) == newTable.get(i)){
                newTable.get(i).bt = bust.get(i);
                newTable.get(i).ct = j+1;
                newTable.get(i).tat = newTable.get(i).ct - newTable.get(i).at;
                newTable.get(i).wt = newTable.get(i).tat - newTable.get(i).bt;
                break;
            }
          }
        }
        
        for(int i=0; i<newTable.size(); i++){
          for(int j=0; j<ganttC.size(); j++){
            if(ganttC.get(j) == newTable.get(i)){
                newTable.get(i).rt = j-newTable.get(i).at;
                break;
            }
          }
        }
        print();
    } 
}