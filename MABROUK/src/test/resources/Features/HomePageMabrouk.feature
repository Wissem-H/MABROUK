#Author: Wissem
Feature: Home Page MABROUK
Scenario: Select a menu from the home page
Given user is on home page
When user hovers the mouse over the menu "Femme" and clicks on submenu "Chemises & Blouses"
Then user is directed to submenu page "Chemises & Blouses"

