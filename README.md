
---

# 🚀 Portfolio Backend API

![Portfolio Backend](https://img.shields.io/badge/Portfolio-Backend-blue?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7-brightgreen?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-3.8-blue?style=for-the-badge)

---

## 📖 Overview

This is the **backend** for your personal portfolio application.
It provides APIs to:

* Fetch coding profile data from **LeetCode** & **CodeChef**
* Handle contact form emails via **Gmail SMTP**
* Easily integrate with your frontend

> Users can replace their username in the API URLs to map their own coding profiles.

---

## 👤 Author

**Amit Kumar**
📧 [amitkumaramitkumar15351@gmail.com](mailto:amitkumaramitkumar15351@gmail.com)
🌐 [Portfolio](weweupqr.live)

---

## ✨ Features

* 📊 Fetch coding stats from **LeetCode** and **CodeChef**
* 📩 Send emails via **Gmail SMTP**
* ⚡ Ready for deployment on **Render** or any cloud platform
* 🔧 Easily configurable for personal use

---

## 🛠 Tech Stack

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.8-blue)
![SMTP Email](https://img.shields.io/badge/SMTP-Email-red)

---

## 🔗 API Endpoints

### 1️⃣ LeetCode Stats

```text
GET /LeetCode
```

**Usage:**
Replace `youusername` in `application.yml`:

```yaml
ltc:
  api: https://leetscan.vercel.app/youusername
```

Fetches your **LeetCode stats** and makes it accessible to the frontend.

---

### 2️⃣ CodeChef Stats

```text
GET /CodeChef
```

**Usage:**
Replace `youusername` in `application.yml`:

```yaml
codechef:
  api: https://cp-rating-api.vercel.app/codechef/youusername
```

Fetches your **CodeChef profile** & **rating**.

---

### 3️⃣ Contact Form / Email Service

Send emails from your portfolio contact form.

**Configuration (`application.yml` or `.properties`):**

```properties
spring.mail.username=${MAIL_USERNAME}
spring.mail.password=${MAIL_PASSWORD}
```

> Generate an **App Password** from your Gmail account and use it here.

Optional local testing:

```properties
#spring.mail.username=amitkumaramitkumar15351@gmail.com
#spring.mail.password=your_app_password
```

---

## ⚙️ Configuration

1. Clone the repo:

```bash
git clone https://github.com/yourusername/portfolio-backend.git
```

2. Update `application.yml` with your **LeetCode** and **CodeChef** usernames.

3. Configure **email credentials** in `application.yml` or `.env`. In your deployment

4. Run locally:

```bash
mvn spring-boot:run
```

5. Access APIs:

```
https://your-backend-deployed-url/LeetCode
https://your-backend-deployed-url/CodeChef
```

---

## ☁️ Deployment

* Recommended: **Render**
* Set environment variables on Render:

  * `MAIL_USERNAME`
  * `MAIL_PASSWORD`
  * LeetCode & CodeChef API URLs

---

## 🤝 Contributing

* Fork the repository & add features

---

## 📝 License

Iamit-kumarI © 2026 Amit Kumar

---


Do you want me to do that too?
