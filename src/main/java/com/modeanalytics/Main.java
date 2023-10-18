package com.modeanalytics;

import com.google.common.io.Resources;
import org.graalvm.polyglot.Source;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        var resource = Resources.getResource("test.js");
        System.out.println("Loading Javascript from " + resource);
        Source.newBuilder("js", resource).mimeType("application/javascript").build();
    }
}
