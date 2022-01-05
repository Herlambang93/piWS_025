/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass.a.pws.ass.a.pws;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author Muhammad Herlambang
 */
@Entity
@Table(name="guccistore")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GucciStore {
    @Id
    private Long idbarang;
    private String jenis_barang;    
    private int harga_barang;

   
    
}
