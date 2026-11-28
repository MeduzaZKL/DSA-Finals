## DATA STRUCTURE AND ALGORITHM - FINAL PROJECT

### NetBeans GUI project

Open **Java** using **File > Open Project** in NetBeans.

```text
Java/
  src/
    authentication/
      LoginFrame.java
      LoginFrame.form
      SigninFrame.java
      SigninFrame.form
    dashboard/
      MainDashboardFrame.java
      MainDashboardFrame.form
  nbproject/                     NetBeans project configuration
  build.xml                      Ant build configuration
  manifest.mf
```

In **Source Packages**, expand `authentication` for login and sign-in, or
`dashboard` for the main dashboard. Open a frame and select **Design** to edit
it in the GUI builder. Keep each `.java` file alongside its matching `.form`.

**Run Project (F6)** opens `authentication.LoginFrame`. To preview another
screen, right-click its Java file and select **Run File**. The project uses
JDK 26; select that Java platform in NetBeans if prompted.

These are starter windows; authentication and navigation are not implemented.
Login and sign-in normally mean the same action; they are separate forms here
as requested.

### Earlier prototypes

The root `src/` folder contains the earlier hand-written Swing screens,
including `Signup.java` for account registration. These are separate from the
NetBeans project. Make new GUI changes inside `Java/src/`.
