/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Locale;

/**
 *
 * @author HP
 */
public class Model {

    static validation.Validate check = new validation.Validate();

    public void menu() {

        Locale localeVi = new Locale("vietnam");
        Locale localeEn = new Locale("englisg");
        System.out.println("1. English");
        System.out.println("2. Vietnamese");
        System.out.println("3. Exit");
        System.out.println("please choice 1 option: ");
        int choice = check.getInt(localeEn, 1, 3);

        switch (choice) {
            case 1:
                runTPBank(localeEn);
                break;
            case 2:
                runTPBank(localeVi);
                break;
            case 3:
                return;
        }

    }

    public void runTPBank(Locale locale) {
        check.getAccount(locale);
        check.getPassword(locale);
        check.getCaptcha(locale);
    }
}
