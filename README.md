# UIEvolutionDemo
A demonstration of how Android UI has progressed from XML to Jetpack Compose.

UI as Code

There has been a trend of declaring UI in XML or other alterable files. This has been a fine idea when dealing with compiled code because you don't have to recompile to see any changes. This has changed recently in some fields, namely mobile, where changes still have to be deployed to a seperate device. Apple introduced SwiftUI for their platforms (mobile, web, desktop), Google introduced Flutter for cross-platform (mobile, web, desktop) and Jetpack Compose (mobile). These come after the rapid adoption of Facebook's React, which allowed for declaritive style creation of UI.

When using a text file to describe UI there is a binding step where you create code objects to hold the generated UI. In Android, this takes the form of `Button myButton = findById<Button>(R.id.myButton)` where `R.id.myButton` is the id declared in the XML file.

I read a bunch of opinions in writing this. Almost all of them were written before SwiftUI, Flutter, and Jetpack Compose. Almost all of them claim that writing the UI in XMl enforces a separation of concern; that writing the UI in code tightly couples the logic and UI. The pattern they all are advocating is to use `findViewById`. Which tightly couples any code that directly interacts with the result of that call. So it would seem that writing UI in XML is not a catch all for enforcing separation.

<example1>

Android attempted to fix this by using databinding where you could inform the ui of functions in the code that could dictate its behavior. This involved some manual wiring on the developers part to setup but then there was no need to individually bind each UI object with `findById(...)`. There was still a disconnect between ui objects and what you wanted them to do, but less of the details needed to be declared up front and it made a worthy attempt to separate the XML UI and the code.

<example2>

But XML is not typesafe or null-safe and therefore will compile with bad arguments and break at the worst time (all things do).

Kotlin and Java are typesafe and null-safe (Java needs annotations, but still gets there). What if we wrote the UI as code? That way we could get the benefits of typesafety and null-safety. As shown previously, keeping the UI decoupled from the logic is still on the developer so nothing is lost.

<example3>

Now let's look at a benefit of UI as Code: Less mess. Because we don't need to use the `findViewById` method or do any of the wiring for databinding we have less text to type and therefore less clutter. We can also see that the myth that UI as XML "enforces separation" is rediculous. Let's refactor a bit to get things looking better for the rest of the examples and introduce some actual separation.

<example3 refactor>

So far we've only used the regular libraries for things. On Android, we are getting a shiny new library: Jetpack Compose. When we use that, the code gets even cleaner.

<example4>

Hopefully this has shown the improvements in UI creation and provided concrete examples for Android.

Resources:
https://github.com/LouisCAD/Splitties/blob/master/modules/views-dsl/Kotlin-UIs-vs-xml-layouts.md
https://github.com/Kotlin/anko/wiki/Anko-Layouts#why-a-dsl
https://reactjs.org/
https://developer.apple.com/documentation/swiftui
https://developer.android.com/jetpack/compose
https://flutter.dev/

Questions?
