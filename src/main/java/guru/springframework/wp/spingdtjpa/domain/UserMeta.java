package guru.springframework.wp.spingdtjpa.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "wp_usermeta")
public class UserMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "umeta_id")
    private Long id;
    private Long userId;
    private String metaKey;

    @Lob
    private String metaValue;

}