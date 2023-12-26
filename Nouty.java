//import java.util.Map;

// import java.util.Objects;

public class Nouty {
    String id_num;
    String name;//название фирмы призводителя
    String memory;//память 
    String op_sys;//опрац сист
    String color;

    public Nouty(String id_num, String name, String memory, String op_sys, String color) {
        this.id_num = id_num;
        this.name = name;
        this.memory = memory;
        this.op_sys = op_sys;
        this.color = color;
    }    
    

    public Nouty() {
    }

    @Override
    public String toString() {
        return '{' +
                "Идентификатор=" + id_num + '\'' +
                ", Модель='" + name + '\'' +
                ", Память=" + memory + '\'' +
                ", Операционная система=" + op_sys + '\'' +
                ", Цвет='" + color + '\'' +
                '}';
    }
     
public String getId() {
    return id_num;
}

public String getName() {
    return name;
}

public String getMemory() {
    return memory;
}

public String getOp_sys() {
    return op_sys;
}

public String getColor() {
    return color;
}

}


    //String.format("Идентификатор: %s, Модель: %s, Память: %s, Операционная система: %s, Цвет: %s.", id_num, name, memory, op_sys,color);
    

//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//             Nouty that = (Nouty) o;
//     return this.name == that.name && this.id_num == that.id_num;
// }
//     @Override
//     public int hashCode() {
//         return Objects.hash(id_num);
// }
