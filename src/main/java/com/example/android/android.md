
<font color="red">Interview Questions And Answers</font>
---------

<font color="blue">Android</font>
---------
1) Explain android lifecycle and its various scenario
- App Started,Minimized,Background Running,Minimized and Then Reopened
- Ans acronym -- CSRPSD
- App Started: When the app is launched, the sequence of method calls is onCreate(), onStart(), and onResume().
- Minimized: When the app is minimized (but still running in the background), the sequence of method calls is onPause() and onStop().
- Background Running: When the app is running in the background (not visible to the user), but hasn't been stopped or destroyed, the sequence of method calls is onStop().
- Minimized and Then Reopened: If the app is minimized and then reopened, the sequence of method calls is onRestart(), onStart(), and onResume().
- Image

2) Explain the Android architecture
- The main components of an Android application are:
- Activities,Services,Broadcast Receivers,Content Providers
- to be done later

3) Differentiate between Activity and Fragment.
- 

<font color="blue">Kotlin</font>
---------