#!/bin/bash

BASE=main
SOURCE="/c/Users/User/OneDrive/Documents/School 2025/NetBeansProjects"
LOG="failed_folders.txt"
REPO_DIR=$(pwd)

# Ensure main branch exists
git checkout -b $BASE 2>/dev/null || git checkout $BASE
git commit --allow-empty -m "Initial commit" 2>/dev/null
git push -u origin $BASE 2>/dev/null

> $LOG  # clear previous log

for d in "$SOURCE"/*/ ; do
    folder=$(basename "$d")
    echo "Processing $folder"

    git checkout -b "$folder"

    # Move folder contents into repo
    mv "$d"/* "$REPO_DIR"/

    git add .
    git commit -m "Add $folder"
    git push -u origin "$folder" || echo "$folder" >> $LOG

    # Move files back to original folder (so SOURCE is intact)
    mkdir -p "$d"
    mv "$REPO_DIR"/* "$d"/ 2>/dev/null

    git checkout $BASE
done

