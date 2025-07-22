public class Persona{
    int edad;
    int estatura;
    int peso;
    char genero;
    // Se denota con '   '
    String nacionalidad;
    // Se denota con "  "
    int energia;
    String nombre;
    //Metodo constructor-
    Persona(int edad, int estatura, int peso, char genero, String nacionalidad, int prueba, String nombre){
        //A la variable global le asigno el atributo que doy al atributo en "Princiapl", por eso se usa this
        this.edad=edad;
        this.estatura=estatura;
        this.peso=peso;
        this.genero=genero;
        this.nacionalidad=nacionalidad;
        this.energia=prueba;
        this.nombre=nombre;
    }
    public void dormir (){
        System.out.println("La persona"+ nombre + "esta durmiendo, por favor silencio");
        energia=energia+10;
        System.out.println("La nueva energia de "+nombre+" es "+ energia);
    }
    public void dormir (int a){
        System.out.println("La persona"+ nombre + "esta durmiendo, por favor silencio");
        energia=energia+a;
        System.out.println("La nueva energia de "+nombre+" es "+ energia);
    }
    public void embriagarse (){
        System.out.println("La persona esta embriagandose");
        if (energia>=20){
            energia=energia-20;
        }else{
            energia=0;
        }if(energia<=0){
            System.out.println(nombre +"llamo al ex");
        }
        System.out.println("La enewrgia que le queda es: "+ energia);
    }
    public void comer (){
        System.out.println("La persona esta comiendo");
    }
    public void respirar(){
        System.out.println("La persona esta respirando");
    }
    public int getEdad(){
        return edad;
    }
}