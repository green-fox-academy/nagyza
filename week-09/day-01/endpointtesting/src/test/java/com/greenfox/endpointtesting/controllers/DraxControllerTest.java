package com.greenfox.endpointtesting.controllers;

import com.greenfox.endpointtesting.EndpointtestingApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EndpointtestingApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class DraxControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setUp() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void getCalorieTableTest() throws Exception {
    mockMvc.perform(get("/drax"))
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.allFood[0].id").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.allFood[0].name").value("hurka"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.allFood[0].amount").value(2))
            .andExpect(MockMvcResultMatchers.jsonPath("$.allFood[0].calorie").value(1800))
            .andExpect(MockMvcResultMatchers.jsonPath("$.allFood[1].id").value(2))
            .andExpect(MockMvcResultMatchers.jsonPath("$.allFood[1].name").value("kolbasz"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.allFood[1].amount").value(3))
            .andExpect(MockMvcResultMatchers.jsonPath("$.allFood[1].calorie").value(3900));
  }

}