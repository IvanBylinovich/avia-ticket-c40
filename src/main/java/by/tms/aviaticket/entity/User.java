package by.tms.aviaticket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends Passenger {
    private long id;
    private String email;
    private String username;
    private String password;
    private int miles;
    private int flightCount;
    private List<Order> orderList;
}
