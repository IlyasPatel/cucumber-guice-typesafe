package com.company.my.stepDefinitions;

import com.github.racc.tscg.TypesafeConfig;
import cucumber.api.java.en.Given;
import cucumber.runtime.java.guice.ScenarioScoped;
import io.qameta.allure.Attachment;

@ScenarioScoped
public class OrangeStepDefinition {

    @TypesafeConfig("simple-app.answer")
    private String answer;

    @Given("^I eat an orange$")
    public void i_eat_an_orange() {
        attachment("orange");
    }

    @Attachment(value = "attachment", type = "text/json")
    public String attachment(String str) {
        return str;
    }
}
