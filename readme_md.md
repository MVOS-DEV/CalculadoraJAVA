# Java Console Calculator

A lightweight command-line calculator written in Java that performs standard arithmetic operations using interactive user input via `java.util.Scanner`.

## Features

The application supports five basic mathematical operations:

* **Addition**: Calculates the sum of two integers.
* **Subtraction**: Subtracts the second integer from the first.
* **Multiplication**: Multiplies two integer values.
* **Division**: Performs integer division on two values.
* **Remainder (Modulo)**: Computes the remainder of integer division (`%`).

## Prerequisites

* **Java Development Kit (JDK)**: JDK 8 or higher (JDK 17+ recommended).
* **Build/IDE Environment**: IntelliJ IDEA, Eclipse, VS Code, or standard command-line tools.

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/your-username/CalculadoraJAVA.git
cd CalculadoraJAVA
```

### Running via Command Line

1. Navigate to the source directory:
   ```bash
   cd src
   ```

2. Compile the application:
   ```bash
   javac Main.java
   ```

3. Execute the compiled class:
   ```bash
   java Main
   ```

### Running via IntelliJ IDEA

1. Open the project directory in IntelliJ IDEA.
2. Locate `src/Main.java`.
3. Execute the class using `Shift + F10` or the **Run** button.

## Console Workflow

Upon execution, the terminal displays the following operational menu:

```text
Escolha uma Operação matematica:

1-Soma
2-Subtração
3-Multiplicação
4-Divisão
5-Resto
```

1. Input the integer corresponding to the desired operation (`1`–`5`).
2. Input the first operand (`n1`).
3. Input the second operand (`n2`).
4. View the calculated output directly in the console stream.

## License

Distributed under the MIT License. See `LICENSE` for details.