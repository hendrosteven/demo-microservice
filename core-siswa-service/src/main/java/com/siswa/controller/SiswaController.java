package com.siswa.controller;


import com.siswa.entity.Siswa;
import com.siswa.repo.SiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/siswa")
public class SiswaController {

    @Autowired
    private SiswaRepository siswaRepository;

    @PostMapping
    public Siswa saveSiswa(@RequestBody Siswa siswa){
        return siswaRepository.save(siswa);
    }

    @GetMapping
    public List<Siswa> getAll(){
        return siswaRepository.findAll();
    }

    @GetMapping("/{nim}")
    public Siswa findByNim(@PathVariable("nim") String nim){
        return siswaRepository.findSiswaByNim(nim);
    }
}
