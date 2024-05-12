

public class GenericsPractice<T> {

    public void saidSomething(T variableName) {
        System.out.println(variableName);

    }

    public T setSomething(){
        return  null;
    }

    public static void main(String[] args) {
        GenericsPractice<String> genericsPractice = new GenericsPractice<>();
        genericsPractice.saidSomething("Subash");
    }

}
