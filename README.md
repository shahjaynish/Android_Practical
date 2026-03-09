## Notes App For Android

- First Is a Home Screen Which will be visible to USer with a background Image and the image will disappear when user adds any Notes
- So We will verfiy it from adapter as we save titles in Adapter so we will verify it with condition That if list size >=1 hide image
- I will folloe MVVM(Mode View View-Model architecture as it keeps business logic separea and also is very easy if another deveoper wants to make changes in other developers code
- And We will show list of User's Notes with the help of a recycler view and also pass background color for notes randomly according to figma and also i will kepp onclick function in adapter so if user wants to click any particular notre and edit it
- When user will delete any note we will do list -1 in db so when user deletes all notes background image is also shown
- User will be able to save notes and title and edit it
- User will be asked if he wants to save note or discard it with the help of a dialog Box
- If User clicks discard we will not save the notes or changes and dismiss the dialog
- If User clicks save we will save notes in our db and show its title on Home Page
- Also we have added search functionality so user can search the note he want to search
- So if we were to use db for this we will use firebase database and connect our app with firebase
