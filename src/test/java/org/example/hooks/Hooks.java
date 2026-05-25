//package org.example.hooks;
//
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//
//public class Hooks {
//
//    // @Before method run before each scenario
//    @Before
//    public void setUp(){
//        System.out.println("browser is launched");
//    }
//
//    // @After method run before each scenario
//    @After
//    public void tearDown(){
//        System.out.println("browser is closed");
//    }
//
////    run only for tagged scenario
//    @Before("@smoke")
//    public void setUpForOnlySmokeTaggedScenario(){
//        System.out.println("setUp For Only Smoke TaggedScenario");
//    }
//
////    run only for tagged scenario
//    @After("@smoke")
//    public void tearDownForOnlySmokeTaggedScenario(){
//        System.out.println("tearDown For Only Smoke TaggedScenario");
//    }
//
//    //    run before each step
//    @BeforeStep
//    public void setUpForEachStep(){
//        System.out.println("setUp For Each Step");
//    }
//
//    //    run after each step
//    @AfterStep
//    public void tearDownForEachStep(){
//        System.out.println("tear Down For Each Step");
//    }
//}
