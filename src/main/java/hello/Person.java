package hello;

import javax.validation.constraints.*;

public class Person {

    @NotNull
    @Size(min=2, max=30)
    private String name;

    @NotNull
    @Min(18)
    @Max(20)
    private Integer age;

    @NotNull
    @Pattern(regexp = ("\\d{3}.\\d{3}.\\d{3}-\\d{2}"), message="deve corresponder à xxx.xxx.xxx-xx")
    private String cpf;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }

}