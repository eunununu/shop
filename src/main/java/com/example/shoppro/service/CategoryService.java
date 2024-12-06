package com.example.shoppro.service;

<<<<<<< HEAD

import com.example.shoppro.dto.CategoryDTO;
import com.example.shoppro.entity.Cart;
import com.example.shoppro.entity.Category;
=======
>>>>>>> ed2b8e65912c81fd6596945bde5e9b8c04f050d7
import com.example.shoppro.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
<<<<<<< HEAD
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

=======
import org.springframework.stereotype.Service;

>>>>>>> ed2b8e65912c81fd6596945bde5e9b8c04f050d7
@Service
@Log4j2
@Transactional
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
<<<<<<< HEAD

    private final ModelMapper modelMapper;


    public void saveca(CategoryDTO categoryDTO){

        Category category = modelMapper.map(categoryDTO, Category.class);

        categoryRepository.save(category);


    }
    public List<CategoryDTO> list (){

         return categoryRepository.findAll().stream().map(category ->
                 modelMapper.map(category , CategoryDTO.class)
         ).collect(Collectors.toList());

    }






=======
>>>>>>> ed2b8e65912c81fd6596945bde5e9b8c04f050d7
}
