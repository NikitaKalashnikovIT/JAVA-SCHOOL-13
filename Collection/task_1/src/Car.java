package collection;

import java.util.ArrayList;
//import java.util.*;

class CarDataTable {
    public  String model;
    private String type;


    public CarDataTable (String type,String model){
        this.model = model;
        this.type = type;
    }
    public CarDataTable (){
        this.model = " ";
        this.type = " ";
    }
    @Override
    public String toString(){
    return  model + type;
    }
}

public class Car {
    public static void main(String[] args){
        CarDataTable car[]  = new CarDataTable[17];
        CarDataTable carbuff  = new CarDataTable();

        car[0 ]  = new CarDataTable(" ВАЗ              "," Седан ");
        car[1 ]  = new CarDataTable(" BMW              "," Седан ");
        car[2 ]  = new CarDataTable(" Kia              "," Седан ");
        car[3 ]  = new CarDataTable(" Mitsubishi       "," Универсал ");
        car[4 ]  = new CarDataTable(" Mazda            "," Универсал ");
        car[5 ]  = new CarDataTable(" Mercedes-Benz    "," Хэтчбек ");
        car[6 ]  = new CarDataTable(" ВАЗ              "," Хэтчбек ");
        car[7 ]  = new CarDataTable(" BMW              "," Пикап ");
        car[8 ]  = new CarDataTable(" Kia              "," Внедорожник ");
        car[9 ]  = new CarDataTable(" Mitsubishi       "," Внедорожник ");
        car[10]  = new CarDataTable(" Mercedes-Benz    "," Хэтчбек ");
        car[11]  = new CarDataTable(" Mitsubishi       "," Хэтчбек ");
        car[12]  = new CarDataTable(" Mitsubishi       "," Универсал ");
        car[13]  = new CarDataTable(" Mercedes-Benz    "," Универсал ");
        car[14]  = new CarDataTable(" Mitsubishi       "," Внедорожник ");
        car[15]  = new CarDataTable(" Mitsubishi       "," Внедорожник ");
        car[16]  = new CarDataTable(" Mitsubishi       "," Внедорожник ");

//        ArrayList <CarDataTable> CarSedan = new ArrayList <>();
//        ArrayList <CarDataTable> CarHatchback = new ArrayList <>();
//        ArrayList <CarDataTable> CarStationWagon = new ArrayList <>();
//        ArrayList <CarDataTable> CarOffRoadCar = new ArrayList <>();

        int sorting_index[] = new int [car.length];
        int cnt_processed_type = 0;
        int reference_index = 0;
        for(int j = 0 ;car.length > j;j++) {
            if(cnt_processed_type == car.length - 1) {break;}
            reference_index = cnt_processed_type;
            for (int i = cnt_processed_type; car.length > i; i++) {
                if(car[reference_index].model == car[i].model ){
                    sorting_index[cnt_processed_type]  = i;
                    carbuff = car[cnt_processed_type];
                    car[cnt_processed_type] = car[i];
                    car[i] = carbuff;
                    if(cnt_processed_type == car.length - 1) {break;}
                    cnt_processed_type++;
                }
            }
        }
        for(int j = 0 ;car.length > j;j++) {
            System.out.println(car[j]);
        }
    }
}
