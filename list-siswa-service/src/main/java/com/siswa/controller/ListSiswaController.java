package com.siswa.controller;

import com.siswa.dto.Siswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest/listsiswa")
public class ListSiswaController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping
    public List<String> findAllSiswa(){
        ResponseEntity<List<Siswa>> response = restTemplate
                .exchange("http://siswa-service/rest/siswa",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Siswa>>(){});

        List<Siswa> siswas = response.getBody();
        List<String> output = siswas.stream().map(siswa->{
           return siswa.getNama();
        }).collect(Collectors.toList());

        return output;
    }
}
