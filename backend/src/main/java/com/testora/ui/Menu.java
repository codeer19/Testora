package com.testora.ui;
import com.testora.model.User; import java.util.*;
/** Abstract role menu with common session state. */
public abstract class Menu {protected final Scanner in;protected final User user;protected Menu(Scanner in,User user){this.in=in;this.user=user;}public abstract void show();}
