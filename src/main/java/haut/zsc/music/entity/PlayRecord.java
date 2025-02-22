package haut.zsc.music.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PlayRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer playId;
	private int userId;
	private int songId;
}
