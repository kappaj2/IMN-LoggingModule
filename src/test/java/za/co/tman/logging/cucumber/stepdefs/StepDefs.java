package za.co.tman.logging.cucumber.stepdefs;

import za.co.tman.logging.LoggingmoduleApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = LoggingmoduleApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
