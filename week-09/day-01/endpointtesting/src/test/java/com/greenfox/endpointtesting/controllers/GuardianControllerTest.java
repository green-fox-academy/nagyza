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
public class GuardianControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void grootResponseWithRequestParam() throws Exception {
    mockMvc.perform(get("/groot?message=somemessage"))
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.received").value("somemessage"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.translated").value("I am Groot!"));
  }

  @Test
  public void grootResponseWithoutRequestParam() throws Exception {
    mockMvc.perform(get("/groot"))
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.error").value("I am Groot!"));
  }
}