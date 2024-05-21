public class Horista extends Empregado{
    private double horas;

    // Construtor
    public Horista(double n, String e, double h) {
}

// mmetodos de acesso
   public void set_horas (double h) {
    horas = h;
   }

   public double get_horas() {
    return horas;
   }

   public void calcularSalario() {
    salario = horas * 50;
   }
}
