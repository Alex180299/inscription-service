package com.api.inscriptionsservice.service;

import com.api.inscriptionsservice.model.School;
import com.api.inscriptionsservice.model.State;
import com.api.inscriptionsservice.model.Student;
import com.api.inscriptionsservice.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class InscriptionServiceImplTest {

    @Mock
    StudentRepository studentRepository;

    @InjectMocks
    InscriptionServiceImpl service;

    List<Student> studentList;

    @BeforeEach
    void setUp(){
        studentList = new ArrayList<>();
        studentList.add(new Student(null, "Alex", "alex@gmail.com", 21, new School(null, "School 1", "www.school.com", new State(null, "State 1", "MX", "ST"))));
        studentList.add(new Student(null, "Joel", "joel@gmail.com", 22, new School(null, "School 1", "www.school.com", new State(null, "State 1", "MX", "ST"))));
    }

    @Test
    public void getAllStudents(){
        //when(studentRepository.findAll()).thenReturn(studentList);
        given(studentRepository.findAll()).willReturn(studentList);

        assertThat(service.findAllStudents().size()).isNotZero().isEqualTo(2);

        then(studentRepository).should().findAll();
        then(studentRepository).shouldHaveNoMoreInteractions();
    }

    @Test
    public void getStudent(){
        given(studentRepository.findById(anyLong())).willReturn(Optional.of(studentList.get(0)));

        assertThat(service.findStudentById(1L)).isNotNull().isEqualToComparingFieldByField(new Student(null, "Alex", "alex@gmail.com", 21, new School(null, "School 1", "www.school.com", new State(null, "State 1", "MX", "ST"))));
    }

    @Test
    public void deleteStudent(){
        //given
        Student student = new Student();

        //when
        service.delete(student);
        service.delete(student);

        //then
        then(studentRepository).should(atLeastOnce()).delete(any(Student.class));
        //verify(studentRepository).delete(any(Student.class));
    }

    @Test
    public void deleteStudentException(){
        Student student = new Student();

        doThrow(new RuntimeException("Boom")).when(studentRepository).delete(any(Student.class));
        assertThrows(RuntimeException.class, () -> {
            studentRepository.delete(student);
        });

        service.delete(student);
    }

}