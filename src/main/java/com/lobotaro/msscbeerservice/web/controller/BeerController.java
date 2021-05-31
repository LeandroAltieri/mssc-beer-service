package com.lobotaro.msscbeerservice.web.controller;


import com.lobotaro.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping({"/{beerId}"})
    public ResponseEntity getBeerById(@PathVariable("beerId") Long beerId){
        //TODO - implement
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity newBeer(@RequestBody BeerDto beerDto){
        //TODO -  implement
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity updateBeerById(@PathVariable("beerId")Long id, @RequestBody BeerDto beerDto ){
        //TODO - Implement
        return new ResponseEntity(HttpStatus.OK);
    }
}
