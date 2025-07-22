public class Principal{
    public static void main (String[]args){
        System.out.println("Esta es mi clase principal y funciona");
        // Creacion del objeto- Puedo crear cualquier cantidad de objetos y asignales los atributos segun corresponda a cada objeto o persona
        Persona lupita = new Persona (5,4,3,'F',"Estadounidense",100," Lupita C. ");
        
        Persona pablo = new Persona (6,8,2,'M',"Estadounidense",50," Pablo H. ");
        lupita.dormir();
        lupita.embriagarse();
        System.out.println("Edad: "+lupita.getEdad());

        pablo.dormir();
        pablo.dormir(80);
        pablo.embriagarse();
        pablo.embriagarse();
        pablo.embriagarse();
        System.out.println("Edad: " +pablo.getEdad());


    }
}