# Q13 — Application Boot and Production Build

## Run in development
```bash
npm install
npm run dev
```

## Create and preview the production build
```bash
npm run build
npm run preview
```
Open the preview URL shown in the terminal and take screenshots of the `dist` folder plus the running build. In `index.html`, the page title is set to `Q13 - React Production Build`. `src/main.jsx` logs a startup message and wraps App in `React.StrictMode`. React StrictMode can run development-only checks twice, so the console message may appear more than once in development.
