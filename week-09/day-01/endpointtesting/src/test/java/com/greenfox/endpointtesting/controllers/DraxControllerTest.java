package com.greenfox.endpointtesting.controllers;

import com.greenfox.endpointtesting.EndpointtestingApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
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
            .andExpect(jsonPath("$.allFood[0].id").value(1))
            .andExpect(jsonPath("$.allFood[0].name").value("hurka"))
            .andExpect(jsonPath("$.allFood[0].amount").value(2))
            .andExpect(jsonPath("$.allFood[0].calorie").value(1800))
            .andExpect(jsonPath("$.allFood[1].id").value(2))
            .andExpect(jsonPath("$.allFood[1].name").value("kolbasz"))
            .andExpect(jsonPath("$.allFood[1].amount").value(3))
            .andExpect(jsonPath("$.allFood[1].calorie").value(3900));
  }

  @Test
  public void addFoodTestWithGoodRequestBody() throws Exception {
    mockMvc.perform(post("/addfood").contentType(MediaType.APPLICATION_JSON)
            .content("{\"name\":\"sonka\",\"amount\":1,\"calorie\":2100}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.name").value("sonka"))
            .andExpect(jsonPath("$.amount").value(1))
            .andExpect(jsonPath("$.calorie").value(2100));
  }
}