package com.eg.arabic.search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.eg.arabic.search.model.Employee;
import com.eg.arabic.search.repository.EmployeeRepository;
import com.eg.arabic.search.utility.ArabicNameGenerator;
import com.eg.arabic.search.utility.ArabicNormalizer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class EmployeeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private EmployeeRepository employeeRepository;

    @Test
    public void testAddEmployees() throws Exception {
        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            Employee employee = new Employee();
            employee.setFirstName(ArabicNameGenerator.generateFirstName());
            employee.setLastName(ArabicNameGenerator.generateLastName());
            employee.setFullName(employee.getFirstName() + " " + employee.getLastName());
            employee.setAge(20 + i);
            employee.setNameNormalize(new ArabicNormalizer(employee.getFullName()).getOutput());
            employees.add(employee);
        }

        when(employeeRepository.saveAll(any())).thenReturn(employees);

        MvcResult result = mockMvc.perform(post("/employees/save/all")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(employees)))
                .andExpect(status().isOk())
                .andReturn();

        String responseBody = result.getResponse().getContentAsString();
        System.out.println("responseBody : " + responseBody);
        List<Employee> savedEmployees = objectMapper.readValue(responseBody, new TypeReference<List<Employee>>() {});

        assertEquals(50, savedEmployees.size());
    }
}

