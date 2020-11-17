import java.util.Scanner;
public class Secuenciales3{
    
    public static void main (String[]args){
        Scanner teclado= new Scanner(System.in);
	String marca;
        int origen;
        double costo;
        double precioVenta;
        double impuesto;
        int porcentaje;
        int perro = 10;
	System.out.println ("Ingrese la marca del vehiculo");
	marca= teclado.nextLine();
        System.out.println ("Seleccione el numero del origen de su auto\n1."
                + "Alemania\n2.Japon\n3.Italia\n4.USA\n5.Otro Pais");
	origen= teclado.nextInt();
        System.out.println ("Ingrese el costo del vehiculo");
	costo= teclado.nextDouble();
	if (origen == 1 ){;
            porcentaje=20;
            impuesto=0;
            precioVenta=0;
            impuesto =(porcentaje * costo /100);
            precioVenta  = costo + impuesto;
        System.out.println("El impuesto por pagar es: "+ impuesto +" y el precio"
                + " de venta es" + precioVenta);
        }
        if (origen == 2){
            porcentaje=30;
            impuesto=0;
            precioVenta=0;
            impuesto =(porcentaje * costo /100);
            precioVenta  = costo + impuesto;
        System.out.println("El impuesto por pagar es: "+ impuesto +" y el precio"
                + " de venta es" + precioVenta);
        }
        if (origen == 3){
            porcentaje=15;
            impuesto=0;
            precioVenta=0;
            impuesto =(porcentaje * costo /100);
            precioVenta  = costo + impuesto;
        System.out.println("El impuesto por pagar es: "+ impuesto +" y el precio"
                + " de venta es" + precioVenta);
        }
        if (origen == 4){
            porcentaje=8;
            impuesto=0;
            precioVenta=0;
            impuesto =(porcentaje * costo /100);
            precioVenta  = costo + impuesto;
        System.out.println("El impuesto por pagar es: "+ impuesto +" y el precio"
                + " de venta es" + precioVenta);
        }
        if (origen == 5){
            impuesto=0;
            precioVenta  = costo + impuesto;
        System.out.println("El impuesto por pagar es: "+ impuesto +" y el precio"
                + " de venta es" + precioVenta);
        }
    }
}