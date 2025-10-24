🧠 Knowledge Base Search Engine (RAG)



A Retrieval-Augmented Generation (RAG) powered Knowledge Base Search Engine that allows users to upload documents, index their contents, and query information intelligently through a web interface.

🚀 Live & Demo

Live URL:
🔗[ [https://your-demo-link-here.vercel.app](http://localhost:3000/)](https://knowledge-base-search-engine.vercel.app)

Demo Video:
🎥 [https://drive.google.com/file/d/your-demo-video-id/view?usp=sharing](https://drive.google.com/file/d/1vgRI6eZDKMfxWXc5x1Xfv2ZuaLYUaryH/view?usp=sharing)

🧩 About The Project

This project demonstrates a complete end-to-end RAG pipeline — combining a Java-based backend with a modern React frontend.
It allows users to upload files, query across uploaded data, and receive contextually relevant answers.

✨ Key Capabilities

📁 Document Uploading: Upload text or PDF files directly to the server.

🔍 Intelligent Query Processing: Search through uploaded content to find answers.

⚡ Spring Boot REST API: Robust, scalable backend that handles file storage and query endpoints.

💻 React + Tailwind Frontend: Beautiful, modern, and responsive UI built using Vite for lightning-fast development.

🔄 RAG-Ready Architecture: Backend designed to easily plug into LLMs (like Gemini, GPT, or Ollama).

🧠 Core Architecture
Layer	Technology	Description
Frontend	React (Vite) + Tailwind CSS	Interactive user interface for uploads and queries
Backend	Spring Boot (Java 17)	REST API handling document storage and search logic
Storage	Local File System	Documents uploaded and stored under /uploads folder
Communication	Axios (HTTP)	React frontend communicates with backend over REST
Build Tools	Maven + npm	Backend/Frontend dependency management and builds
📸 Application Screenshots

Upload Page:
<img width="1003" height="603" alt="Screenshot 2025-10-14 222408" src="https://github.com/user-attachments/assets/d1d87e3b-de42-411b-b96a-b5eacbd6ce23" />

Query Interface:
<img width="1266" height="759" alt="Screenshot 2025-10-14 221419" src="https://github.com/user-attachments/assets/bfcfc35e-3afd-4a79-bfd5-973f4fe4321f" />

⚙️ Project Structure
PROJECT/
│
├── knowledge-base-rag/           # Spring Boot backend
│   ├── src/main/java/com/example/ragbackend/
│   │   ├── RagBackendApplication.java
│   │   ├── controller/
│   │   │   ├── QueryController.java
│   │   │   └── UploadController.java
│   │   └── model/
│   │       └── DocumentData.java
│   ├── src/main/resources/
│   │   ├── application.properties
│   │   └── documents/
│   └── pom.xml
│
└── knowledge-base-frontend/      # React + Vite frontend
    ├── src/
    │   ├── components/
    │   │   └── UploadQuery.jsx
    │   ├── App.jsx
    │   ├── index.css
    │   └── main.jsx
    ├── package.json
    ├── vite.config.js
    └── tailwind.config.js

🧩 Setup Instructions
🖥️ Backend (Spring Boot)

Open a terminal and navigate to the backend:

cd knowledge-base-rag
mvn clean package
mvn spring-boot:run


Backend starts on:
🔗 http://localhost:8080

💻 Frontend (React + Vite)

Open another terminal and navigate to the frontend:

cd knowledge-base-frontend
npm install
npm run dev


Frontend runs on:
🔗 http://localhost:5173

🧠 Usage Flow

Go to http://localhost:5173/

Upload a text or PDF file.

Ask a question about your uploaded document.

View the generated answer (from mock or integrated LLM).

🧩 Tech Stack Summary
Layer	Tech	Purpose
Frontend	React + Vite	UI rendering
Backend	Spring Boot	API & File storage
Styling	Tailwind CSS	Modern responsive design
Communication	Axios	HTTP requests
Build	Maven + npm	Dependency & build management
📦 Deployment

You can deploy:

Frontend → Vercel
 or Netlify

Backend → Render
, Railway
, or a local server

Update the frontend axios URLs to match your deployed backend API.

🧑‍💻 Author

Javvadi Eeswar Sahith

🧩 GitHub: @[EeswarSahith](https://github.com/SAHITH567)

💼 LinkedIn: [Javvadi Eeswar Sahith](https://www.linkedin.com/in/sahith-javvadi-14498131b/)

🎥 Demo: [Google Drive Demo Video](https://drive.google.com/file/d/1vgRI6eZDKMfxWXc5x1Xfv2ZuaLYUaryH/view?usp=sharing)

📘 Project Repo: Knowledge Base RAG
