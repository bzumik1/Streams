package main;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //requiredArgsConstructor, getters, setters, toString, EqualsAndHashCode
@AllArgsConstructor
public class Contact {
    private int id;
    private String name;
    private String number;

}
