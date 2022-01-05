package ass.a.pws.ass.a.pws;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Muhammad Herlambang
 */
@CrossOrigin
@RestController
@RequestMapping("/gucci")
public class DBController {
     @Autowired
  private GucciStoreRepo guccistore ;
 
  @GetMapping("/guccistore")
  public List<GucciStore> getAllguccistore(){
      return guccistore.findAll();
  }
   @GetMapping ("/guccistore/{id}")
    public GucciStore getGucciStoreById(@PathVariable Long id){
        return guccistore.findById(id).get();
    }
    
    @PostMapping ("/guccistore")
    public GucciStore saveguccistoreDetails(@RequestBody GucciStore s){
        return guccistore.save(s);
    }
    
    @PutMapping("/guccistore")
    public GucciStore updateOushop(@RequestBody GucciStore s){
        return guccistore.save(s);
    }
    
    @DeleteMapping("/guccistore/{idbarang}")
    public ResponseEntity<HttpStatus> getGucciStoreById(@PathVariable long idbarang){
        guccistore.deleteById(idbarang);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
