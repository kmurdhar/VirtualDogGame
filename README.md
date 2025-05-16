# 🐶 VirtualDogGame

A fun, interactive desktop virtual pet game built with **Java Swing**. It features an animated dog that walks across the screen, responds to keyboard and mouse input, fetches bones, bounces balls, and even barks! Ideal as a beginner-to-intermediate GUI and event-driven programming project in Java.

---

## 🧠 Features

- 🐾 Dog moves left and right across the screen
- ⏸️ Start/stop motion with the keyboard
- 💤 Dog sleeps if left idle for too long
- 🦴 Click to throw bones or bounce balls randomly
- 🐕 Click on the dog to hear it bark
- 🧠 Built-in simple animation and sound using `javax.sound.sampled`

---

## 🎮 Controls

| Action                  | Input                     |
|-------------------------|----------------------------|
| Move Dog Left           | `LEFT Arrow`              |
| Move Dog Right          | `RIGHT Arrow`             |
| Pause / Resume Movement | `SPACE`                   |
| Bark                    | Click on the dog          |
| Throw Bone / Ball       | Click anywhere on screen  |

---

## 🗂️ Project Structure

```text
VirtualDogGame.java      # Main class with GUI and event logic
resources/
├── dog.gif              # Walking dog animation
├── img_1.png            # Image for bone and ball
├── bark.wav             # Barking sound effect
