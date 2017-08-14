package edu.mum.controller;

import edu.mum.dao.CatagoryRepository;
import edu.mum.domain.Catagory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yentran
 */
@CrossOrigin(origins = "http://localhost:9090/wishlist")
@RestController
@RequestMapping("/catagory")
public class CatagoryRestController implements IController<Catagory> {

    @Autowired
    private CatagoryRepository cRep;

    @Override
    @PostMapping("/")
    public Catagory add(@RequestBody Catagory t) {
        // TODO Auto-generated method stub
        return cRep.save(t);
    }
    
    @PostMapping("/addNLoad")
    public List<Catagory> addNLoad(@RequestBody Catagory t) {
        // TODO Auto-generated method stub
    		cRep.save(t);
        return cRep.findAll();
    }

    @Override
    @PutMapping("/update/{id}")
    public Catagory update(@RequestBody Catagory t, @PathVariable("id") String id) {
        // TODO Auto-generated method stub
        t.setId(id);
        return cRep.save(t);
    }

    @Override
    @DeleteMapping("/detele/{id}")
    public Catagory delete(@RequestBody Catagory t, @PathVariable("id") String id) {
        // TODO Auto-generated method stub
        cRep.deleteById(id);
        return t;
    }

    @Override
    @GetMapping("/all")
    public List<Catagory> getAll() {
        // TODO Auto-generated method stub
        return cRep.findAll();
    }

    @Override
    @GetMapping("/get/{id}")
    public Catagory get(@PathVariable("id") String id) {
        // TODO Auto-generated method stub
        return cRep.findById(id);
    }

}
