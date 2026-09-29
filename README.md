# Frame & Thread

A small clothing and photography journal, built for the Ship-It project using OpenAI Codex. It pairs three credited reference photographs with short observations about style, texture, and composition.

## Run it

Open `dist/index.html` in a browser. No installation or build is required. For a local server, run `python3 -m http.server 4173 --directory dist` from this folder and visit http://localhost:4173.

An internet connection loads the reference photos and Google Fonts. The layout and text work offline, with fallback fonts; the photos do not.

## Use it

- Select **Explore the journal** to reach the photo entries.
- Select **About** to read the project’s purpose.
- Open **Photo credits** for original sources and licenses.
- Try it on a narrow phone screen or navigate using Tab and Enter.

![Frame & Thread website](docs/screenshot.png)

## Files

- `dist/index.html`: journal content and semantic HTML.
- `dist/style.css`: responsive layout and styling.
- `dist/credits.html`: photographer attribution.
- `AI-NOTES.md`: observed agent mistakes and corrections.
- `DEMO.md`: two-minute presentation outline.

## Scope and authorship

This is a static journal, with no account, database, upload form, or visitor tracking. Sample photography is credited on the website; it is not presented as the student's own. Replace the images and writing with your own work if desired. Codex wrote the initial website and these documentation drafts. The student should review the files and add their own observations before submission.

## Submission

The assignment requires a **public repository**. A private Sites deployment alone does not satisfy that requirement. Push this whole folder, including `docs/screenshot.png`, `AI-NOTES.md`, and `DEMO.md`, to your public repository. A repository destination has not yet been provided.
