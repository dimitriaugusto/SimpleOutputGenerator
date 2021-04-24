# Simple Output Generator
This is a simple output writer application using Kotlin, Clean Architecture and component segregation for the sake of learning.

The Application function is to write automatically generated text to suitable output interfaces (file, console, etc).

This is the application's component dependence diagram:

```
main | ----------------------------> | CleanArchMain (domain)
     | -> TextGenerators ----------> |
     | -> AlphanumericGenerator ---> |
     | -> Writers -----------------> |
```

The main, outermost component contains the class `src/com/dimiaug/cleanarch/Main.kt` responsible for all instantiations.

The domain, innermost component `CleanArchMain` is independent, coordinates the invocation of other components and defines interfaces for the objects it needs.

Interfaces `TextGenerator` and `Writer` are implemented by "plugin" components, considered here the details of architecture:
- `TextGenerators` provides strings for random color and random date
- `AlphanumericGenerator` provides random char sequence
- `Writers` writes to file or to console

## Exercises

As an exercise, try to spot possible changes to violate the following design principles:
- SRP (Single Responsibility Principle)
- OCP (Open Closed Principle)
- LSP (Liskov Substitution Principle)
- ISP (Interface Segregation Principle)
- DIP (Dependency Inversion Principle)

Do the same for these Clean Arch principles:
- REP (Reuse/Release Equivalence Principle)
- CCP (Common Closure Principle)
- CRP (Common Reuse Principle)
- ACP (Acyclic Dependencies Principle)
- SDP (Stable Dependencies Principle)
- SAP (Stable Abstractions Principle)

Cheers!
