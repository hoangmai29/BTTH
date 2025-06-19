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
                            text-decoration: none;
                        }
                        .button:hover {
                            background-color: #45a049;
                        }
                    </style>
                </head>
                <body>
                    <h1>Chào mừng bạn đến với công ty TNHH một thành viên của MNH</h1>
                    <a class="button" href="/about">OK</a>
                </body>
            </html>
        """;
    }

    @GetMapping("/about")
    public String aboutPage() {
        return """
            <html>
                <head>
                    <title>Giới thiệu công ty</title>
                    <style>
                        body {
                            background: #fefbd8;
                            color: #333;
                            font-family: 'Segoe UI', sans-serif;
                            padding: 50px;
                            line-height: 1.6;
                        }
                        h2 {
                            color: #2e8b57;
                        }
                        a.back-button {
                            display: inline-block;
                            margin-top: 20px;
                            padding: 10px 20px;
                            background-color: #2196F3;
                            color: white;
                            text-decoration: none;
                            border-radius: 5px;
                        }
                        a.back-button:hover {
                            background-color: #0b7dda;
                        }
                    </style>
                </head>
                <body>
                    <h2>Giới thiệu về công ty TNHH một thành viên của MNH</h2>
                    <p>
                        Công ty TNHH một thành viên của MNH được thành lập với sứ mệnh mang đến giải pháp công nghệ tiên tiến,
                        dịch vụ chất lượng cao và sự hài lòng cho khách hàng. Chúng tôi hoạt động trong lĩnh vực phần mềm, giải pháp số
                        và dịch vụ CNTT, với đội ngũ nhân sự giàu kinh nghiệm và nhiệt huyết.
                    </p>
                    <p>
                        Tầm nhìn của chúng tôi là trở thành đối tác tin cậy trong hành trình chuyển đổi số của các doanh nghiệp,
                        không ngừng đổi mới và phát triển vì sự thành công của khách hàng.
                    </p>
                    <a href="/" class="back-button">Quay lại trang chủ</a>
                </body>
            </html>
        """;
    }
}
