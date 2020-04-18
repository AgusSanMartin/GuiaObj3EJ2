package com.company;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
	Estudiante E1 = new Estudiante("39.170.571",
            "Agustin",
            "San Martin",
            "agus.sanmartin95@gmail.com",
            "San Lorenzo 3728",
            "2016",
            1000,
            "Tecnicatura universitaria en programacion");
        Estudiante E2 = new Estudiante("41.160.342",
                "Jose",
                "Gutierrez",
                "jose.guti@gmail.com",
                "Pampa 2243",
                "2018",
                2500,
                "Tecnicatura universitaria en Interiorismo");
        Estudiante E3 = new Estudiante("42.973.368",
                "Martin",
                "Sanchez",
                "mar.sanchez@gmail.com",
                "Independencia 1450",
                "2020",
                2300,
                "Tecnicatura universitaria en programacion");
        Estudiante E4 = new Estudiante("40.200.185",
                "Gaston",
                "Sabia",
                "gaston.sabia@gmail.com",
                "Dorrego 2857",
                "2019",
                1500,
                "Ingenieria en Sistemas");
        Staff S1 = new Staff("35.345.184",
                "Ramon",
                "Lucero",
                "Ramon.Lucero@gmail.com",
                "Salta 1543",
                24000,
                true);
        Staff S2 = new Staff("36.678.389",
                "Micaela",
                "dominguez",
                "mica.dominguez@gmail.com",
                "Av.Jara 3224",
                27000,
                false);
        Staff S3 = new Staff("38.173.335",
                "Cristian",
                "Raban",
                "cristian.raban@gmail.com",
                "La rioja 3245",
                23000,
                true);
        Staff S4 = new Staff("37.335.212",
                "Pablo",
                "Pugliese",
                "pablo.pugliese@gmail.com",
                "Mitre 1705",
                30000,
                false);

        List<Persona> pList = new ArrayList<Persona>();
        pList.add(E1);
        pList.add(E2);
        pList.add(E3);
        pList.add(E4);
        pList.add(S1);
        pList.add(S2);
        pList.add(S3);
        pList.add(S4);

        int estCant = 0;
        double ingresos = 0;
        int staffCant = 0;
        for (Persona p: pList) {
            if (p instanceof Estudiante ){
                estCant++;
                ingresos = ingresos + ((Estudiante) p).getCuotaMensual();
                //System.out.println(p.toString());
            }else if (p instanceof Staff)
                staffCant++;
            System.out.println(p.toString());
        }
        System.out.printf("\n Cantidad de estudiantes: %d, Cantidad de Staff: %d, Ingresos: %.2f", estCant, staffCant, ingresos);
    }
}
