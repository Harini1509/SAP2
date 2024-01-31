package main.java;

import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;
import org.junit.runner.JUnitCore;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class TestRunner {
	public static void main(String[] args) {
	      org.junit.runner.Result result = JUnitCore.runClasses(junit.class);

	      for (org.junit.runner.notification.Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }

}
