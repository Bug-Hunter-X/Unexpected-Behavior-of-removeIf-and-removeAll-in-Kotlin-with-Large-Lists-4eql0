# Unexpected Behavior of removeIf and removeAll in Kotlin with Large Lists

This repository demonstrates an unexpected behavior observed when using `removeIf` and `removeAll` functions in Kotlin with large lists and complex predicates. The issue lies in the subtle difference between how `removeIf` and `removeAll` handle list modification during iteration. 

## Problem Description

In certain scenarios involving large lists and computationally intensive predicates, `removeIf` might not remove all expected elements.  `removeAll` might also exhibit similar behavior, albeit potentially differently due to its use of a separate iterator and predicate.