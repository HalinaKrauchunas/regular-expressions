package com.epam.projects;

import java.io.InputStream;
import java.util.Scanner;

public class InputStreamReader {

    private final InputStream inputStream;

    public InputStreamReader(InputStream in) {

        this.inputStream = in;
    }

    public String readLine() {

        Scanner scanner = new Scanner(this.inputStream);
        return scanner.nextLine();
    }
}