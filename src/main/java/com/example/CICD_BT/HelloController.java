package com.example.cicd_bt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String welcomePage() {
        return """
            <html>
                <head>
                    <title>Chào mừng</title>
                    <style>
                        body {
                            background: linear-gradient(to right, #83a4d4, #b6fbff);
                            color: #333;
                            font-family: Arial, sans-serif;
                            text-align: center;
                            padding-top: 100px;
                        }
                        h1 {
                            font-size: 28px;
                            margin-bottom: 40px;
                        }
                        .button {
                            padding: 12px 25px;
                            font-size: 16px;
                            background-color: #4CAF50;
                            color: white;
                            border: none;
                            border-radius: 5px;
                            cursor: pointer;
                            transition: background-color 0.3s ease;
                        }
                        .button:hover {
                            background-color: #45a049;
                        }
                    </style>
                </head>
                <body>
                    <h1>Chào mừng bạn đến với công ty TNHH một thành viên của MNH</h1>
                    <button class="button" onclick="alert('OK')">OK</button>
                </body>
            </html>
        """;
    }
}


