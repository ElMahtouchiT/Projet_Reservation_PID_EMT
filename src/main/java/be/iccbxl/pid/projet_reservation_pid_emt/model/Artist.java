package be.iccbxl.pid.projet_reservation_pid_emt.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Entity
@Table(name="artists")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@ToString
public class Artist {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;

}
