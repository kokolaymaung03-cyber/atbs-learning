# ATBS LEARNING Android app

This Android launcher opens the existing ATBS Learning Apps Script web app in the phone's default browser. Using the external browser is intentional because Google account sign-in may be blocked inside embedded WebViews.

## Build APK for free with GitHub Actions

1. Open the repository on GitHub.
2. Select Actions.
3. Select Build ATBS Learning APK.
4. Press Run workflow and confirm.
5. Wait for the workflow to finish successfully.
6. Open the completed run and download the ATBS-LEARNING-APK artifact.
7. Extract the ZIP and install app-debug.apk on the Android phone.

This debug APK is for direct testing/distribution. A Play Store release requires a signed release build and the Google Play Console account.
