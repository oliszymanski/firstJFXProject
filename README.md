# first JFX Projects
My JavaFX beginning projects or my journey through programming in Java and learning
the JavaFX library for GUI 

## Main.java
Main program must always be in every folder because programmer must know where should the
program start running. Usually, the controller.java program looks like this:

```java
package sample;

public class programName {
}
```

<br>



## Controller.java
Is a class of which object is created by FXML file and used to init UI styles such as text
style, or some object color. It is very similar to the HTML language,

```java
package sample;

public class Controller{
}
```

Function of Controller.java is processing the incoming requests, like updates the model.

<br>



##nodeBasics.java
Shows how to use panes in JFX. In general, panes are containers which are used mainly for
flexible (and dynamic) interaction of the UI controls inside the scene. The best thing about
panes, is that when the window is resized, the panes are also automatically resizes the nodes
that it contains. Some example nodes are:

1. we need to import the pane
```java
import javafx.scene.layout.Pane;
```


2. import colors lib (optional):
```java
import javafx.scene.paint.Color;        //importing color to fill
```


3. import some shapes that we want to use:
```java
import javafx.scene.shape.Circle;       //importing shapes
import javafx.scene.shape.Rectangle;
```


If we have done all these steps, we can create objects. Those objects need properties such as
color or size. In the Circle class that we imported, we can use size of the circle (radius if
it) and color. I'm to specify the radius for 50 (in px) and fill it with Blue color.

<br>

for the rectangle, I'm going to set the width of 100 and height to 100. Fill in red color:

```java
Circle c0 = new Circle(50, color.BLUE);             //circle node (double size, color)
Rectangle r0 = new Rectange(100, 100, color.RED);     //rectangle node (double width, double height, color)
```


Remember that for defining the size of something: object, method (really everything), you define
it in **pixels** (px). Colors, you define by **hex**. Both of those are used when programming
in CSS and/or HTML.



<br>