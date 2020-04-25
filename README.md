# Decorator Pattern

This repository contains a simple Java implementation of a decorator pattern.

It consists of a wing component and a collection of decorator sauces.

### The Problem:
Before applying the decorator pattern, the structure of this program would be entirely based on inheritance.  Types of wings (like seitan, cauliflower, or tofu, for example) would inherit from the parent wing class.  If any new sauces were to be added, the parent class would need to be altered.  This violates the Open-Closed Principle. 

### The Solution:
Implementing the decorator pattern allows us to dynamically define new sauces without changing any of the wing classes.

### To Run:
1) Clone this repository to your local device.
2) Open the project in your IDE of choice.
3) Build the project and run it using the RunClient.java file.
