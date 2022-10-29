package org.group12.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KBInput {

    private static BufferedReader getReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

    public static String readString(String prompt) {
        try {
            System.out.print(prompt);
            return getReader().readLine();
        } catch(IOException ioExc) {
            System.err.println(ioExc.getMessage());
            return null;
        }
    }

    public static Integer readInt(String prompt) {
        try {
            System.out.print(prompt);
            return Integer.parseInt(getReader().readLine());
        } catch (IOException ioExc) {
            System.err.println(ioExc.getMessage());
            return null;
        } catch (NumberFormatException nfExc) {
            System.err.println("Input should be a number!");
            System.err.println(nfExc.getMessage());
            return null;
        }
    }
}
