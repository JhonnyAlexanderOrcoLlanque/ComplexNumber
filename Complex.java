/*
PRACTICA 1 INGENIERIA DE SOFTWARE
OPERACIÓN DE NUMEROS COMPLEJOS
@autor Jhonny Alexander Orco Llanque
@autor Felix Maturano Zarate
@autor German Basualdo Rengifo
@version 1.0
@date 07/03/2024
*/

class Complex
{
    double real;
    double imaginario;


    Complex(double _real, double _imaginario)
    {
        this.real = _real;
        this.imaginario = _imaginario;
    }
    
    Complex addition(Complex otro) {
        return new Complex(real + otro.real, imaginario + otro.imaginario);
    }
  
    Complex substraction(Complex otro) {
        return new Complex(real - otro.real, imaginario - otro.imaginario);
    }
  
    Complex multiplication(Complex otro) {
        double r = real * otro.real - imaginario * otro.imaginario;
        double i = real * otro.imaginario + imaginario * otro.real;
        return new Complex(r, i);
    }
  
    Complex division(Complex otro) {
        double divisor = otro.real * otro.real + otro.imaginario * otro.imaginario;
        double r = (real * otro.real + imaginario * otro.imaginario) / divisor;
        double i = (imaginario * otro.real - real * otro.imaginario) / divisor;
        return new Complex(r, i);
    }
    
    
    @Override
    public String toString() {
        if (imaginario >= 0) {
            return real + " + " + imaginario + "i";
        } else {
            return real + " - " + (-imaginario) + "i";
        }
    }

    public static void main(String[] args) {

        
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, -1);
        
        System.out.println("Complejo1: " + c1.toString());
        System.out.println("Complejo2: " + c2.toString());
        System.out.println("Suma: " + c1.sumar(c2));
        System.out.println("Resta: " + c1.restar(c2));
        System.out.println("Multiplicacion: " + c1.multiplicar(c2));
        System.out.println("Division: " + c1.dividir(c2));
    }
}