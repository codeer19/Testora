# Testora

Testora is a plain-Java console online judge for practical assessments. It uses JDBC and MySQL, compiles submitted Java files with the local JDK, and evaluates them in worker threads.

## Setup and run

1. Create MySQL database `testora`, then run `database/schema.sql` and `database/sample_data.sql`.
2. Copy `backend/db.properties.example` to `backend/db.properties` and set your MySQL password.
3. Ensure Java 17 `java` and `javac` are on `PATH`.
4. Run `cd backend; mvn compile exec:java -Dexec.mainClass=com.testora.Main`.

Default sample password: `Password123!`.

## Features

Student registration/login, problem browsing and filtering, real compile/run judging, submission history, progress and leaderboard; faculty CRUD, CSV/text import/export and assessments; and admin user administration.

## Syllabus mapping

| Concept | File / method |
|---|---|
| JDBC / Statement | `config/DBConnection.java#healthCheck` |
| Prepared statements / CRUD | `dao/ProblemDAO.java` |
| Transaction | `dao/SubmissionDAO.java#saveWithResults` |
| Batch import / files | `service/CsvService.java#importProblems` |
| Generics | `dao/CrudDAO.java`, `dto/ApiResponse.java` |
| Streams / analytics | `service/ProblemService.java`, `service/AnalyticsService.java` |
| Processes / threads | `judge/JavaCompilerRunner.java`, `judge/JudgeWorker.java` |
| OOP menus | `ui/Menu.java` |
