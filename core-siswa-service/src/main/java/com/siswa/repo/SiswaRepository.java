package com.siswa.repo;

import com.siswa.entity.Siswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiswaRepository extends JpaRepository<Siswa, Long> {

    Siswa findSiswaByNim(String nim);
}
