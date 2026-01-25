
# Portfolio Backend API

![Portfolio Backend](https://img.shields.io/badge/Portfolio-Backend-blue)

## Overview

This is the backend for your personal portfolio application. It provides APIs to fetch coding profile data, manage contact forms, and integrate with your frontend easily.
Users can replace their username in the API URLs to map their own CodeChef and LeetCode data.

---

## 👤 Author

**Amit Kumar**
📧 [amitkumaramitkumar15351@gmail.com](mailto:amitkumaramitkumar15351@gmail.com)

---

## Features

* Fetch coding stats from **LeetCode** and **CodeChef**.
* Send emails via contact form using Gmail SMTP.
* Ready for deployment on **Render** or any cloud platform.

---

## Tech Stack

* **Java 17**
* **Spring Boot**
* **Maven** for dependency management
* **SMTP Email** integration

---

## API Endpoints

### **1. LeetCode Stats**

```text
GET /LeetCode
```

**Usage:**
Replace `youusername` with your LeetCode username in `application.yml`:

```yaml
ltc:
  api: https://leetscan.vercel.app/youusername
```

This will fetch your LeetCode stats and provide them to your frontend.

---

### **2. CodeChef Stats**

```text
GET /CodeChef
```

**Usage:**
Replace `youusername` with your CodeChef username in `application.yml`:

```yaml
codechef:
  api: https://cp-rating-api.vercel.app/codechef/youusername
```

This will fetch your CodeChef profile and rating data.

---

### **3. Contact Form / Email Service**

Send emails from your portfolio contact form.

**Configuration (application.yml or .properties):**

```properties
spring.mail.username=${MAIL_USERNAME}
spring.mail.password=${MAIL_PASSWORD}
```

> You can generate an **App Password** from your Gmail account and use it here.
> Example for local testing (optional):

```properties
#spring.mail.username=amitkumaramitkumar15351@gmail.com
#spring.mail.password=your_app_password
```

---

## Configuration

1. Clone the repository:

```bash
git clone https://github.com/yourusername/portfolio-backend.git
```

2. Update `application.yml` with your **LeetCode** and **CodeChef** usernames.

3. Configure **email credentials** in `application.yml` or `.env`.

4. Run the application locally:

```bash
mvn spring-boot:run
```

5. Access APIs:

```
https://your-backend-url/LeetCode
https://your-backend-url/CodeChef
```

---

## Deployment

* Recommended: **Render** (same as frontend).
* Ensure your environment variables are set on Render:

  * `MAIL_USERNAME`
  * `MAIL_PASSWORD`
  * LeetCode & CodeChef API URLs

---

## Contributing

Feel free to fork the repo and add features! For bug reports or enhancements, create a GitHub issue.

---

## License

MIT License © 2026 Amit Kumar

---

I can also make a **version with cool badges, emojis, and colors for sections** so it looks modern on GitHub — very portfolio-style professional.

Do you want me to do that next?
