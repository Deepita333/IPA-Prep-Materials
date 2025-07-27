# 🐧 UNIX Cheat Sheet – TCS IPA Exam Preparation

This repository contains a concise and practical **UNIX Cheat Sheet** tailored for quick revision before your **TCS IPA exam**. It covers essential UNIX commands, file permissions, redirection, and theoretical concepts likely to appear in **MCQ format** (5 marks).

---

## 📌 Table of Contents

- [🧾 Basic UNIX Commands](#basic-unix-commands)
- [🔐 File Permissions](#file-permissions)
- [🌀 Wildcards](#wildcards)
- [🔁 Redirection and Pipes](#redirection-and-pipes)
- [🧠 Process Management](#process-management)
- [🔍 Searching in Files](#searching-in-files)
- [📄 File Viewing Tools](#file-viewing-tools)
- [📦 Archiving and Compression](#archiving-and-compression)
- [🌐 Environment Variables](#environment-variables)
- [⌨️ Keyboard Shortcuts](#keyboard-shortcuts)
- [🧠 Theoretical Notes](#theoretical-notes)
- [🎯 Tips for TCS IPA MCQs](#tips-for-tcs-ipa-mcqs)

---

## 🧾 Basic UNIX Commands

| Command         | Description                          |
|-----------------|--------------------------------------|
| `pwd`           | Prints current working directory     |
| `ls`            | Lists directory contents             |
| `cd [dir]`      | Changes current directory            |
| `mkdir [dir]`   | Creates new directory                |
| `rmdir [dir]`   | Removes empty directory              |
| `rm [file]`     | Deletes file                         |
| `touch [file]`  | Creates new empty file               |
| `cat [file]`    | Displays contents of a file          |
| `cp src dest`   | Copies a file                        |
| `mv src dest`   | Moves or renames a file              |

---

## 🔐 File Permissions

- **r = read (4), w = write (2), x = execute (1)**
- Permissions are set using `chmod`
  
```bash
chmod 755 filename  # rwx for owner, rx for group & others

## 📁 File Permissions: `ls -l` Output

```bash
-rwxr-xr-- 
```

Breakdown:
- `rwx` → Owner: read, write, execute  
- `r-x` → Group: read, execute  
- `r--` → Others: read only  

---

## 🌀 Wildcards

| Wildcard | Meaning                          |
|----------|----------------------------------|
| `*`      | Matches any number of characters |
| `?`      | Matches a single character       |
| `[abc]`  | Matches one character from set   |

```bash
ls a*.txt     # Lists all .txt files starting with 'a'
```

---

## 🔁 Redirection and Pipes

| Symbol | Usage                        |
|--------|------------------------------|
| `>`    | Redirect output (overwrite)  |
| `>>`   | Append output                |
| `<`    | Take input from a file       |
| `|`    | Pipe output to another cmd   |

```bash
ls | grep "data"    # Filter files containing "data"
```

---

## 🧠 Process Management

| Command     | Description                         |
|-------------|-------------------------------------|
| `ps`        | Show current processes              |
| `top`       | Real-time system monitoring         |
| `kill PID`  | Kill a process by its ID            |
| `&`         | Run process in background           |
| `jobs`      | Show background jobs                |
| `fg`        | Bring background job to foreground  |

---

## 🔍 Searching in Files

| Command                      | Usage                            |
|-----------------------------|----------------------------------|
| `grep 'word' filename`      | Find lines containing 'word'     |
| `find . -name "*.txt"`      | Find files by name               |
| `which ls`                  | Show path of command             |

---

## 📄 File Viewing Tools

| Command | Description              |a
|---------|--------------------------|
| `head`  | Show first 10 lines      |
| `tail`  | Show last 10 lines       |
| `less`  | Scrollable file viewer   |

---

## 📦 Archiving and Compression

| Command                  | Usage                          |
|--------------------------|--------------------------------|
| `tar -cvf file.tar dir/` | Archive directory              |
| `tar -xvf file.tar`      | Extract tar archive            |
| `gzip file`              | Compress file                  |
| `gunzip file.gz`         | Decompress file                |

---

## 🌐 Environment Variables

```bash
echo $HOME         # Display value of HOME
export VAR=value   # Set a variable
env                # List environment variables
```

---

## ⌨️ Keyboard Shortcuts

| Shortcut   | Action                         |
|------------|--------------------------------|
| `Ctrl + C` | Terminate running command      |
| `Ctrl + D` | Logout / End of File (EOF)     |
| `Ctrl + Z` | Suspend a process              |
| `clear`    | Clear the terminal screen      |

---

## 🧠 Theoretical Notes

- UNIX is a **multitasking**, **multiuser** operating system.
- Developed in the **1970s** at **Bell Labs**.
- Follows principles of **modularity** and **reusability**.
- Everything in UNIX is treated as a **file**, including devices.
- Interaction is done via **shells** (e.g., Bash, sh).
- File system hierarchy begins with the **root `/`**.

---

## 🎯 Tips for TCS IPA MCQs

- Understand `chmod` values:  
  - `r=4`, `w=2`, `x=1` → So `7 = rwx`
- Practice wildcard patterns: `*`, `?`, `[abc]`
- Know basic commands and what each does.
- Learn about pipes `|` and redirection `>`, `>>`
- Review process commands: `ps`, `top`, `kill`, `&`, `fg`
