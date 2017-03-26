package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Maxim_Ozarovskiy on 03.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utils.addMockBooks();
        Utils.renderMenu(Menu.MAIN_MENU);
        int point = scanner.nextInt();
        Utils.eventProcessor(point -1,Menu.EVENT_TYPES_MAIN_MENU);
    }

}
