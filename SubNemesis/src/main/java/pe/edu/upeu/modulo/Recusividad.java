package pe.edu.upeu.modulo;

public class Recursividad{
  
  public int factorial(int n){
    if(n>1){
      return factotial(n-1)*n;
    }
    return 1;
}

}