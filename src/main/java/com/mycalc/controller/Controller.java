package com.mycalc.controller;

import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Controller {


    private ScriptEngine engine;
    private boolean checkPoint = false;

    {
        engine = new ScriptEngineManager().getEngineByName("JavaScript");
    }

    @FXML
    private Button butEquals;

    @FXML
    private TextField result;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but1;

    @FXML
    private Button but2;

    @FXML
    private Button but3;

    @FXML
    private Button but4;

    @FXML
    private Button but5;

    @FXML
    private Button but6;

    @FXML
    private Button but7;

    @FXML
    private Button but8;

    @FXML
    private Button but9;

    @FXML
    private Button but0;

    @FXML
    private Button butPlus;

    @FXML
    private Button butMinus;

    @FXML
    private Button butMultiply;

    @FXML
    private Button butClean;

    @FXML
    private Button butDivision;

    @FXML
    private Button comma;

    @FXML
    private Button backSpace;


    @FXML
    void initialize() {

        but0();
        but1();
        but2();
        but3();
        but4();
        but5();
        but6();
        but7();
        but8();
        but9();
        butPlus();
        butEquals();
        butMinus();
        butClean();
        butMultiply();
        butDivision();
        comma();
        backSpace();


    }

    private void but0() {
        but0.setOnAction(e -> {
            String result1 = result.getText();
            if (result1.equals("")) {
                result1 = "0";
                result.setText(result1);

            } else {
                result1 = result1 + "0";
                result.setText(result1);
            }
        });
    }

    private void but1() {
        but1.setOnAction(e -> {
            String result1 = result.getText();
            if (result1.equals("")) {
                result1 = "1";
                result.setText(result1);

            } else {
                result1 = result1 + "1";
                result.setText(result1);
            }
        });
    }

    private void but2() {
        but2.setOnAction(e -> {
            String result1 = result.getText();
            if (result1.equals("")) {
                result1 = "2";
                result.setText(result1);
            } else {
                result1 = result1 + "2";
                result.setText(result1);
            }
        });
    }

    private void but3() {
        but3.setOnAction(e -> {
            String result1 = result.getText();
            if (result1.equals("")) {
                result1 = "3";
            } else {
                result1 = result1 + "3";
            }
            result.setText(result1);
        });
    }

    private void but4() {
        but4.setOnAction(e -> {
            String result1 = result.getText();
            if (result1.equals("")) {
                result1 = "4";
                result.setText(result1);
            } else {
                result1 = result1 + "4";
                result.setText(result1);
            }
        });
    }

    private void but5() {
        but5.setOnAction(e -> {
            String result1 = result.getText();
            if (result1.equals("")) {
                result1 = "5";
                result.setText(result1);
            } else {
                result1 = result1 + "5";
                result.setText(result1);
            }
        });
    }

    private void but6() {
        but6.setOnAction(e -> {
            String result1 = result.getText();
            if (result1.equals("")) {
                result1 = "6";
                result.setText(result1);
            } else {
                result1 = result1 + "6";
                result.setText(result1);
            }
        });
    }

    private void but7() {
        but7.setOnAction(e -> {
            String result1 = result.getText();
            if (result1.equals("")) {
                result1 = "7";
                result.setText(result1);
            } else {
                result1 = result1 + "7";
                result.setText(result1);
            }
        });
    }

    private void but8() {
        but8.setOnAction(e -> {
            String result1 = result.getText();
            if (result1.equals("")) {
                result1 = "8";
                result.setText(result1);
            } else {
                result1 = result1 + "8";
                result.setText(result1);
            }
        });
    }

    private void but9() {
        but9.setOnAction(e -> {
            String result1 = result.getText();
            if (result1.equals("")) {
                result1 = "9";
                result.setText(result1);
            } else {
                result1 = result1 + "9";
                result.setText(result1);
            }
        });
    }

    private void butPlus() {
        butPlus.setOnAction(e -> {
            checkPoint = false;
            String number = result.getText();
            String end = number.substring(number.length() - 1);
            switch (end) {
                case "+":
                    break;
                case "-":
                case "/":
                case "*":
                    end = number.substring(0, number.length() - 1);
                    end = end + "+";
                    result.setText(end);
                    break;
                default:
                    number = number + "+";
                    result.setText(number);
                    break;
            }
        });
    }

    private void butEquals() {
        butEquals.setOnAction(e -> {

            var newResult = result.getText();
            try {
                result.setText(String.valueOf(engine.eval(newResult)));
            } catch (ScriptException scriptException) {
                scriptException.printStackTrace();
            }
        });
    }

    private void butMinus() {
        butMinus.setOnAction(e -> {
            checkPoint = false;
            String number = result.getText();
            String end = number.substring(number.length() - 1);
            switch (end) {
                case "-":
                    break;
                case "+":
                case "/":
                case "*":
                    end = number.substring(0, number.length() - 1);
                    end = end + "-";
                    result.setText(end);
                    break;
                default:
                    number = number + "-";
                    result.setText(number);
                    break;

            }

        });
    }

    private void butClean() {
        butClean.setOnAction(e -> {
            if (e.getSource() == butClean) {
                result.setText("");
            }
        });
    }

    private void butMultiply() {
        butMultiply.setOnAction(e -> {
            checkPoint = false;
            String number = result.getText();
            String end = number.substring(number.length() - 1);
            switch (end) {
                case "*":
                    break;
                case "-":
                case "/":
                case "+":
                    end = number.substring(0, number.length() - 1);
                    end = end + "*";
                    result.setText(end);
                    break;
                default:
                    number = number + "*";
                    result.setText(number);
                    break;
            }
        });
    }

    private void butDivision() {
        butDivision.setOnAction(e -> {
            checkPoint = false;
            String number = result.getText();
            String end = number.substring(number.length() - 1);
            switch (end) {
                case "/":
                    break;
                case "+":
                case "-":
                case "*":
                    end = number.substring(0, number.length() - 1);
                    end = end + "/";
                    result.setText(end);
                    break;
                default:
                    number = number + "/";
                    result.setText(number);
                    break;
            }
        });
    }

    private void comma() {
        comma.setOnAction(e -> {
            String[] numbers = result.getText().split("[+/*-]");
            if (Arrays.stream(numbers).filter(y -> y.contains(".")).count() == numbers.length) {
                checkPoint = true;
            } else checkPoint = false;

            String sign = result.getText();

            if (!checkPoint) {
                String end = sign.substring(sign.length() - 1);
                switch (end) {
                    case "+":
                    case "-":
                    case "/":
                    case "*":
                    case ".":
                        break;
                    default:
                        if (!checkPoint) {
                            sign = sign + ".";
                            result.setText(sign);
                        }
                        checkPoint = true;
                        break;
                }
            }

        });
    }

    private void backSpace() {
        backSpace.setOnAction(e -> {
            String result1;
            StringBuilder stringBuilder = new StringBuilder(result.getText());
            stringBuilder.deleteCharAt(result.getText().length() - 1);
            result1 = stringBuilder.toString();
            result.setText(result1);
        });
    }

}


