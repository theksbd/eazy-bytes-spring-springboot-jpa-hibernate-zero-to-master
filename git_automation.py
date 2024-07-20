# import os
import subprocess

# Get the current directory 
# curdir = os.getcwd()

# Navigate back to the Git root folder
# os.chdir(os.path.join(curdir, "../"))

# Run git status
subprocess.run(["git", "status"])

# Run git add . 
subprocess.run(["git", "add", "."])

# Get user input for the commit message
# There are 2 options:
# 1. update
# 2. Update course process: Section <section> - Lecture <lecture>
print("Enter the commit message:")
print("1. update")
print("2. Update course process: Section <section> - Lecture <lecture>")
commit_message = input("Enter the number of the commit message (1 or 2) or enter to type your own message: ")
if commit_message == "1":
    commit_message = "update"
elif commit_message == "2":
    commit_message = "Update course process: Section " + input("Enter the section number: ") + " - Lecture " + input("Enter the lecture number: ")
else:
    commit_message = input("Enter the commit message: ")

# Run git commit with the custom message
subprocess.run(["git", "commit", "-m", commit_message])

# Run git push
subprocess.run(["git", "push"])