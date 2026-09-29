# AI development notes

Agent: **OpenAI Codex**, in the Codex desktop app. Codex produced this draft from the actual build session. These are agent-observed events, not claims that the student personally discovered or fixed them. Student review and reflection are still needed.

## What it got right

- Kept the idea small: a static clothing and photography journal using HTML and CSS.
- Connected both interests through captions about silhouettes, fabric detail, and composition.
- Added responsive styling, image descriptions, keyboard focus indicators, a skip link, and reduced-motion support.
- Found reference photographs and credited their creators rather than inventing personal photography or biographical claims.

## Actual mistakes and corrections

### 1. An unsupported registered-trademark symbol

The first HTML draft put an `®` beside the invented Frame & Thread title. There was no evidence of trademark registration. During source review, Codex removed the symbol before the preview. This was a content-accuracy failure: a familiar visual convention made an unsupported claim. The correction was checked directly in the HTML. Lesson: review decorative symbols and marketing copy as factual claims, not just design choices.

### 2. Assuming Node was available as `node`

The first attempt to save the Site identity used `node`, but the shell returned `command not found`. The local environment had a bundled Node executable outside the default command path. Codex located that runtime and reran the helper with its full path; it reported `manifest_persisted: true`. This was a tooling assumption, not a website runtime bug. Lesson: distinguish a missing command-path entry from a missing runtime, and use the environment's documented tools.

### 3. A portrait crop cut off the subject’s face

The desktop screenshot revealed that the wide third image used a centered crop, cutting off the subject’s face. The mobile portrait crop looked fine, so checking only a phone view would have missed it. Codex changed the image’s object-position to favor the upper portion, then captured the desktop screenshot again. Lesson: a responsive layout can fit without preserving a photograph’s composition; inspect the actual subject at different shapes.

## Verification

Browser checks confirmed all three photos loaded, the journal link reached `#journal`, the credits page opened, and a 390-pixel viewport had no horizontal overflow. Desktop and mobile screenshots were inspected. The first automated-browser attempt failed because its bundled browser binary was absent; the check was rerun using installed Chrome.

## Limitations worth testing and discussing

- Photos and web fonts depend on outside services. The README documents this rather than promising offline photography.
- Reference images make the demo work but do not make it a personal photographic portfolio. Replace them with original work before making authorship claims.
- A private hosted preview is not the public repository required by the assignment. Publishing source is a separate submission step.
- This static site has reading and navigation interactions only. It does not save or upload photographs.

## Student reflection — complete before submission

Add what you personally asked the agent to change, what you tested, what confused you, and what you learned. Explain at least one source change in your own words. Do not invent failures or claim agent-performed checks as your own.
