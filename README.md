
# FritzBox-Reconnect-Tool

DE:

Ein einfaches Reconnect-Tool mit Gui, um Missverständnissen und Fehlfunktionen zu beseitigen.

Führe die Jar aus und es öffnet sich ein Gui mit einem Proccess Button. Nachdem du ihn geklickt hast, schließt sich das Programm und deine IP-Adresse wurde erfolgreich geändert.

EN:

A simple reconnect tool with Gui to eliminate misunderstandings and malfunctions.

Execute the jar and a gui with a access button opens. After you have clicked it, the programme closes and your IP address has been successfully changed.
## Inhaltsverzeichnis

- DE:

  - Installation
    - Nutzer
    - Entwickler

  - API

  - Demo

EN:

  - Installation
    - User
    - Developer

  - API

  - Demo
## Installation

DE:


- Nutzer
  - Rufe [Releases](https://github.com/mcshept/FritzBoxReconnect/releases) auf und lade dir die neueste Version herunter oder öffne das Terminal in einem Ordner deiner Wahl und schreibe:

  ```bash
  git clone https://github.com/mcshept/FritzBoxReconnect.git
  ```
  Drücke daraufhin `Enter`

- Entwickler
  - Terminal
    - Öffne das Terminal und schreibe:
      ```bash
      git clone https://github.com/mcshept/FritzBoxReconnect.git
      ```
      Drücke nun `Enter`
    - Öffne danach eine Programmierumgebung deiner Wahl und öffne den Projektordner
  - IntelliJ IDEA
    - Wächsele ins Hauptmenü und klicke auf [GET FROM VCS](https://www.jetbrains.com/help/idea/set-up-a-git-repository.html)
    - Füge im folgenden Menü `https://github.com/mcshept/FritzBoxReconnect.git` ein


EN:


- User
  - Go to [Releases](https://github.com/mcshept/FritzBoxReconnect/releases) and download the latest version or open the terminal in a folder of your choice and write:

  ```bash
  git clone https://github.com/mcshept/FritzBoxReconnect.git
  ```
  Then press `Enter`.

- Developer
  - Terminal
    - Open the Terminal and write
      ```bash
      git clone https://github.com/mcshept/FritzBoxReconnect.git
      ```
      Now press `Enter`
    - Then open a programming environment of your choice and open the project folder
  - IntelliJ IDEA
    - Go to the main menu and click on [GET FROM VCS](https://www.jetbrains.com/help/idea/set-up-a-git-repository.html).
    - Add `https://github.com/mcshept/FritzBoxReconnect.git` in the following menu
## API

DE:


Um das Tool in deinem Programm zu verwenden, füge es als Library hinzu.
Um die Reconnect-Funktion zu verwenden, schreibe `ReconnectUtil.execute();` und surrounde es mit Try-Catch.

Falls du eine Ausgabe/Rückmeldung erhalten möchtest, füge `ReconnectUtil.sendReconnect();` hinzu.

EN:


To use the tool in your programme, add it as a library.
To use the reconnect function, write `ReconnectUtil.execute();` and surround it with try-catch.

If you want to get an output/feedback, add `ReconnectUtil.sendReconnect();`.
## Demo

Coming soon...


## Author

- [@mcshept](https://www.github.com/mcshept)

