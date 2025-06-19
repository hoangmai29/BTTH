package com.example.cicd_bt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return """
            <html>
                <head>
                    <title>Trang chủ</title>
                    <style>
                        body {
                            background-color: #f0f8ff;
                            text-align: center;
                            padding-top: 100px;
                            font-family: Arial, sans-serif;
                        }
                        a.button {
                            display: inline-block;
                            padding: 10px 20px;
                            font-size: 16px;
                            background-color: #4CAF50;
                            color: white;
                            text-decoration: none;
                            border-radius: 5px;
                            margin-top: 20px;
                        }
                    </style>
                </head>
                <body>
                    <h1>Trang chủ</h1>
                    <a href="/hello" class="button">Chuyển đến trang Hello</a>
                </body>
            </html>
        """;
    }

    @GetMapping("/hello")
    public String hello() {
        return """
            <html>
                <head>
                    <title>Hello</title>
                    <style>
                        body {
                            background-color: #ffefd5;
                            text-align: center;
                            padding-top: 100px;
                            font-family: Arial, sans-serif;
                        }
                        a.button {
                            display: inline-block;
                            padding: 10px 20px;
                            font-size: 16px;
                            background-color: #008CBA;
                            color: white;
                            text-decoration: none;
                            border-radius: 5px;
                            margin-top: 20px;
                        }
                    </style>
                </head>
                <body>
                    <h1>Hello</h1>
                    <a href="/" class="button">Quay lại trang chủ</a>
                </body>
            </html>
        """;
    }
}

