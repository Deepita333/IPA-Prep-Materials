
# 🖥️ UI Notes for TCS IPA (HTML, CSS, JavaScript)

---

## 🌐 HTML (HyperText Markup Language)

### 🧱 Structure
- `<!DOCTYPE html>` – Defines document type.
- `<html>`, `<head>`, `<body>` – Main structure.
- `<title>` – Page title.
- `<h1>` to `<h6>` – Headings.
- `<p>`, `<br>`, `<hr>` – Paragraph, line break, horizontal line.

### 🔗 Links & Media
- `<a href="url">` – Anchor (link).
- `<img src="path" alt="desc">` – Image.
- `<video>`, `<audio>` – Multimedia content.

### 📋 Lists
- `<ul>`, `<ol>`, `<li>` – Unordered/Ordered lists.
- `<dl>`, `<dt>`, `<dd>` – Description lists.

### 🔘 Forms & Input
- `<form>`, `<input>`, `<select>`, `<textarea>`, `<button>`
- Attributes: `type`, `name`, `value`, `placeholder`, `required`

### 🧠 Important Tags
- `<div>` – Generic block.
- `<span>` – Generic inline.
- `<table>` – Rows (`<tr>`), columns (`<td>`), headers (`<th>`)

### ✅ MCQ Tips
- HTML is not case-sensitive.
- Tags must be properly nested.
- Forms use `method="GET"` or `POST`.
- `id` must be unique; `class` can repeat.

---

## 🎨 CSS (Cascading Style Sheets)

### 🖊️ Selectors
- `*` – Universal selector.
- `#id`, `.class`, `tagname`
- Grouping: `h1, h2 {}`  
- Descendant: `div p {}`

### 🎯 Properties
| Category     | Common Properties                   |
|--------------|-------------------------------------|
| Text         | `color`, `font-size`, `text-align` |
| Box Model    | `margin`, `border`, `padding`       |
| Background   | `background-color`, `background-img` |
| Layout       | `display`, `position`, `float`, `z-index` |
| Size         | `width`, `height`                   |

### 🧱 Box Model Order
`margin` → `border` → `padding` → `content`

### 🎬 Display & Position
- `display`: `block`, `inline`, `none`, `flex`, `grid`
- `position`: `static`, `relative`, `absolute`, `fixed`, `sticky`

### ✅ MCQ Tips
- `inline` → width/height **ignored**.
- `absolute` → relative to nearest positioned ancestor.
- `z-index` used for overlapping elements.
- `!important` overrides everything.

---

## ⚙️ JavaScript (JS)

### 📌 Basics
- Dynamically modifies HTML/CSS.
- Case-sensitive.
- Written inside `<script>` tags or `.js` files.

### 🔢 Variables & Data Types
- `var`, `let`, `const`
- Types: `number`, `string`, `boolean`, `null`, `undefined`, `object`

### 🔄 Operators
- `+`, `-`, `*`, `/`, `%`, `==`, `===`, `!=`, `!==`, `>`, `<`, `&&`, `||`

### 🔁 Control Structures
- `if`, `else if`, `else`
- `switch`  
- Loops: `for`, `while`, `do...while`, `forEach`

### 🛠️ Functions
```javascript
function greet(name) {
  return "Hello " + name;
}
```

### 📦 Arrays & Objects
```javascript
let arr = [1, 2, 3];
let obj = {name: "TCS", type: "Company"};
```

### 🔄 DOM Manipulation
- `document.getElementById("id")`
- `document.querySelector(".class")`
- `element.innerHTML`, `style.property`, `classList.add()`

### 🎯 Events
- `onclick`, `onchange`, `onmouseover`, `onkeydown`

### ✅ MCQ Tips
- `==` checks value; `===` checks value **and** type.
- `NaN` is **not equal** to `NaN`.
- Functions can be nested or assigned to variables.
- `setTimeout(fn, ms)` delays execution.
- `alert()`, `confirm()`, `prompt()` are built-ins.

---

## 💡 TCS IPA Exam Focus

| Concept                  | Often Asked Questions                  |
|--------------------------|----------------------------------------|
| HTML Forms               | Attributes like `method`, `action`     |
| CSS Selectors            | Specificity, `!important`, pseudo-classes |
| Box Model                | Order of margin/border/padding         |
| JS Comparison            | Difference between `==` and `===`      |
| JS Events                | DOM manipulation, event handlers       |
| Tag Usage                | Semantic vs non-semantic tags          |
| Positioning              | `relative`, `absolute`, etc.           |
| Flex/Grid Layout         | Properties like `justify-content`      |
