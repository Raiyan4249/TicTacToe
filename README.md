# ⭕ Tic-Tac-Toe ❌

A clean, classic desktop Tic-Tac-Toe game built in **Java** with a **Swing** GUI. Simple, snappy, and satisfying — just fire it up and start playing.

![Java](https://img.shields.io/badge/Java-Swing-orange?logo=openjdk&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-blue.svg)
![Status](https://img.shields.io/badge/Status-Active-brightgreen)

---

## ✨ Features

- 🎮 **Two-player local gameplay** — pass the mouse and play head-to-head
- 🎲 **Random starting player** — X or O gets picked randomly each round, so no one always goes first
- 🟡🔴 **Color-coded wins** — the winning line lights up yellow for X and red for O
- 🤝 **Draw detection** — the board tells you when it's a stalemate
- 🔄 **New Game button** — reset the board instantly without restarting the app
- 🖥️ **Lightweight & dependency-free** — pure Java, no external libraries required

## 🖼️ Preview

```
┌─────────────────────────────┐
│         TIC-TAC-TOE         │
├───────────┬───────────┬─────┤
│     X     │     O     │  X  │
├───────────┼───────────┼─────┤
│     O     │     X     │     │
├───────────┼───────────┼─────┤
│           │     O     │  X  │
└───────────┴───────────┴─────┘
      [ New Game ]  [ Exit ]
```

## 🚀 Getting Started

### Prerequisites

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) 8 or later installed
- That's it — no build tools or dependencies needed!

### Run it locally

```bash
# Clone the repository
git clone https://github.com/Raiyan4249/TicTacToe.git
cd TicTacToe

# Compile
javac App.java GUI/TicTacToe.java

# Run
java App
```

A window will pop up and the game begins immediately — enjoy! 🎉

## 🗂️ Project Structure

```
TicTacToe/
├── App.java           # Entry point — launches the game window
├── GUI/
│   └── TicTacToe.java # Game logic + Swing UI (board, buttons, win/draw checks)
├── LICENSE             # MIT License
└── README.md
```

## 🛠️ Built With

- **Java** — core language
- **Swing (`javax.swing`)** — GUI framework for the window, buttons, and board
- **AWT (`java.awt`)** — layout management and styling

## 🤝 Contributing

Contributions, issues, and feature requests are welcome! Feel free to check the [issues page](https://github.com/Raiyan4249/TicTacToe/issues) or open a pull request.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a pull request

## 📄 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

---

<p align="center">Made with ☕ and Java Swing by <a href="https://github.com/Raiyan4249">Raiyan4249</a></p>
