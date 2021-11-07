package class_trening;

/**-------------------------РАСЧЕТ ПЛОЩАДИ И ПЕРИМЕТРА ФИГУР-------------------------**/
abstract class  CalcGeometricShapes{
    double AreaShapes;
    double PerimeterShapes;
    CalcGeometricShapes(){
        AreaShapes = 0;
        PerimeterShapes = 0;
    }
     double Area1() {
        return 0;
    }
}
/**---------------------------------------КРУГ---------------------------------------**/
class CalcCirc extends CalcGeometricShapes{
    /* Вычисление площади круга S = (π * R²) */
    double Area(double radius) {
        AreaShapes = radius * radius * Math.PI;
        return AreaShapes;
    }

    /* Вычисление периметра круга P = (2 * π * R) */
    double Perimeter(double radius) {
        PerimeterShapes = 2 * Math.PI * radius;
        return PerimeterShapes;
    }

}
/**-----------------------------------ПРЯМОУГОЛЬНИК-----------------------------------**/
class CalcRect extends CalcGeometricShapes{
    /* Вычисление площади прямоугольника S = W * H */
    double Area(double width, double length) {
        AreaShapes = length * width;
        return AreaShapes;
    }

    /* Вычисление периметра прямоугольника P = (W + H) * 2 */
    double Perimeter(double width, double length) {
        PerimeterShapes = (length + width) * 2;
        return PerimeterShapes;
    }
}
/**--------------------------------------КВАДРАТ---------------------------------------**/
class CalcSquare extends CalcGeometricShapes{
    /* Вычисление площади квадрата S = L * L */
    double Area(double length_side) {
        AreaShapes = length_side * length_side;
        return AreaShapes;
    }

    /* Вычисление периметра квадрата P = L * 4 */
    double Perimeter(double length_side) {
        PerimeterShapes = length_side * 4;
        return PerimeterShapes;
    }
}
/**-------------------------------------ТРЕУГОЛЬНИК------------------------------------**/
class CalcTriangle extends CalcGeometricShapes{
    /* Вычисление площади треугольника по формуле Герона S = (P(P - A)*(P - B)*(P - C))^0.5
       Где A,B,C - три стороны треугольника.
       Где P = (A + B + C) / 2 - полупериметр треугольника.                                                            */
    double Area(double side_a,double side_b,double side_c) {
        double p;
        p = (side_a + side_b + side_c)/2;
        AreaShapes = Math.sqrt(p * (p - side_a) * (p - side_b) * (p - side_c));
        return AreaShapes;
    }
    /* Вычисление периметра треугольника P = L * 3 */
    double Perimeter(double side_a,double side_b,double side_c) {
        PerimeterShapes = side_a + side_b + side_c;
        return PerimeterShapes;
    }
}


public class Shapes {
    public static void main(String[] args){
        CalcCirc        сalcCirc        = new CalcCirc();
        CalcRect        сalcRect        = new CalcRect();
        CalcSquare      сalcSquare      = new CalcSquare();
        CalcTriangle    сalcTriangle    = new CalcTriangle();

        System.out.println("Площадь круга____________" + сalcCirc.Area(10 ));
        System.out.println("Периметр круга___________" + сalcCirc.Perimeter(10));

        System.out.println("Площадь прямоугольника___" + сalcRect.Area(10 ,10));
        System.out.println("Периметр прямоугольника__" + сalcRect.Perimeter(10,10));

        System.out.println("Площадь квадрата_________" + сalcSquare.Area(10));
        System.out.println("Периметр квадрата________" + сalcSquare.Perimeter(10));

        System.out.println("Площадь треугольника_____" + сalcTriangle.Area(10,10,10));
        System.out.println("Периметр треугольника____" + сalcTriangle.Perimeter(10,10,10));


    }
}

