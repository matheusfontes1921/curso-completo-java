public class Empregado {
    private String nome;
    private int id;
    private double salary;

    public Empregado(String nome, int id, double salary) {
        this.nome = nome;
        this.id = id;
        this.salary = salary;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double increaseSalary(double percent) {
        this.salary+=salary*(percent/100);
        return salary;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nId: " + id + "\nSalário: " + salary;
    }
}
