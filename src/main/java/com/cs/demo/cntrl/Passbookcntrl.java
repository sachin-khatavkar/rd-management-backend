package com.cs.demo.cntrl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cs.demo.entity.Rdpassbook;
import com.cs.demo.pdto.UserPassbookDTO;
import com.cs.demo.repo.Passbookrepo;
import com.cs.demo.service.PassbookService;

@RestController
public class Passbookcntrl {
	@Autowired
	private Passbookrepo prepo;

	@Autowired
	private PassbookService service;
	@GetMapping("/detail/all")
	public List<UserPassbookDTO> getDetaill() {
	return service.getDetaill();
	}
	
	@GetMapping("/puser/{rid}")
	public List<UserPassbookDTO> getUserPassbookDetailByRid(
	        @PathVariable("rid") int rid) {

	    return service.getUserPassbookDetailByRid(rid);
	}


	@GetMapping("/ttl")
    public Map<String, Object> getsummary(){
    	Long total = prepo.getTotalAMT();
    	Map<String,  Object> result = new HashMap<>();
    	result.put("total", total);
    	return result;
    }   

	@GetMapping("/passbookById/{id}")
	public List<Rdpassbook> getPassbook(@PathVariable("id") int rid) {
	    List<Rdpassbook> lst = prepo.getAllByRid(rid); // ✅ yaha rid
	    return lst;
	}
	
	@GetMapping("/detail")
	public List<UserPassbookDTO> getDetail() {
	return prepo.getUserPassbookDetail();
	}
	
	
	 @GetMapping("/rdpassbook")
	 public List<Rdpassbook> pb() {
	        List<Rdpassbook> lst = prepo.findAll();
	        return lst;
	    }
	 
	 @PostMapping("/psave")
	    public Rdpassbook saverd(@RequestBody Rdpassbook p) {
	        return prepo.save(p);
	    }
	 
	 
	 @PutMapping("/pupdt")
	    public Rdpassbook updtrdRd(@RequestBody Rdpassbook p) {
	        return prepo.save(p);
	    }
	 
	   @DeleteMapping("p/dlt/{id}")
	    public Object deleteBig(@PathVariable ("id") int id) {
	    	prepo.deleteById(id);
	    	return "Record Deleted Sucessfullyyyyy....!";   
	    	}
}
	

