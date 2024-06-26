package paquete2;

public class EstudianteDistancia extends Estudiante{
    /*
    aqui hay un error por que en la super clase  hay un constructor que envia cuantro parametos
    3 cadenas y un entero para que se quiete el error se crea un constructor con las mismas
    variables
    */
    private int numeroAsignaturas;
    private double costoAsignatura;
    private double matriculaDistancia;

    public EstudianteDistancia(String n, String a, String iden, int ed) {
        super(n, a, iden, ed);
    }
    
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaDistancia(){
        matriculaDistancia = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsignatura;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaDistancia(){
        return matriculaDistancia;
    }

}
