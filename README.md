# GDG Task App - Fetching Data from Firebase Realtime Database

This Android app dynamically loads and displays text and images from **Firebase Realtime Database** (RTDB) in real-time. It's designed to show how data (like promotional banners) can be updated in Firebase and automatically reflected in the app without the need for manual updates.

## Features
- **Real-time Firebase Data Fetching**: Fetches and displays dynamic content (text and images) from Firebase RTDB.
- **Image Loading**: Uses **Firebase Storage** to store images and retrieves them using the image URL stored in RTDB.
- **Real-Time Updates**: The app reflects any changes made in the Firebase RTDB instantly.
- **Simple UI**: A single screen with a message and an image (like a promotional banner).

## Tech Stack
- **Kotlin**: Main programming language.
- **Firebase Realtime Database**: Used to store and retrieve text and image URLs.
- **Firebase Storage**: Used to store images.
- **Glide**: Image loading library to fetch images from Firebase Storage.

## Firebase Setup

### Step 1: Create Firebase Project
1. Go to the [Firebase Console](https://console.firebase.google.com/).
2. Create a new project.

### Step 2: Add Firebase to Your Android App
1. Register your app with the Firebase project by providing the package name and downloading the `google-services.json` file.
2. Place the `google-services.json` file in the `app` directory of your Android project.

### Step 3: Enable Firebase Realtime Database
1. In the Firebase console, go to **Realtime Database** and create a new database.
2. Set up the database in test mode for development:
   ```json
   {
     "rules": {
       ".read": "true",
       ".write": "true"
     }
   }
