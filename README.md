# MyKMM

Стартовый проект на Kotlin Multiplatform Mobile: общий модуль `shared` с логикой
приветствия и два нативных клиента — Android (Jetpack Compose) и iOS (SwiftUI).
Приложение показывает строку «Hello, <платформа и версия ОС>!», полученную из общего кода
через `expect`/`actual`.

## Стек

| Область     | Технологии                                       |
|-------------|--------------------------------------------------|
| Язык        | Kotlin 2.0, Swift                                |
| Общий код   | Kotlin Multiplatform (Android, iOS)              |
| UI          | Jetpack Compose + Material 3, SwiftUI            |
| Интеграция  | CocoaPods (модуль `shared` как pod)              |

## Структура

```
shared/      # общий код: Greeting, Platform (expect/actual)
androidApp/  # Android-приложение на Compose
iosApp/      # iOS-приложение на SwiftUI (Xcode + CocoaPods)
```

## Сборка

Android (JDK 17, Android SDK 35):

```bash
./gradlew :androidApp:assembleDebug
```

iOS: выполнить `pod install` в `iosApp/`, затем открыть `iosApp/iosApp.xcworkspace` в Xcode.
