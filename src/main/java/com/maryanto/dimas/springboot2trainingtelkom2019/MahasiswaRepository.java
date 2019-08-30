package com.maryanto.dimas.springboot2trainingtelkom2019;

import com.maryanto.dimas.springboot2trainingtelkom2019.model.Mahasiswa;
import org.springframework.data.repository.CrudRepository;

public interface MahasiswaRepository extends CrudRepository<Mahasiswa, Integer> {
}
