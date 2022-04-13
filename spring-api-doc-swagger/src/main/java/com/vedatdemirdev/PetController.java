package com.vedatdemirdev;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pet")
@Api(value = "My Pet API documentary")
public class PetController {

    List<Pet> pets = new ArrayList<>();

    @PostConstruct
    public void init(){
        pets.add(new Pet(1,"Test Pet",new Date()));
    }

    @PostMapping
    @ApiOperation(value = "Adding new Pet Method",notes = "Be Carefull!!")
    public ResponseEntity<Pet> save(@RequestBody @ApiParam(value = "animal") Pet pet){
        pets.add(pet);
        return ResponseEntity.ok(pet);
    }

    @GetMapping
    @ApiOperation(value = "Listing all Pets Method",notes = "This method paging")
    public ResponseEntity<List<Pet>> listAll(Pet pet){
        return ResponseEntity.ok(pets);
    }
}
