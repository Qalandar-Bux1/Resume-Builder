<div align="center">

# 🧾 Resume Builder — Java Desktop Application

**A fully-featured desktop application to create, edit, preview, and export professional resumes — built entirely in Java.**

[![Java](https://img.shields.io/badge/Java-SE%2017-orange?style=flat-square&logo=openjdk)](https://www.java.com)
[![Swing](https://img.shields.io/badge/GUI-Swing%2FAWT-blue?style=flat-square)](https://docs.oracle.com/javase/tutorial/uiswing/)
[![iText](https://img.shields.io/badge/PDF-iText%20Library-red?style=flat-square)](https://itextpdf.com/)
[![License](https://img.shields.io/badge/License-MIT-green?style=flat-square)](LICENSE)
[![GitHub](https://img.shields.io/badge/GitHub-Qalandar--Bux1-black?style=flat-square&logo=github)](https://github.com/Qalandar-Bux1)

</div>

---

## 📸 Screenshots

> **How to add screenshots — full guide at the bottom of this README ↓**

| Main Screen | Resume Form | PDF Preview |
|:-----------:|:-----------:|:-----------:|
|<img width="721" height="404" alt="Picture4" src="https://github.com/user-attachments/assets/ddec9a6f-b0c6-4a96-8ee2-c7e7cd98ef62" />| ![Resume Form](docs/screenshots/resume-form.png) | ![PDF Preview](docs/screenshots/pdf-preview.png) |

---

## 📖 About

Resume Builder is a **Java Swing desktop application** that allows users to build a complete, professional resume through a clean graphical interface. Users can fill in all standard resume sections, preview the output in real time, and export it as a print-ready PDF — all without needing any internet connection or external service.

This project was built as part of my Java learning journey, focusing on **OOP principles**, **event-driven GUI programming**, and **file I/O** in Java.

---

## ✨ Features

| Feature | Description |
|---|---|
| 👤 Personal Details | Name, email, phone number, LinkedIn, GitHub, address |
| 🎓 Education | Degree, institution, year, CGPA — multiple entries supported |
| 💼 Work Experience | Job title, company, duration, description per role |
| 🧠 Skills | Technical and soft skills with categorization |
| 📜 Certifications | Certification name, issuer, year |
| 🚀 Projects | Project title, tech stack, description |
| 🎯 Summary | Professional summary / objective statement |
| 📄 PDF Export | Export complete resume to PDF using iText library |
| 💾 Save & Load | Save resume data and reload it later for editing |
| 👁 Live Preview | Preview formatted resume before exporting |
| 🖥 Clean GUI | Intuitive Swing/AWT interface with form navigation |

---

## 🛠 Tech Stack

```
Language        →  Java SE 17
GUI Framework   →  Java Swing + AWT
PDF Generation  →  iText 7 (com.itextpdf)
Build Tool      →  Maven / Manual JAR
IDE             →  IntelliJ IDEA / Eclipse
```

---

## 📁 Project Structure

```
Resume-Builder/
├── src/
│   └── main/
│       └── java/
│           └── com/qalandar/resumebuilder/
│               ├── Main.java                  ← Entry point
│               ├── ui/
│               │   ├── MainFrame.java         ← Main application window
│               │   ├── PersonalDetailsPanel.java
│               │   ├── EducationPanel.java
│               │   ├── ExperiencePanel.java
│               │   ├── SkillsPanel.java
│               │   └── PreviewPanel.java
│               ├── model/
│               │   ├── Resume.java            ← Resume data model
│               │   ├── Education.java
│               │   ├── Experience.java
│               │   └── Skill.java
│               └── utils/
│                   ├── PdfExporter.java       ← PDF generation logic
│                   └── FileManager.java       ← Save/load functionality
├── docs/
│   └── screenshots/                          ← Add your screenshots here
├── pom.xml
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

- **Java JDK 17+** → [Download here](https://adoptium.net/)
- **Maven** (if using Maven build) → [Download here](https://maven.apache.org/)
- **IntelliJ IDEA** or **Eclipse** (recommended)

### Installation & Run

**1. Clone the repository**
```bash
git clone https://github.com/Qalandar-Bux1/Resume-Builder.git
cd Resume-Builder
```

**2. Open in IntelliJ IDEA**
```
File → Open → Select the Resume-Builder folder → Click OK
```

**3. Build the project**
```bash
# Using Maven
mvn clean install

# Or in IntelliJ: Build → Build Project (Ctrl + F9)
```

**4. Run the application**
```bash
# Using Maven
mvn exec:java -Dexec.mainClass="com.qalandar.resumebuilder.Main"

# Or in IntelliJ: Right-click Main.java → Run 'Main.main()'
```

---

## 📄 How to Export PDF

1. Fill in all resume sections using the form panels
2. Click **"Preview Resume"** to see the formatted output
3. Click **"Export to PDF"** button
4. Choose save location on your system
5. Your resume PDF is ready ✅

---

## 💾 Save & Load Resume

- Click **"Save"** to store your resume data as a `.json` / `.dat` file
- Click **"Load"** to open a previously saved resume and continue editing

---

## 🧪 What I Learned Building This

- Java **OOP principles** — classes, inheritance, encapsulation, interfaces
- **Event-driven programming** with Swing ActionListeners
- **MVC pattern** — separating UI, model, and logic layers
- **File I/O** in Java for save/load functionality
- **Third-party library integration** with iText for PDF generation
- **Layout managers** in Swing — BorderLayout, GridLayout, BoxLayout

---

## 🗺 Future Improvements

- [ ] Add multiple resume templates / themes
- [ ] Add drag-and-drop section reordering
- [ ] Add photo upload to resume
- [ ] Add database support to store multiple resumes
- [ ] Export to DOCX format

---

## 👨‍💻 Author

<div align="center">

**Qalandar Bux**
*Full Stack & AI Developer · BS Computer Science, Sukkur IBA University*

[![GitHub](https://img.shields.io/badge/GitHub-Qalandar--Bux1-black?style=flat-square&logo=github)](https://github.com/Qalandar-Bux1)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-qalandar--bux1-blue?style=flat-square&logo=linkedin)](https://linkedin.com/in/qalandar-bux1)
[![Email](https://img.shields.io/badge/Email-buxq4935%40gmail.com-red?style=flat-square&logo=gmail)](mailto:buxq4935@gmail.com)

</div>

---

## 📜 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

---

<div align="center">


<img width="853" height="455" alt="Picture3" src="https://github.com/user-attachments/assets/f65162c4-f7f8-463b-be9f-8060698a11e9" />
<img width="911" height="494" alt="Picture2" src="https://github.com/user-attachments/assets/feb9b19d-1354-4c5a-a2b8-411984c362af" />
<img width="687" height="359" alt="Picture1" src="https://github.com/user-attachments/assets/60c72ac4-222b-40bb-a17e-4a8703cefc67" />
