
package herencia.ejercicio1;

public class Administrativo extends Persona{
        private String cargo;
        private String dependencia;
        private int salario;
        public Administrativo (int id, String nombre, int edad, String cargo, String dependencia, int salario){
            super(id,nombre, edad);
            this.cargo=cargo;
            this.dependencia= dependencia;
            this.salario= salario;
        }
        @Override
        public String toString() {
            return "Administrativo " + "cargo=" + cargo + ", dependencia=" + dependencia + ", salario=" + salario;
        }
        @Override
        public int calcularSalario(){
            int ValorPagar = salario - (salario*12/100);
            return ValorPagar;
        }
        public void mostrarInformacion() {
        System.out.println(this.toString());
    }
}

