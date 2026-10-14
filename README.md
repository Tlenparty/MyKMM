# MyKMM

A Kotlin Multiplatform Mobile starter project: a shared `shared` module with the
greeting logic and two native clients, Android (Jetpack Compose) and iOS (SwiftUI).
The app displays a "Hello, <platform and OS version>!" string obtained from the shared
code via `expect`/`actual`.

## Tech stack

| Area        | Technologies                                     |
|-------------|--------------------------------------------------|
| Language    | Kotlin 2.0, Swift                                |
| Shared code | Kotlin Multiplatform (Android, iOS)              |
| UI          | Jetpack Compose + Material 3, SwiftUI            |
| Integration | CocoaPods (`shared` module as a pod)             |

## Project structure

```
shared/      # shared code: Greeting, Platform (expect/actual)
androidApp/  # Android app built with Compose
iosApp/      # iOS app built with SwiftUI (Xcode + CocoaPods)
```

## Build

Android (JDK 17, Android SDK 35):

```bash
./gradlew :androidApp:assembleDebug
```

iOS: run `pod install` in `iosApp/`, then open `iosApp/iosApp.xcworkspace` in Xcode.
