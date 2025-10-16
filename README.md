Raspisnoy Poker — Android (Kotlin + Jetpack Compose) — ONLINE version (GitHub Actions)

This archive contains a ready-to-upload Android project with:
- Online game logic using Firebase (Realtime Database).
- A GitHub Actions workflow that builds a debug APK when you run the workflow.
- Support for securely providing google-services.json via a GitHub Actions secret so you do NOT need to commit it publicly.

IMPORTANT: To enable real online play you will need a Firebase project and its google-services.json file.
You can supply google-services.json to the GitHub Actions workflow securely (instructions below).

What is included:
- Android project source (Kotlin + Jetpack Compose)
- .github/workflows/build.yml — CI workflow to build APK
- README.full-instructions.md — step-by-step guide how to create a GitHub repo, add secret, run workflow, and download APK.

If something goes wrong, copy the contents of README.full-instructions.md and follow the troubleshooting steps.
