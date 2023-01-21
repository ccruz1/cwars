package org.example;

import java.util.ArrayList;

public class solution {

    static ArrayList<Character> parentheses = new ArrayList<>();

    public static boolean validParentheses(String parens)
    {
        //Initialization
        boolean result = false;

        if (parens.contains("(") || parens.contains(")")) {

            //Extracting parentheses from string
            for(int i = 0; i < parens.length(); i++)
            {
                char c = parens.charAt(i);
                if(c == '(' || c == ')' ){
                    parentheses.add(c);
                }
            }

            //Si el ArrayList tiene un size() PAR
            if(parentheses.size() % 2 == 0){

                while(parentheses.size() > 2) {

                    System.out.println(parentheses);
                    //Iterate over to delete "()"
                    for (int i = 0; i < parentheses.size(); i++) {
                        if (i == parentheses.size() - 1) {
                            break;
                        } else {
                            //Actual index
                            char x = parentheses.get(i);
                            //Next index
                            char y = parentheses.get(i + 1);

                            if (x == '(' && y == ')') {
                                System.out.println(x);
                                System.out.println(y);

                                parentheses.remove(i);
                                parentheses.remove(i);

                                break;
                            }
                            System.out.println(parentheses);
                        }
                    }
                }

                if (parentheses.get(0) == '(' && parentheses.get(1) == ')'){
                    result = true;
                }
                System.out.println(parentheses);

            }
        }else{
            result = true;
        }

        return result;
    }
}