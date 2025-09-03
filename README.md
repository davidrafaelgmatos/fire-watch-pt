# Fire Watch PT 🔥🇵🇹
A notification and monitoring service for Portuguese fire incidents using the official Pro-Civ database.  
This project fetches incident updates, stores them in PostgreSQL, notifies a Telegram channel, and generates daily summaries using ChatGPT.

---

## Features
- ⏱ Scheduled fetch from Pro-Civ API every 5 minutes  
- 💾 Storage in PostgreSQL (with Hibernate, model-first migrations)  
- 🔔 Telegram integration: create and update messages for incidents  
- 🤖 Daily AI-generated summary using ChatGPT  
- 🔐 Authentication with [Descope](https://descope.com)  
- 🐳 Monorepo with Docker Compose for easy deployment  

---

## Tech Stack
- **Backend:** Java + Hibernate  
- **Database:** PostgreSQL  
- **Frontend:** [React + Next.js](https://nextjs.org) 
- **Auth:** Descope  
- **Infra:** Docker Compose (multi-container setup)  

---

## Monorepo Structure
```
fire-watch-pt/
│── backend/ # Java + Hibernate + API services
│── frontend/ # Next.js frontend
│── db/ # Database migrations & schema
│── docker/ # Dockerfiles and Compose configs
│── README.md # This file
```
## Roadmap

- Pro-Civ scheduled data fetcher 
- PostgreSQL storage schema 
- Telegram event notifications
- ChatGPT daily summaries 
- Descope authentication
- Frontend dashboard

## Running Locally
```bash
# Clone repo
git clone https://github.com/YOUR-USERNAME/fire-watch-pt.git
cd fire-watch-pt

# Start all services
docker-compose up --build
```