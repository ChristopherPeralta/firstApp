package com.chris.myapplication.ToDoApp

sealed class TaskCategory (var isSelected:Boolean = true) {
    object  Personal :TaskCategory()
    object  Business :TaskCategory()
    object Other :TaskCategory()
}