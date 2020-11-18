package com.datastructuresandalgorithms.deepdiveusingjava.challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class StackChallenge {
    //Using Stack to implement palindrome

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string literal:");
        String string = scanner.nextLine();

        String literal = string.replaceAll("\\W", "");
        String [] literalCharacters = literal.split("");

        LinkedList<String> stringLiteral = new LinkedList<>();

        for(String s : literalCharacters)
        {
           stringLiteral.push(s);
        }

        StringBuilder builder = new StringBuilder();

        while(!stringLiteral.isEmpty())
        {
            builder.append(stringLiteral.peek());
            stringLiteral.pop();
        }

        if(builder.toString().equalsIgnoreCase(literal))
        {
            System.out.println(string + "(" + builder + ")" + " is a palindrome");
        }
        else
        {
            System.out.println(string + " is not a palindrome");
        }

    }
}
