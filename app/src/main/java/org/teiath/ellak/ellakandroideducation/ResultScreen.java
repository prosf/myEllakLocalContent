package org.teiath.ellak.ellakandroideducation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * H ResultScreen παρουσιάζει στον χρήστη τα αποτελέσματα της εκπαίδευσης / εξέτασής του. Συγκεκριμένα παρουσιάζει: <lu>
 *     <li>Το γνωστικό αντικείμενο εξέτασης</li>
 *     <li>Τον ορισμένο χρόνο εξέτασης</li>
 *     <li>Το πλήθος των ερωτήσεων του ερωτηματολογίου</li>
 *     <li>Το πλήθος των ερωτήσεων που απαντήθηκαν</li>
 *     <li>Το πλήθος των ερωτήσεων που απαντήθηκαν σωστά</li>
 *     <li>Το πλήθος των ερωτήσεων που απαντήθηκαν λανθασμένα</li>
 *     <li>Τη βαθμολογία του χρήστη (ποσοστό σωστών απαντήσεων σε σχέση με το συνολικό αριθμό ερωτήσεων</li>
 *     <li>Αποτέλεσμα εξέτασης "Επιτυχία / Αποτυχία" (μόνο σε κατάσταση εξέτασης).</li>
 * </lu>
 * H Result Screen οδηγεί στην Option Screen.
 */



public class ResultScreen extends Activity
{

    TextView TxtMode,                     //Κατάσταση λειτουργίας( Εκπαίδευση / Αξιολόγηση)
             LblSubject,TxtSubject,       //γνωστικό αντικείμενο
             LblPreTime,TxtPreTime,       //χρόνος εξέτασης
             LblSquestions,TxtSquestions, //συνολικές ερωτήσεις
             LblAquestions,TxtAquestions, //απαντήθηκαν
             LblRquestions,TxtRquestions, //σωστές απαντήσεις
             LblFquestions,TxtFquestions, //λανθασμένες απαντήσεις
             LblGrade,TxtGrade,           //βαθμός
             LblResult,TxtResult;         // αποτέλεσμα για το εάν πέρασε ή όχι


    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_result);
                                                       //Αντιστοίχιση με τα  TextViews του lay_result
        TxtMode  = (TextView) findViewById(R.id.TxtMode);
        TxtSubject = (TextView) findViewById(R.id.TxtSubject);
        TxtPreTime = (TextView) findViewById(R.id.TxtPreTime);
        TxtSquestions = (TextView) findViewById(R.id.TxtSquestions);
        TxtAquestions = (TextView) findViewById(R.id.TxtAquestions);
        TxtRquestions = (TextView) findViewById(R.id.TxtRquestions);
        TxtFquestions = (TextView) findViewById(R.id.TxtFquestions);
        TxtGrade = (TextView) findViewById(R.id.TxtGrade);
        TxtResult = (TextView) findViewById(R.id.TxtResult);



        Intent myintent = getIntent();      //ετοιμαζουμε το intent και τα getextras που θα παρουμε απο τα άλλα activities
        String Mode = myintent.getStringExtra("Mode");
        String Subject = myintent.getStringExtra("Subject");
        String PreTime = myintent.getStringExtra("Pretime");
        String Squestions = myintent.getStringExtra("Squestions");
        String Aquestions = myintent.getStringExtra("Aquestions");
        String Rquestions = myintent.getStringExtra("Rquestions");
        String Fquestions = myintent.getStringExtra("Fquestions");
                                            //Population των TextViews με τις τιμές που πήραμε απ'το intent
        TxtMode.setText (Mode);
        TxtSubject.setText (Subject);
        TxtPreTime.setText (PreTime);
        TxtSquestions.setText (Squestions);
        TxtAquestions.setText (Aquestions);
        TxtRquestions.setText (Rquestions);
        TxtFquestions.setText (Fquestions);


    }


}
