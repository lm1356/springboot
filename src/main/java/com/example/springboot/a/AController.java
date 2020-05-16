package com.example.springboot.a;

import org.springframework.stereotype.Controller;

@Controller
public class AController {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < arr.length; i++) {
            for (int i1 : arr[1]) {
                System.out.println(i1);
            }
        }
    }
}
