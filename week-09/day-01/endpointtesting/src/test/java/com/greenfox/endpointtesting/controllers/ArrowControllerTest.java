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
public class ArrowControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setUp() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void yonduResponseWithSpeedAndTimeParams() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.speed").value(10));
  }

  @Test
  public void yonduResponseWithNoParams() throws Exception {
    mockMvc.perform(get("/yondu"))
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.error").value("Hello! There where no parameters!"));
  }
}